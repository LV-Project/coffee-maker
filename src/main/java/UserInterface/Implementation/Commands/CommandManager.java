package UserInterface.Implementation.Commands;

import Model.Boiler;
import Enum.BoilerStates;
import Model.Pot;
import Enum.PotStates;
import UserInterface.IUserInterface;
import UserInterface.Implementation.Command;
import java.util.ArrayList;
import java.util.List;

public class CommandManager {
    private List<Command> commandList;
    private IUserInterface _userInterface;

//    private final Boiler boiler = new Boiler(BoilerStates.BOILER_EMPTY);
//    private final Pot pot = new Pot(PotStates.WARMER_EMPTY);

    public CommandManager(IUserInterface userInterface) {
        _userInterface=userInterface;
        initializeCommands();
    }

    public void initializeCommands(){
        commandList= new ArrayList<>();
        commandList.add(new CommandSetUpFilter(_userInterface));
        commandList.add(new CommandRemoveFilter(_userInterface));
        commandList.add(new CommandExecuteFilter(_userInterface));
        commandList.add(new CommandSetUpDeliveryPipe(_userInterface));
        commandList.add(new CommandRemoveDeliveryPipe(_userInterface));
        commandList.add(new CommandExecuteDeliveryPipe(_userInterface));
        commandList.add(new CommandTurnOnIndicatorLight(_userInterface));
        commandList.add(new CommandTurnOffIndicatorLight(_userInterface));
        commandList.add(new CommandExecuteIndicatorLight(_userInterface));
        commandList.add(new CommandTurnOnStartButton(_userInterface));
        commandList.add(new CommandTurnOffStartButton(_userInterface));
        commandList.add(new CommandExecuteStartButton(_userInterface));
        commandList.add(new CommandMainMenu(_userInterface));
        commandList.add(new CommandExit());
    }
    public Command findByCode(int commandCode){
        return commandList.stream().filter(a->a.getCode()==commandCode).findFirst().orElseThrow(()-> new RuntimeException("Command not found"));
    }

}
