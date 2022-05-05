package Listeners;

import Heaters.Heater;
import org.apache.log4j.Logger;

public class PlateHeaterListener extends Thread{
    private boolean on =false;
    private boolean off =false;


    Heater plateH;
    //intancia del botton

    private static Logger loggerFile = Logger.getLogger("admin");
    //private static Logger loggerReceipt = Logger.getLogger("file");

    public PlateHeaterListener (Heater plateH){
        this.plateH = plateH;
        //this.startButton=startbutton
    }

    @Override
    public void run(){
        //while argument depends on the start button status
        while(true) {

            if (plateH.getOnOff() && !on) {

                loggerFile.info("Plate Heater ON");
                System.out.println("Heating Plate....");
                on = true;
                off= false;
            }

            if (!plateH.getOnOff() && !off) {

                loggerFile.info("Plate Heater OFF");
                System.out.println("Heating Plate Off!");
                off = true;
                on= false;
            }

            try {
                Thread.sleep(975);
            } catch(InterruptedException e){}

        }
    }


}
