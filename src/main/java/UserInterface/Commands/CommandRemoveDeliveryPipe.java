package UserInterface.Commands;

import Components.Component;
import UserInterface.IUserInterface;
import UserInterface.Command;

import java.util.List;

public class CommandRemoveDeliveryPipe implements Command {
    private IUserInterface _userInterface;
    public CommandRemoveDeliveryPipe(IUserInterface userInterface){
        _userInterface=userInterface;
    }
    @Override
    public void execute() {
        List<Component> var = _userInterface.getComponentManager().getComponents();
        var.stream().filter(a->a.getName().equals("DeliveryPipe")).findFirst().orElse(null).deactivate();
    }

    @Override
    public int getCode() {
        return -1;
    }
}
