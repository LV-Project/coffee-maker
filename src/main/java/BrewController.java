import Listeners.ListenerManager;
import Model.Boiler;
import Model.Pot;
import Sensors.BoilerSensor;
import Sensors.PlateSensor;
import Sensors.WaterSensor;
import UserInterface.IUserInterface;

public class BrewController {
    private IUserInterface _userInterface;
    private ListenerManager _listenerManager;
    private BoilerSensor _boilerSensor;
    private PlateSensor _plateSensor;
    private WaterSensor _waterSensor;
    public BrewController(IUserInterface userInterface,ListenerManager listenerManager, BoilerSensor boilerSensor, PlateSensor plateSensor,WaterSensor waterSensor){
        _userInterface=userInterface;
        _listenerManager=listenerManager;
        _boilerSensor=boilerSensor;
        _plateSensor=plateSensor;
        _waterSensor=waterSensor;
    }
    public void s(){

    }

}
