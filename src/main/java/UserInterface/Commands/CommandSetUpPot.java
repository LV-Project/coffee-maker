package UserInterface.Commands;

import Components.Component;
import Controller.BrewController;
import Model.PlateSensor;
import UserInterface.Command;
import UserInterface.IUserInterface;
import Enum.PlateWarmerStates;
import java.util.List;

public class CommandSetUpPot implements Command {
    private BrewController _brewController;
    private IUserInterface _userInterface;
    public CommandSetUpPot(BrewController brewController, IUserInterface userInterface){
        _brewController=brewController;
        _userInterface=userInterface;
    }
    @Override
    public void execute() {
        System.out.println("Do you want to set up the pot? (Y/n)");
        String input = _userInterface.getFastReader().nextLine();
        input=input.toUpperCase();
        if(input.equals("")||input.equals("Y")||input.equals("YES")){
            List<Component> var = _userInterface.getComponentManager().getComponents();
            var.stream().filter(a->a.getName().equals("Pot")).findFirst().orElse(null).activate();
            _brewController.get_listenerPlateSensor().getPlateSensor().setPlateWarmerStates(PlateWarmerStates.POT_NOT_EMPTY);
        }
    }

    @Override
    public int getCode() {
        return 5;
    }
}
