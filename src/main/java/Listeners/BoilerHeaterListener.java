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
    private static Logger loggerFile = Logger.getLogger("admin");
    //private static Logger loggerReceipt = Logger.getLogger("file");

    public BoilerHeaterListener (Heater bH){
        this.bH = bH;
    }

    @Override
    public void run(){
        // encendido y true
        while(true) {
            //encendido -  true
//            System.out.println("get ONOFF es : "+bH.getOnOff());
//            System.out.println("ON esta: " + on);
//            System.out.println("OFF esta: " + off);
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
                    Thread.sleep(1000);
                } catch(InterruptedException e){
                }

        }
    }

}
