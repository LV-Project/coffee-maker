import Containers.Boiler;
import Containers.BoilerStates;
import Containers.Pot;
import Containers.PotStates;
import Heaters.BoilerHeater;
import Heaters.Heater;
import Heaters.PlateHeater;
import Listeners.BoilerHeaterListener;
import Sensors.BoilerSensor;
import Sensors.PlateSensor;

import java.util.Scanner;

public class CoffeeMaker extends Thread {



    public static void main(String[] args)   {
        //1.Turn off the button ( TO IMPLEMENT )

        //2.Fill the boiler with water:
        Boiler boiler = new Boiler(BoilerStates.BOILER_NOT_EMPTY);

        //3.Boiler sensor detect the water , and turn on the heater
        Heater bHeater = new BoilerHeater();
        String boilerStatus = String.valueOf(boiler.getCurrentState());


        BoilerSensor boilerSensor = new BoilerSensor(boiler, bHeater);

        boilerSensor.trigger();


        BoilerHeaterListener boilerListener = new BoilerHeaterListener(bHeater);
        boilerListener.start();

        for (int i = 0; i<2;i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e){
            }

        }
        bHeater.setOff();
        for (int i = 0; i<2;i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e){
            }

        }
        bHeater.setOn();
        for (int i = 0; i<2;i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e){
            }
            bHeater.setOff();
        }




    }

    static Scanner sc= new Scanner(System.in);

    // TODO MARTIN PAVESIO y KEVIN CARDENAS Implementar interfaz de usuario, imprime en consola el estado de todo el flow y partes del mismo.

    // TODO KEVIN CARDENAS y MARTIN PAVESIO create implementations for the light, button, the pipe, and filter.
    // TODO Test Unitario en cada step.

    public static void stasrt() {

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
