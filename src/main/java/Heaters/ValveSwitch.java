package Heaters;

public class ValveSwitch implements Heater{
    private boolean onOff=false;

    @Override
    public void setOn() {
        onOff=true;
    }

    @Override
    public boolean getOnOff() {
        return onOff;
    }

    @Override
    public void setOff() {
        onOff=false;
    }
}
