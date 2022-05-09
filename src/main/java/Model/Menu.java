package Model;

import UserInterface.Command;

public class Menu {
    private String name;
    private Command command;
    private int code;

    public Menu(String name, Command command, int code) {
        this.name = name;
        this.command = command;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
