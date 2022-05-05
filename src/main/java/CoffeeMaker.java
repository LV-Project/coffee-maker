import Containers.Boiler;
import Containers.BoilerStates;
import Containers.Pot;
import Containers.PotStates;
import Heaters.BoilerHeater;
import Heaters.Heater;
import Heaters.PlateHeater;
import Heaters.ValveSwitch;
import Listeners.BoilerHeaterListener;
import Listeners.PlateHeaterListener;
import Listeners.ValveListener;
import Sensors.BoilerSensor;
import Sensors.PlateSensor;

import java.util.Scanner;

public class CoffeeMaker {



    public static void main(String[] args)   {
        start();
    }

    static Scanner sc= new Scanner(System.in);

    // TODO MARTIN PAVESIO y KEVIN CARDENAS Implementar interfaz de usuario, imprime en consola el estado de todo el flow y partes del mismo.

    // TODO KEVIN CARDENAS y MARTIN PAVESIO create implementations for the light, button, the pipe, and filter.
    // TODO Test Unitario en cada step.

    public static void start() {

        //1.Turn off the button ( TO IMPLEMENT )

        //2.Fill the boiler with water:
        Boiler boiler = new Boiler(BoilerStates.BOILER_NOT_EMPTY);

        //3.Boiler sensor detect the water , and turn on the heater
        Heater bHeater = new BoilerHeater();
        Heater valve = new ValveSwitch();
        String boilerStatus = String.valueOf(boiler.getCurrentState());
        BoilerSensor boilerSensor = new BoilerSensor(boiler, bHeater);

        boilerSensor.trigger();



        Pot pot = new Pot(PotStates.POT_EMPTY);
        Heater plateH = new PlateHeater();
        PlateSensor plateSensor = new PlateSensor(pot, plateH, valve);

        plateSensor.trigger();


        PlateHeaterListener plateListener = new PlateHeaterListener(plateH);
        plateListener.start();



        BoilerHeaterListener boilerListener = new BoilerHeaterListener(bHeater);
        boilerListener.start();

        ValveListener valveListener = new ValveListener(valve);
        valveListener.start();

        bHeater.setOff();
        plateH.setOff();
        valve.setOn();
        for (int i = 0; i<2;i++){
            System.out.println(i);

            try {
                Thread.sleep(1000);
            } catch(InterruptedException e){
            }

        }
        bHeater.setOn();
        plateH.setOn();
        valve.setOff();
        for (int i = 0; i<2;i++){
            System.out.println(i);

            try {
                Thread.sleep(1000);
            } catch(InterruptedException e){
            }

        }
        bHeater.setOff();
        plateH.setOff();
        valve.setOn();
        for (int i = 0; i<2;i++){
            System.out.println(i);

            try {
                Thread.sleep(1000);
            } catch(InterruptedException e){
            }

        }


        //boiler.setCurrentState(BoilerStates.BOILER_EMPTY);



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
}
