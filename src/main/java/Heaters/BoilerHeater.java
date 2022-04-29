package Heaters;

public class BoilerHeater {

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

    public String getStatus() {
        if(onOff){
            return "Heating boiler...";
        } else {
            return "Heating boiler off";
        }
    }
}
