package UserInterface.Commands;

import Controller.BrewController;
import Listeners.ListenerWaterSensor;
import UserInterface.IUserInterface;
import UserInterface.Command;
import java.util.ArrayList;
import java.util.List;

public class CommandManager {
    private List<Command> commandList;
    private IUserInterface _userInterface;
    private BrewController _brewController;


    public CommandManager(IUserInterface userInterface, BrewController brewController) {
        _userInterface=userInterface;
        _brewController=brewController;
        initializeCommands();
    }

    public void initializeCommands(){
        commandList= new ArrayList<>();
        commandList.add(new CommandSetUpFilter(_userInterface));
        commandList.add(new CommandAddWaterCups(_brewController,_userInterface));
        commandList.add(new CommandWaitMenu(_userInterface,_brewController));
        commandList.add(new CommandSetUpPressureValve(_userInterface));
        commandList.add(new CommandSetUpPot(_brewController,_userInterface));
        commandList.add(new CommandRemoveFilter(_userInterface));
        commandList.add(new CommandExecuteFilter(_userInterface));
        commandList.add(new CommandSetUpPlateSensor(_userInterface,_brewController));
        commandList.add(new CommandSetUpDeliveryPipe(_userInterface));
        commandList.add(new CommandRemoveDeliveryPipe(_userInterface));
        commandList.add(new CommandExecuteDeliveryPipe(_userInterface));
        commandList.add(new CommandTurnOnIndicatorLight(_userInterface));
        commandList.add(new CommandTurnOffIndicatorLight(_userInterface));
        commandList.add(new CommandExecuteIndicatorLight(_userInterface));
        commandList.add(new CommandTurnOnStartButton(_userInterface));
        commandList.add(new CommandTurnOffStartButton(_userInterface));
        commandList.add(new CommandExecuteStartButton(_userInterface));
        commandList.add(new CommandMainMenu(_userInterface,_brewController));
        commandList.add(new CommandExit());
    }
    public Command findByCode(int commandCode){
        return commandList.stream().filter(a->a.getCode()==commandCode).findFirst().orElseThrow(()-> new RuntimeException("Command not found"));
    }

}
