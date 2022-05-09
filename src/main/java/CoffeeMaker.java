import Components.Implementation.ComponentManager;
import Controller.BrewController;
import Listeners.ListenerComponentManager;
import Listeners.ListenerPlateSensor;
import Listeners.ListenerWaterSensor;
import Model.PlateSensor;
import Model.WaterSensor;
import UserInterface.IUserInterface;
import UserInterface.Commands.CommandManager;
import UserInterface.MenuManager;
import UserInterface.UserInterfaceImp;

public class CoffeeMaker {
    private IUserInterface _userInterface;
    private ComponentManager _componentManager;
    private MenuManager _menuManager;
    private CommandManager _commandManager;
    private BrewController _brewController;
    private ListenerComponentManager _listenerComponentManager;
    private ListenerPlateSensor _listenerPlateSensor;
    private ListenerWaterSensor _listenerWaterSensor;

    public CoffeeMaker() {
        _listenerPlateSensor= new ListenerPlateSensor(new PlateSensor());
        _listenerWaterSensor= new ListenerWaterSensor(new WaterSensor());
        _componentManager = new ComponentManager();
        _menuManager = new MenuManager();
        _listenerComponentManager = new ListenerComponentManager(_componentManager);
        _userInterface = new UserInterfaceImp(_componentManager, _menuManager);
        _brewController = new BrewController(_userInterface, _listenerComponentManager,_listenerPlateSensor,_listenerWaterSensor);
        _commandManager = new CommandManager(_userInterface,_brewController);


    }

    public void start() {
        initializeMenus();
        _brewController.startProcess();
    }

    public void initializeMenus2(){
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
    public void initializeMenus(){
        _menuManager.add("Main Menu",_commandManager.findByCode(0),0)
                .add("Set Up Filter",_commandManager.findByCode(1),1)
                .add("Add Water Cups",_commandManager.findByCode(2),2)
                .add("Starts button",_commandManager.findByCode(3),3)
                .add("Set up pressure valve",_commandManager.findByCode(4),4)
                .add("Set up pot",_commandManager.findByCode(5),5)
                .add("Remove pot",_commandManager.findByCode(6),6)
                .add("Wait Menu",_commandManager.findByCode(7),7)
                .add("Set up Delivery Pipe",_commandManager.findByCode(8),8)
                .add("Set up Plate Heater",_commandManager.findByCode(9),9)
                .add("Turn on Indicator Light",_commandManager.findByCode(10),10)
                .build();
    }
}
