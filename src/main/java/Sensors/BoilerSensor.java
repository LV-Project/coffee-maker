package Sensors;

import Containers.Boiler;
import Containers.BoilerStates;
import Containers.Pot;
import Heaters.BoilerHeater;

public class BoilerSensor implements Sensor {

    BoilerStates boilerStates;
    private Boiler boiler;
    boolean myStatus;

    public BoilerSensor(Boiler boiler) {
        this.boiler = boiler;
        //this.boilerStates = boilerStates;
    }

    public boolean trigger(String status) {
        return myStatus=boiler.getCurrentState().equals(status);
//        if (myStatus=boiler.getCurrentState().equals(status)) {
//            myStatus=true;
//            return true;
//        } else if (boiler.getCurrentState().equals(status)) {
//            myStatus=false;
//            return false;
//        }
//        return false;
    }

    @Override
    public boolean status() {
        return myStatus;
    }
}

