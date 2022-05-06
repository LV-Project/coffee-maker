package Listeners;

import Containers.PressureValve;
import org.apache.log4j.Logger;

public class ValveListener extends Thread {

    private boolean on =false;
    private boolean off =false;


    PressureValve valve;
    //intancia del botton

    private static Logger loggerFile = Logger.getLogger("admin");
    //private static Logger loggerReceipt = Logger.getLogger("file");

    public ValveListener (PressureValve valve){
        this.valve = valve;
        //this.startButton=startbutton
    }

    @Override
    public void run(){
        //while argument depends on the start button status
        while(true) {

            if (valve.isOpen() && !on) {

                loggerFile.info("Valve is open, no coffee is coming");
                System.out.println("Valve is open....");
                on = true;
                off= false;
            }

            if (valve.isClosed() && !off) {

                loggerFile.info("Valve is close, coffee is coming");
                System.out.println("Valve is close");
                off = true;
                on= false;
            }

            try {
                Thread.sleep(995);
            } catch(InterruptedException e){}

        }
    }


}
