package Listeners;

import Heaters.BoilerHeater;
import Heaters.Heater;
import org.apache.log4j.Logger;

public class BoilerHeaterListener extends Thread{
    // TODO MARTIN GONZALES y LEONARDO VILLALBA una clase que escuche el estado del heater/boiler (todo lo q cambie su estado) y printee en el momento que cambie en un archivo logger.
    // TODO MARTIN GONZALES y LEONARDO VILLALBA implementar un listener a la valvula
    private boolean on =false;
    private boolean off =false;


    Heater bH;
    //intancia del botton

    private static Logger loggerFile = Logger.getLogger("admin");
    //private static Logger loggerReceipt = Logger.getLogger("file");

    public BoilerHeaterListener (Heater bH){
        this.bH = bH;
        //this.startButton=startbutton
    }

    @Override
    public void run(){
        //while argument depends on the start button status
        while(true) {

            if (bH.getOnOff() && !on) {

                loggerFile.info("Boiler Heater ON");
                System.out.println("Heating Boiler....");
                on = true;
                off= false;
            }

            if (!bH.getOnOff() && !off) {

                loggerFile.info("Boiler Heater OFF");
                System.out.println("Heating Boiler Off!");
                off = true;
                on= false;
            }

                try {
                    Thread.sleep(950);
                } catch(InterruptedException e){
                }

        }
    }


}
