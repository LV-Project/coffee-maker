package Listeners;

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
