package Sensors;

import Containers.Pot;
import Containers.PotStates;
import Heaters.Heater;
import Heaters.ValveSwitch;

public class PlateSensor implements Sensor {


    Pot pot;
    String status = "";
    Heater plateH;
    Heater valve;

    public PlateSensor(Pot pot, Heater plateH, Heater valve) {
        this.pot = pot;
        this.plateH = plateH;
        this.valve=valve;
    }
    @Override
    public void trigger() {
        if (pot.getCurrentState().equals(PotStates.POT_EMPTY)) {
            status = "Plate Sensor: Pot is empty";
            plateH.setOff();
            valve.setOff();

        } else if (pot.getCurrentState()==(PotStates.POT_NOT_EMPTY)||pot.getCurrentState()==(PotStates.WARMER_EMPTY)) {
            status = "Plate Sensor: Pot is not empty";
            plateH.setOn();
            valve.setOn();
        }
    }


}
