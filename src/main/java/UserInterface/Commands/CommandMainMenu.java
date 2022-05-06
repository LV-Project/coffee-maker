package UserInterface.Commands;

import UserInterface.IUserInterface;
import UserInterface.Command;

public class CommandMainMenu implements Command {
    private IUserInterface _userInterface;
    public CommandMainMenu(IUserInterface userInterface){
        _userInterface=userInterface;
    }
    @Override
    public void execute() {
        System.out.println("Welcome to the Coffee Maker!");
        Command command = _userInterface.getMenuManager().getMenus().stream().filter(a->a.getCode()==7).findFirst()
                .orElseThrow(()->new RuntimeException("Command not found")).getCommand();
        command.execute();
    }

    @Override
    public int getCode() {
        return 0;
    }
}
