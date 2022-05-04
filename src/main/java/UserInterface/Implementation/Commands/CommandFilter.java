package UserInterface.Implementation.Commands;

import Components.Interfaces.Component;
import UserInterface.IUserInterface;
import UserInterface.Implementation.Command;

import java.util.List;

public class CommandFilter implements Command {
    private IUserInterface _userInterface;

    public CommandFilter(IUserInterface userInterface) {
        _userInterface = userInterface;
    }

    @Override
    public void execute() {
        System.out.println("Do you want to set up the filter? (Y/n)");
        String input = _userInterface.getFastReader().nextLine();
        input=input.toUpperCase();
        if(input.equals("")||input.equals("Y")||input.equals("YES")){
            List<Component> var = _userInterface.getComponentManager().getComponents();
            var.stream().filter(a->a.getName().equals("Filter")).findFirst().orElse(null).setUp();
        }
    }

    @Override
    public int getCode() {
        return 1;
    }
}
