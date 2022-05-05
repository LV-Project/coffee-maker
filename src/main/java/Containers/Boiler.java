package Containers;

import Sensors.WaterSensor;

public class Boiler {
    BoilerStates currentState;
    WaterSensor waterSensor;
    //TODO optional! Water Level class to add water to the coffemaker - The boiler will have an instance of the WL class.

    public Boiler(BoilerStates currentState) {
        this.currentState = currentState;
        this.waterSensor = new WaterSensor();
    }

    public BoilerStates getCurrentState() {
        return currentState;
    }

    public void setCurrentState(BoilerStates currentState) {
        this.currentState = currentState;
    }

    public int getWaterLevel() {
        return waterSensor.getWaterLevel();
    }



}
