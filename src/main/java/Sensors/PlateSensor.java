package Sensors;

import Containers.Pot;
import Containers.PotStates;
import Containers.PressureValve;

public class PlateSensor implements Sensor {

    PotStates potStates;
    Pot pot;
    String status = "";
    PressureValve pressureValve;


    public PlateSensor(Pot pot, PotStates potStates, PressureValve pressureValve) {
        this.pot = pot;
        this.potStates = potStates;
        this.pressureValve = pressureValve;
    }

    boolean trigger() {
        if (pot.getCurrentState().equals(PotStates.POT_EMPTY)) {
            status = "Plate Sensor: Pot is empty";
            pressureValve.open();
            return true;
        } else if (pot.getCurrentState()==(PotStates.POT_NOT_EMPTY)||pot.getCurrentState()==(PotStates.WARMER_EMPTY)) {
            status = "Plate Sensor: Pot is not empty";
            pressureValve.close();
            return false;
        }

    return false;
    }

    @Override
    public boolean status() {
        return trigger();
    }
}
