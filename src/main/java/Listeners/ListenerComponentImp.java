package Listeners;

import Components.Component;

public class ListenerComponentImp implements ListenerComponent {
    private boolean _previousVal;
    private Component _myComponent;
    public ListenerComponentImp(){

    }

    @Override
    public void addComponent(Component component) {
        _myComponent=component;
        _previousVal=_myComponent.isSetup();
    }

    @Override
    public boolean statusChange() {
        return _myComponent.isSetup();
    }

    @Override
    public String getComponentName() {
        return _myComponent.getName();
    }

}
