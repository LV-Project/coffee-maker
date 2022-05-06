package Listeners;

import Components.Implementation.*;
import Components.Interfaces.Component;

import java.util.ArrayList;
import java.util.List;

public class ListenerManager {
    private List<Listener> listeners;
    private ComponentManager _componentManager;
    public ListenerManager(ComponentManager componentManager){
        listeners= new ArrayList<>();
        _componentManager=componentManager;
        InitializeComponents();
    }
    public void InitializeComponents(){
        for (Component varComponent:_componentManager.getComponents()) {
            Listener listener= new ListenerImp();
            listener.addComponent(varComponent);
            listeners.add(listener);
        }
    }
    public List<Listener> getListeners() {
        return listeners;
    }
    public void setListeners(List<Listener> components) {
        this.listeners = components;
    }
    public Listener findByName(String name){
        return listeners.stream().filter(a->a.getComponentName().equals(name)).findFirst().orElseThrow(()-> new RuntimeException("Listener not found"));
    }
}
