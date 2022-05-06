package Listeners;

import Components.Interfaces.Component;

public interface Listener {
    void addComponent(Component component);
    boolean statusChange();
    String getComponentName();
}
