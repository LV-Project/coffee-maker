package UserInterface.Implementation.Commands;

import UserInterface.IUserInterface;
import UserInterface.Implementation.Command;

import java.util.ArrayList;
import java.util.List;

public class CommandManager {
    private List<Command> commandList;
    private IUserInterface _userInterface;

    public CommandManager(IUserInterface userInterface) {
        _userInterface=userInterface;
        initializeCommands();
    }

    public void initializeCommands(){
        commandList= new ArrayList<>();
        commandList.add(new CommandFilter(_userInterface));
    }
    public Command findByCode(int commandCode){
        return commandList.stream().filter(a->a.getCode()==commandCode).findFirst().orElseThrow(()-> new RuntimeException("Command not found"));
    }

}
