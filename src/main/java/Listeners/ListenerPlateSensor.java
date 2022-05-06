package Listeners;

import Components.Component;
import Model.PlateSensor;
import Enum.PlateWarmerStates;
public class ListenerPlateSensor {
    private PlateSensor _plateSensor;
    public ListenerPlateSensor(PlateSensor plateSensor){
        _plateSensor=plateSensor;
    }
    public boolean ready(){
        return _plateSensor.getPlateWarmerStates()== PlateWarmerStates.POT_NOT_EMPTY;
    }
    public boolean SetUp(){
        return _plateSensor.getPlateWarmerStates()== PlateWarmerStates.POT_EMPTY;
    }

    public PlateSensor getPlateSensor() {
        return _plateSensor;
    }

    public void setPlateSensor(PlateSensor _plateSensor) {
        this._plateSensor = _plateSensor;
    }
}
