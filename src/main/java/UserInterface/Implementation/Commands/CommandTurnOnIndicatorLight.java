package UserInterface.Implementation.Commands;

import Components.Interfaces.Component;
import UserInterface.IUserInterface;
import UserInterface.Implementation.Command;

import java.util.List;

public class CommandTurnOnIndicatorLight implements Command {
    private IUserInterface _userInterface;
    public CommandTurnOnIndicatorLight(IUserInterface userInterface){
        _userInterface=userInterface;
    }
    @Override
    public void execute() {
        List<Component> var = _userInterface.getComponentManager().getComponents();
        var.stream().filter(a->a.getName().equals("IndicatorLight")).findFirst().orElse(null).activate();
    }

    @Override
    public int getCode() {
        return 7;
    }
}
