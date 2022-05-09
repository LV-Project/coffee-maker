package UserInterface.Commands;

import Components.Component;
import Controller.BrewController;
import UserInterface.IUserInterface;
import UserInterface.Command;

import java.util.List;
import java.util.Set;

public class CommandTurnOnStartButton implements Command {
    private IUserInterface _userInterface;
    private BrewController _brewController;
    public CommandTurnOnStartButton(IUserInterface userInterface,BrewController brewController){
        _userInterface=userInterface;
        _brewController=brewController;
    }
    @Override
    public void execute() {

        Set<String> status=_brewController.checkStatusProcess();
        for (String varStatus:status
             ) {
            try {
                Thread.sleep(1000);
                System.out.println(varStatus);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }

        }
        if(_brewController.checkAllProcessToContinue()) {
            List<Component> var = _userInterface.getComponentManager().getComponents();
            var.stream().filter(a -> a.getName().equals("StartButton")).findFirst().orElse(null).activate();
        }else{
            System.out.println("Coffee maker is not set up yet");
        }
    }

    @Override
    public int getCode() {
        return 3;
    }
}
