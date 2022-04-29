package Sensors;

import Containers.Pot;
import Containers.PotStates;

public class PlateSensor implements Sensor {

    PotStates potStates;
    Pot pot;
    String status = "";


    public PlateSensor(Pot pot, PotStates potStates) {
        this.pot = pot;
        this.potStates = potStates;
    }

    boolean trigger() {
        if (pot.getCurrentState().equals(PotStates.POT_EMPTY)) {
            status = "Plate Sensor: Pot is empty";
            return true;
        } else if (pot.getCurrentState()==(PotStates.POT_NOT_EMPTY).toString()||pot.getCurrentState()==(PotStates.WARMER_EMPTY).toString()) {
            status = "Plate Sensor: Pot is not empty";
            return false;
        }

    return false;
    }

    @Override
    public boolean status() {
        return trigger();
    }
}
