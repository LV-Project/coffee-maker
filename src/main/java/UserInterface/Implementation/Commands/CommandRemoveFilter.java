package UserInterface.Implementation.Commands;

import Components.Interfaces.Component;
import UserInterface.IUserInterface;
import UserInterface.Implementation.Command;

import java.util.List;

public class CommandRemoveFilter implements Command {
    private IUserInterface _userInterface;

    public CommandRemoveFilter(IUserInterface userInterface) {
        _userInterface = userInterface;
    }
    @Override
    public void execute() {
        System.out.println("Do you want to remove the filter? (Y/n)");
        String input = _userInterface.getFastReader().nextLine();
        input=input.toUpperCase();
        if(input.equals("")||input.equals("Y")||input.equals("YES")){
            List<Component> var = _userInterface.getComponentManager().getComponents();
            var.stream().filter(a->a.getName().equals("Filter")).findFirst().orElse(null).deactivate();
        }
    }

    @Override
    public int getCode() {
        return 0;
    }
}
