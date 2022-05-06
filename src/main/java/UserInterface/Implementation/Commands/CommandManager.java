package UserInterface.Implementation.Commands;

import Containers.Boiler;
import Containers.BoilerStates;
import Containers.Pot;
import Containers.PotStates;
import UserInterface.IUserInterface;
import UserInterface.Implementation.Command;

import java.util.ArrayList;
import java.util.List;

public class CommandManager {
    private List<Command> commandList;
    private IUserInterface _userInterface;

    private final Boiler boiler = new Boiler(BoilerStates.BOILER_EMPTY);
    private final Pot pot = new Pot(PotStates.WARMER_EMPTY);

    public CommandManager(IUserInterface userInterface) {
        _userInterface=userInterface;
        initializeCommands();
    }

    public void initializeCommands(){
        commandList= new ArrayList<>();
        commandList.add(new CommandSetUpFilter(_userInterface));
        commandList.add(new CommandExecuteDeliveryPipe());
        commandList.add(new CommandTurnOnIndicatorLight());
        commandList.add(new CommandExecuteStartButton());
        commandList.add(new CommandExecuteGeneralStatus(boiler, pot));
    }
    public Command findByCode(int commandCode){
        return commandList.stream().filter(a->a.getCode()==commandCode).findFirst().orElseThrow(()-> new RuntimeException("Command not found"));
    }

}
