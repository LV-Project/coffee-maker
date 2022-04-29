package Listeners;

public class BoilerHeaterListener extends Thread{

    private boolean onOff=false;
    private boolean on=false;
    private boolean off=false;


    public boolean getOnOff() {
        return onOff;
    }

    public void setOnOff(boolean onOff) {
        this.onOff = onOff;
    }

    public void setOn() {
        this.onOff = true;
    }

    public void setOff() {
        this.onOff = false;
    }


    @Override
    public void run(){
        if(onOff && !on){
            System.out.println("Heating Boiler....");
            on=true;
        } else if(onOff && !off){
            System.out.println("Heating Boiler Off!");
            off=true;
        }
    }

}
