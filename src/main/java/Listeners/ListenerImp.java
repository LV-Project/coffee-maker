package Listeners;

import Components.Interfaces.Component;

public class ListenerImp implements Listener{
    private boolean previousVal;
    private Component myComponent;
    public ListenerImp(){

    }

    @Override
    public void addComponent(Component component) {
        myComponent=component;
        previousVal=myComponent.isSetup();
    }

    @Override
    public boolean statusChange() {
        return previousVal!=myComponent.isSetup();
    }

    @Override
    public String getComponentName() {
        return myComponent.getName();
    }

}
