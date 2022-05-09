package Listeners;

import Components.Component;

public interface ListenerComponent {
    void addComponent(Component component);
    boolean statusChange();
    String getComponentName();

}
