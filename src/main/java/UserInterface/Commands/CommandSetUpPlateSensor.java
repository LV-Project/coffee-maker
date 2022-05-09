package UserInterface.Commands;

import Components.Component;
import Controller.BrewController;
import UserInterface.Command;
import UserInterface.IUserInterface;
import Enum.PlateWarmerStates;

import java.util.List;

public class CommandSetUpPlateSensor implements Command {
    private IUserInterface _userInterface;
    private BrewController _brewController;
    public CommandSetUpPlateSensor(IUserInterface userInterface, BrewController brewController){
        _userInterface=userInterface;
        _brewController=brewController;
    }
    @Override
    public void execute() {
        System.out.println("PLate heater working pot is not empty!");
        _brewController.get_listenerPlateSensor().getPlateSensor().setPlateWarmerStates(PlateWarmerStates.POT_NOT_EMPTY);
        List<Component> var = _userInterface.getComponentManager().getComponents();
        var.stream().filter(a->a.getName().equals("PlateHeater")).findFirst().orElse(null).activate();
    }

    @Override
    public int getCode() {
        return 9;
    }
}
