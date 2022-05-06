package UserInterface.Implementation.Commands;

import UserInterface.IUserInterface;
import UserInterface.Implementation.Command;

public class CommandMainMenu implements Command {
    private IUserInterface _userInterface;
    public CommandMainMenu(IUserInterface userInterface){
        _userInterface=userInterface;
    }
    @Override
    public void execute() {
        _userInterface.showOptionsForTheUser();
        System.out.println("Welcome to the Coffee Maker!");
        System.out.println("Please set up the machine");
        int commandCode=_userInterface.getFastReader().nextInt();
        Command command = _userInterface.getMenuManager().getMenus().stream().filter(a->a.getCode()==commandCode).findFirst()
                .orElseThrow(()->new RuntimeException("Command not found")).getCommand();
        command.execute();
    }

    @Override
    public int getCode() {
        return 0;
    }
}
