package UserInterface.Commands;

import Controller.BrewController;
import UserInterface.Command;
import UserInterface.IUserInterface;

public class CommandWaitMenu implements Command {
    private IUserInterface _userInterface;
    private BrewController _brewController;
    public CommandWaitMenu(IUserInterface userInterface,BrewController brewController){
        _userInterface=userInterface;
        _brewController=brewController;
    }
    @Override
    public void execute() {
        if(!_brewController.needToSetUp().isEmpty()){
            _userInterface.print(_brewController.needToSetUp().toString());
            _userInterface.showOptionsForTheUser();
            System.out.println("Please set up the machine");
        }else{
            System.out.println("Coffee is ready");
            Command command = _userInterface.getMenuManager().getMenus().stream().filter(a -> a.getCode() == 10).findFirst()
                    .orElseThrow(() -> new RuntimeException("Command not found")).getCommand();
            command.execute();
        }
        int commandCode = _userInterface.getFastReader().nextInt();
        Command command = _userInterface.getMenuManager().getMenus().stream().filter(a -> a.getCode() == commandCode).findFirst()
                .orElseThrow(() -> new RuntimeException("Command not found")).getCommand();
        command.execute();
    }
    @Override
    public int getCode() {
        return 7;
    }
}