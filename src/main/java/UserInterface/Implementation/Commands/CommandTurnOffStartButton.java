package UserInterface.Implementation.Commands;

import Components.Interfaces.Component;
import UserInterface.IUserInterface;
import UserInterface.Implementation.Command;

import java.util.List;

public class CommandTurnOffStartButton implements Command {
    private IUserInterface _userInterface;
    public CommandTurnOffStartButton(IUserInterface userInterface){
        _userInterface=userInterface;
    }
    @Override
    public void execute() {
        List<Component> var = _userInterface.getComponentManager().getComponents();
        var.stream().filter(a->a.getName().equals("StartButton")).findFirst().orElse(null).deactivate();
    }

    @Override
    public int getCode() {
        return 11;
    }
}
