package Model;

import Enum.BoilerStates;
public class WaterSensor {
    private BoilerStates boilerStates;
    private int waterLevel;

    public WaterSensor (){
        boilerStates=BoilerStates.BOILER_EMPTY;
        waterLevel = 0;
    }

    public int getWaterLevel() {
        return waterLevel;
    }

    public void addWaterCups(int quantity){
        waterLevel=waterLevel+quantity;
        if(waterLevel>0){
            setBoilerStates(BoilerStates.BOILER_NOT_EMPTY);
        }
    }
    public void checkWaterLevel(){
        if(waterLevel<=0){
            boilerStates=BoilerStates.BOILER_EMPTY;
            System.out.println("Need more water!");
        }
        if(waterLevel>0){
            setBoilerStates(BoilerStates.BOILER_NOT_EMPTY);
            if(waterLevel>1){
                System.out.println("you can still make"+waterLevel+" cups");
            }
            else{
                System.out.println("you can still make"+waterLevel+" cup");
            }
        }

    }

    public BoilerStates getBoilerStates() {
        return boilerStates;
    }

    public void setBoilerStates(BoilerStates boilerStates) {
        this.boilerStates = boilerStates;
    }
}

