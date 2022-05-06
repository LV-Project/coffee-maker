package Sensors;

import Model.Boiler;
import Enum.BoilerStates;
import Switchers.Switch;

public class BoilerSensor implements Sensor {

    private BoilerStates boilerStates;
    private Boiler boiler;
    private Switch boilerSwitch;

    // TODO CESAR y LUIS BECERRA implementar water level modelo que tendra un water sensor, que pregunta al boiler la media del agua
    // TODO CESAR y LUIS BECERRA TODO implementar valvula de presion de acuerdo al estado brindado por el plate sensor del pot


    public BoilerSensor(Boiler boiler, Switch boilerSwitch) {
        this.boiler = boiler;
        this.boilerSwitch = boilerSwitch;
        //this.boilerStates = boilerStates;
    }

    @Override
    public void trigger() {
        if (boiler.getCurrentState().equals(boilerStates.BOILER_NOT_EMPTY)) {
            boilerSwitch.setOn();
        } else if (boiler.getCurrentState().equals(boilerStates.BOILER_EMPTY)) {
            boilerSwitch.setOff();
        }
    }

}

