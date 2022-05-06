package Listeners;

import Enum.BoilerStates;
import Model.WaterSensor;


public class ListenerWaterSensor{
    private WaterSensor _waterSensor;
    public ListenerWaterSensor(WaterSensor waterSensor){
        _waterSensor=waterSensor;
    }
    public boolean ready(){
        return _waterSensor.getBoilerStates()== BoilerStates.BOILER_NOT_EMPTY;
    }
    public boolean SetUp(){
        return _waterSensor.getBoilerStates()== BoilerStates.BOILER_EMPTY;
    }

    public WaterSensor getWaterSensor() {
        return _waterSensor;
    }

    public void setWaterSensor(WaterSensor _waterSensor) {
        this._waterSensor = _waterSensor;
    }
}
