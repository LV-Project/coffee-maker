package UserInterface.Implementation.Commands;

import Model.Boiler;
import Model.Pot;
import UserInterface.Implementation.Command;

public class CommandExecuteGeneralStatus implements Command {
    Boiler boiler;
    Pot pot;

    public CommandExecuteGeneralStatus(Boiler boiler, Pot pot){
        this.boiler=boiler;
        this.pot=pot;
    }

    @Override
    public void execute() {
        System.out.println(boiler.getCurrentState());
        System.out.println(boiler.getWaterLevel());;
        System.out.println(pot.getCurrentState());
    }

    @Override
    public int getCode() {
        return 1;
    }
}
