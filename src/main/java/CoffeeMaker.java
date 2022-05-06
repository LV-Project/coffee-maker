import Components.Implementation.ComponentManager;
import UserInterface.IUserInterface;
import UserInterface.Implementation.Commands.CommandManager;
import UserInterface.Implementation.MenuManager;
import UserInterface.Implementation.UserInterfaceImp;

public class CoffeeMaker {
    private IUserInterface _userInterface;
    private ComponentManager _componentManager;
    private MenuManager _menuManager;
    private CommandManager _commandManager;

    public CoffeeMaker() {
        _componentManager = new ComponentManager();
        _menuManager = new MenuManager();
        _userInterface = new UserInterfaceImp(_componentManager, _menuManager);
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
        _menuManager.add("Exit",_commandManager.findByCode(-1),-1)
                .add("Main Menu",_commandManager.findByCode(0),0)
                .add("Set Up Filter",_commandManager.findByCode(1),1)
                .add("Remove Filter",_commandManager.findByCode(2),2)
                .add("Execute Filter", _commandManager.findByCode(3),3)
                .add("Set Up Delivery Pipe", _commandManager.findByCode(4),4)
                .add("Remove Delivery Pipe", _commandManager.findByCode(5),5)
                .add("Execute Delivery Pipe", _commandManager.findByCode(6),6)
                .add("Turn On Indicator Light", _commandManager.findByCode(7),7)
                .add("Turn Off Indicator Light", _commandManager.findByCode(8),8)
                .add("Execute Indicator Light", _commandManager.findByCode(9),9)
                .add("Turn On Start Button", _commandManager.findByCode(10),10)
                .add("Turn Off Start Button", _commandManager.findByCode(11),11)
                .add("Execute Start Button", _commandManager.findByCode(12),12)
                .build();
    }
}
