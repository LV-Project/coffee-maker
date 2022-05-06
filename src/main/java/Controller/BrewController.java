package Controller;

import Listeners.ListenerComponentManager;
import Listeners.ListenerPlateSensor;
import Listeners.ListenerWaterSensor;
import UserInterface.IUserInterface;
import UserInterface.Command;

import java.util.HashSet;
import java.util.Set;


public class BrewController {
    private IUserInterface _userInterface;
    private ListenerComponentManager _listenerComponentManager;
    private boolean[] _booleanArrayProcess;
    private String[] _stringArrayProcess;
    private ListenerPlateSensor _listenerPlateSensor;
    private ListenerWaterSensor _listenerWaterSensor;

    public BrewController(IUserInterface userInterface, ListenerComponentManager listenerComponentManager, ListenerPlateSensor listenerPlateSensor, ListenerWaterSensor listenerWaterSensor) {
        _userInterface = userInterface;
        _listenerComponentManager = listenerComponentManager;
        _listenerPlateSensor=listenerPlateSensor;
        _listenerWaterSensor=listenerWaterSensor;
        _booleanArrayProcess = new boolean[]{true, true, true, true, true, false};
        _stringArrayProcess = new String[]{"Filter", "StartButton", "PressureValve", "PlateHeater","DeliveryPipe","BoilerHeater"};

    }

    public void startProcess() {
        _userInterface.menu();

    }

    public void monitoringProcess() {
        for (int i = 0; i < _booleanArrayProcess.length; i++) {
            if (checkListeners(i, _stringArrayProcess[i])) {
                processFlow(i);
            } else {
                i--;
                processFlow(8);
            }
        }
    }

    public BrewController processFlow(int var) {

        Command command = _userInterface.getMenuManager().getMenus().stream().filter(a -> a.getCode() == var).findFirst()
                .orElseThrow(() -> new RuntimeException("Menu not found")).getCommand();
        command.execute();
        return this;
    }

    public boolean checkListeners(int currentCodeProcess, String name) {
        if(name.equals("WaterSensor")){
            if(!_listenerWaterSensor.ready()){
              return false;
            }
        }else if(name.equals("PlateSensor")){
            if(!_listenerPlateSensor.ready()){
                return false;
            }
        }
        else if (_listenerComponentManager.findByName(name).statusChange() != _booleanArrayProcess[currentCodeProcess]) {
            return false;
        }
        return true;
    }
    public Set<String> needToSetUp(){
        Set<String> result=new HashSet<>();
        for (int i = 0; i < _stringArrayProcess.length-1; i++) {
            if(!_listenerComponentManager.findByName(_stringArrayProcess[i]).statusChange()){
                result.add(_stringArrayProcess[i]+" not set up");
            }
        }
        if(!_listenerPlateSensor.ready()){
            result.add("Pot not set up");
        }
        if(!_listenerWaterSensor.ready()){
            result.add("Boiler not set up");
        }
        return result;
    }

    public ListenerComponentManager get_listenerComponentManager() {
        return _listenerComponentManager;
    }

    public void set_listenerComponentManager(ListenerComponentManager _listenerComponentManager) {
        this._listenerComponentManager = _listenerComponentManager;
    }

    public ListenerPlateSensor get_listenerPlateSensor() {
        return _listenerPlateSensor;
    }

    public void set_listenerPlateSensor(ListenerPlateSensor _listenerPlateSensor) {
        this._listenerPlateSensor = _listenerPlateSensor;
    }

    public ListenerWaterSensor get_listenerWaterSensor() {
        return _listenerWaterSensor;
    }

    public void set_listenerWaterSensor(ListenerWaterSensor _listenerWaterSensor) {
        this._listenerWaterSensor = _listenerWaterSensor;
    }
}
