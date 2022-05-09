package UserInterface.Commands;

import Controller.BrewController;
import UserInterface.IUserInterface;
import UserInterface.Command;

public class CommandMainMenu implements Command {
    private IUserInterface _userInterface;
    private BrewController _brewController;
    public CommandMainMenu(IUserInterface userInterface, BrewController brewController){
        _userInterface=userInterface;
        _brewController=brewController;
    }
    @Override
    public void execute() {
        _brewController.get_listenerWaterSensor().getWaterSensor().checkWaterLevel();
        _userInterface.getComponentManager().findByName("StartButton").deactivate();
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
