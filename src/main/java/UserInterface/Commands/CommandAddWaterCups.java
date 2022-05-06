package UserInterface.Commands;

import Controller.BrewController;
import Listeners.ListenerWaterSensor;
import Model.WaterSensor;
import UserInterface.IUserInterface;
import UserInterface.Command;

public class CommandAddWaterCups implements Command {
    private BrewController _brewController;
    private IUserInterface _userInterface;
    public CommandAddWaterCups(BrewController brewController, IUserInterface userInterface){
        _brewController=brewController;
        _userInterface=userInterface;
    }

    @Override
    public void execute() {
        System.out.println("How many cups of water you want to add?");
        int waterCups=_userInterface.getFastReader().nextInt();
        _brewController.get_listenerWaterSensor().getWaterSensor().addWaterCups(waterCups);
        System.out.println("Water ready!");
    }

    @Override
    public int getCode() {
        return 2;
    }
}
