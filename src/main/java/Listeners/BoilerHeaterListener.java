package Listeners;

import Heaters.BoilerHeater;
import Heaters.Heater;

public class BoilerHeaterListener extends Thread{
    // TODO MARTIN GONZALES y LEONARDO VILLALBA una clase que escuche el estado del heater/boiler (todo lo q cambie su estado) y printee en el momento que cambie en un archivo logger.
    // TODO MARTIN GONZALES y LEONARDO VILLALBA implementar un listener a la valvula
    private boolean on=false;
    private boolean off=false;
    Heater bH;

    public BoilerHeaterListener (Heater bH){
        this.bH = bH;
    }
//    public boolean getOnOff() {
//        return onOff;
//    }
//
//    public void setOnOff(boolean onOff) {
//        this.onOff = onOff;
//    }
//
//    public void setOn() {
//        this.onOff = true;
//    }
//
//    public void setOff() {
//        this.onOff = false;
//    }

    @Override
    public void run(){
        if(bH.getOnOff() && !on){
            System.out.println("Heating Boiler....");
            on=true;
        } else if(bH.getOnOff() && !off){
            System.out.println("Heating Boiler Off!");
            off=true;
        }
    }

}
