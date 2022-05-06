package Listeners;

import Components.Implementation.*;
import Components.Component;

import java.util.ArrayList;
import java.util.List;

public class ListenerComponentManager {
    private List<ListenerComponent> listeners;
    private ComponentManager _componentManager;
    public ListenerComponentManager(ComponentManager componentManager){
        listeners= new ArrayList<>();
        _componentManager=componentManager;
        InitializeComponents();
    }
    public void InitializeComponents(){
        for (Component varComponent:_componentManager.getComponents()) {
            ListenerComponent listener= new ListenerComponentImp();
            listener.addComponent(varComponent);
            listeners.add(listener);
        }
    }
    public List<ListenerComponent> getListeners() {
        return listeners;
    }
    public void setListeners(List<ListenerComponent> components) {
        this.listeners = components;
    }
    public ListenerComponent findByName(String name){
        return listeners.stream().filter(a->a.getComponentName().equals(name)).findFirst().orElseThrow(()-> new RuntimeException("Listener not found "+name));
    }
}
