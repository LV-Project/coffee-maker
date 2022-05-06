package UserInterface.Commands;

import Components.Component;
import UserInterface.IUserInterface;
import UserInterface.Command;

import java.util.List;

public class CommandTurnOnStartButton implements Command {
    private IUserInterface _userInterface;
    public CommandTurnOnStartButton(IUserInterface userInterface){
        _userInterface=userInterface;
    }
    @Override
    public void execute() {
        List<Component> var = _userInterface.getComponentManager().getComponents();
        var.stream().filter(a->a.getName().equals("StartButton")).findFirst().orElse(null).activate();
    }

    @Override
    public int getCode() {
        return 3;
    }
}
