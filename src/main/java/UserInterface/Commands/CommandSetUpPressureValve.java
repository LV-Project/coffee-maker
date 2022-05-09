package UserInterface.Commands;

import Components.Component;
import UserInterface.Command;
import UserInterface.IUserInterface;

import java.util.List;

public class CommandSetUpPressureValve implements Command {
    private IUserInterface _userInterface;

    public CommandSetUpPressureValve(IUserInterface userInterface) {
        _userInterface = userInterface;
    }
    @Override
    public void execute() {
        System.out.println("Do you want to set up the pressure valve? (Y/n)");
        String input = _userInterface.getFastReader().nextLine();
        input=input.toUpperCase();
        if(input.equals("")||input.equals("Y")||input.equals("YES")){
            List<Component> var = _userInterface.getComponentManager().getComponents();
            var.stream().filter(a->a.getName().equals("PressureValve")).findFirst().orElse(null).activate();
        }
    }

    @Override
    public int getCode() {
        return 4;
    }
}
