package UserInterface.Commands;

import Components.Component;
import UserInterface.IUserInterface;
import UserInterface.Command;

import java.util.List;

public class CommandTurnOffIndicatorLight implements Command {
    private IUserInterface _userInterface;
    public CommandTurnOffIndicatorLight(IUserInterface userInterface){
        _userInterface=userInterface;
    }
    @Override
    public void execute() {
        List<Component> var = _userInterface.getComponentManager().getComponents();
        var.stream().filter(a->a.getName().equals("IndicatorLight")).findFirst().orElse(null).deactivate();
    }

    @Override
    public int getCode() {
        return -1;
    }
}
