package UserInterface.Commands;

import Components.Component;
import Controller.BrewController;
import UserInterface.Command;
import Enum.*;
import UserInterface.IUserInterface;

import java.util.List;

public class CommandRemovePot implements Command {
    private IUserInterface _userInterface;
    private BrewController _brewController;
    public CommandRemovePot(IUserInterface userInterface, BrewController brewController){
        _userInterface=userInterface;
        _brewController=brewController;
    }
    @Override
    public void execute() {
        System.out.println("Do you want to remove the pot? (Y/n)");
        String input = _userInterface.getFastReader().nextLine();
        input=input.toUpperCase();
        if(input.equals("")||input.equals("Y")||input.equals("YES")){
            List<Component> var = _userInterface.getComponentManager().getComponents();
            var.stream().filter(a->a.getName().equals("Pot")).findFirst().orElseThrow(()-> new RuntimeException("Component not found")).deactivate();
            _brewController.get_listenerPlateSensor().getPlateSensor().setPlateWarmerStates(PlateWarmerStates.WARMER_EMPTY);
            System.out.println("Pot Removed");
        }
    }

    @Override
    public int getCode() {
        return 6;
    }
}
