package UserInterface.Commands;

import UserInterface.Command;

public class CommandExit implements Command {
    @Override
    public void execute() {
        System.exit(0);
    }

    @Override
    public int getCode() {
        return -1;
    }
}
