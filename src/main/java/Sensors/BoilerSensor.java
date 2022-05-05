package Sensors;

import Containers.Boiler;
import Containers.BoilerStates;
import Containers.Pot;
import Heaters.BoilerHeater;
import Heaters.Heater;

public class BoilerSensor implements Sensor {

    BoilerStates boilerStates;
    private Boiler boiler;
    Heater boilerHeater;

    // TODO CESAR y LUIS BECERRA implementar water level modelo que tendra un water sensor, que pregunta al boiler la media del agua
    // TODO CESAR y LUIS BECERRA TODO implementar valvula de presion de acuerdo de acuerdo al estado brindado por el plate sensor del pot


    public BoilerSensor(Boiler boiler, Heater boilerHeater) {
        this.boiler = boiler;
        this. boilerHeater = boilerHeater;
        //this.boilerStates = boilerStates;
    }

    public void trigger() {
        if(boiler.getCurrentState().equals(boilerStates.BOILER_NOT_EMPTY)) {
            boilerHeater.setOn();
        } else if (boiler.getCurrentState().equals(boilerStates.BOILER_EMPTY)) {
            boilerHeater.setOff();
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
        return false;
    }
}

