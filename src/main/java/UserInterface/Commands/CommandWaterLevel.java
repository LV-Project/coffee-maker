package UserInterface.Commands;

import Model.WaterSensor;
import UserInterface.Command;

public class CommandWaterLevel implements Command {
    private WaterSensor _waterSensor;
    public CommandWaterLevel(WaterSensor waterSensor){
        _waterSensor=waterSensor;
    }
    @Override
    public void execute() {
        System.out.println("you could make "+_waterSensor.getWaterLevel()+" cups of coffee");

    }

    @Override
    public int getCode() {
        return 13;
    }
}
