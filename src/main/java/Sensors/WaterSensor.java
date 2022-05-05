package Sensors;

import Containers.WaterLevel;

import java.util.Random;

public class WaterSensor {

    private WaterLevel waterLevel;

    //Reads the water level from the sensor (randomly)
    public WaterSensor (){
        waterLevel = new WaterLevel(new Random().nextInt(12)+1);
    }

    public int getWaterLevel() {
        return waterLevel.getCurrentLevel();
    }

 }

