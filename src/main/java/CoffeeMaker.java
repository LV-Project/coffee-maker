import Components.Implementation.ComponentManager;
import UserInterface.IUserInterface;
import UserInterface.Implementation.Commands.CommandManager;
import UserInterface.Implementation.MenuManager;
import UserInterface.Implementation.UserInterfaceImp;

import java.util.Scanner;

public class CoffeeMaker {
    private IUserInterface _userInterface;
    private ComponentManager _componentManager;
    private MenuManager _menuManager;
    private CommandManager _commandManager;
    public CoffeeMaker() {
        _componentManager= new ComponentManager();
        _menuManager =new MenuManager();
        _userInterface=new UserInterfaceImp(_componentManager,_menuManager);
        _commandManager = new CommandManager(_userInterface);
    }
    // TODO MARTIN PAVESIO y KEVIN CARDENAS Implementar interfaz de usuario, imprime en consola el estado de todo el flow y partes del mismo.

    // TODO KEVIN CARDENAS y MARTIN PAVESIO create implementations for the light, button, the pipe, and filter.
    // TODO Test Unitario en cada step.

    public void start() {
        initializeMenus();
        _userInterface.menu();

    }
    public void initializeMenus(){
        _menuManager.add("SetUpFilter",_commandManager.findByCode(1),1)
                .add("DeliveryPipe",_commandManager.findByCode(2),2)
                .add("IndicatorLight", _commandManager.findByCode(3),3)
                .add("StartButton", _commandManager.findByCode(4),4)
                .build();
    }
}
