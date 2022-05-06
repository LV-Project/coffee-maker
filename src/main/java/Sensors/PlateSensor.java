package Sensors;

import Containers.Pot;
import Containers.PotStates;
import Containers.PressureValve;
import Switchers.Switch;

public class PlateSensor implements Sensor {
    Pot pot;
    String status = "";
    PressureValve pressureValve;
    Switch plateH;


    public PlateSensor(Pot pot, PressureValve pressureValve) {
        this.pot = pot;
        this.pressureValve = pressureValve;
    }

    @Override
    public void trigger() {
        if (pot.getCurrentState().equals(PotStates.POT_EMPTY)) {
            status = "Plate Sensor: Pot is empty";
            plateH.setOff();
            pressureValve.close();
        } else if (pot.getCurrentState()==(PotStates.POT_NOT_EMPTY)||pot.getCurrentState()==(PotStates.WARMER_EMPTY)) {
            status = "Plate Sensor: Pot is not empty";
            plateH.setOn();
            pressureValve.open();
        }
    }
}
