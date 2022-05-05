package Sensors;

import Containers.Boiler;
import Containers.BoilerStates;
import Switchers.Switch;

public class BoilerSensor implements Sensor {

    BoilerStates boilerStates;
    private Boiler boiler;
    Switch boilerSwitch;

    // TODO CESAR y LUIS BECERRA implementar water level modelo que tendra un water sensor, que pregunta al boiler la media del agua
    // TODO CESAR y LUIS BECERRA TODO implementar valvula de presion de acuerdo al estado brindado por el plate sensor del pot


    public BoilerSensor(Boiler boiler, Switch boilerSwitch) {
        this.boiler = boiler;
        this.boilerSwitch = boilerSwitch;
        //this.boilerStates = boilerStates;
    }

    public void trigger() {
        if(boiler.getCurrentState().equals(boilerStates.BOILER_NOT_EMPTY)) {
            boilerSwitch.setOn();
        } else if (boiler.getCurrentState().equals(boilerStates.BOILER_EMPTY)) {
            boilerSwitch.setOff();
        }


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

