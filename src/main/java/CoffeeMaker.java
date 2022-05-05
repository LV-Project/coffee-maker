import Components.Implementation.ComponentManager;
import Containers.Boiler;
import Containers.BoilerStates;
import Switchers.BoilerHeater;
import Switchers.Switch;
import Listeners.BoilerHeaterListener;
import Sensors.BoilerSensor;
import Sensors.PlateSensor;
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
        //1.Turn off the button ( TO IMPLEMENT )

        //2.Fill the boiler with water:
//        Boiler boiler = new Boiler(BoilerStates.BOILER_NOT_EMPTY);
//
//        //3.Boiler sensor detect the water , and turn on the heater
//        Heater bHeater = new BoilerHeater();
//        String boilerStatus = boiler.getCurrentState();
//
//
//        BoilerSensor boilerSensor = new BoilerSensor(boiler);
//
//        boilerSensor.trigger();
//
//
//        BoilerHeaterListener boilerListener = new BoilerHeaterListener(bHeater);
//        boilerListener.start();
//
//        boiler.setCurrentState(BoilerStates.BOILER_EMPTY);



        //System.out.println(myBoiler);
//        if(myBoiler){
//            bHeater.setOn();
//            System.out.println(bHeater.getOnOff());
//        }else{
//            bHeater.setOff();
//            System.out.println(bHeater.getOnOff());
//        }
//        BoilerHeaterListener boilerListener = new BoilerHeaterListener();
//        boilerListener.start();
//        while(true){
//            System.out.println("Switch for the Boiler");
//            boolean answer;
//            answer=sc.nextBoolean();
//            if(answer){
//                boilerListener.setOn();
//            }else{
//                boilerListener.setOff();
//            }
//        }


    }
    public void initializeMenus(){
        _menuManager.add("SetUpFilter",_commandManager.findByCode(1),1)
                .add("DeliveryPipe",_commandManager.findByCode(2),2)
                .add("IndicatorLight", _commandManager.findByCode(3),3)
                .add("StartButton", _commandManager.findByCode(4),4)
                .build();
    }
}
