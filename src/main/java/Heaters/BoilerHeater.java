package Heaters;
public class BoilerHeater implements Heater{
    private boolean onOff=false;

    public boolean getOnOff() {
        return onOff;
    }

    public void setOn() {
        this.onOff = true;
    }

    public void setOff() {
        this.onOff = false;
    }




}
