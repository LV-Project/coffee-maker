package Components.Implementation;

import Components.Interfaces.Component;

import java.util.ArrayList;
import java.util.List;

public class ComponentManager {
    private List<Component> components;
    public ComponentManager(){
        components= new ArrayList<>();
        InitializeComponents();
    }
    public void InitializeComponents(){
        components.add(new ComponentIndicatorLight("IndicatorLight"));
        components.add(new ComponentStartButton("StartButton"));
        components.add(new ComponentFilter("Filter"));
        components.add(new ComponentDeliveryPipe("DeliveryPipe"));
    }
    public List<Component> getComponents() {
        return components;
    }

    public void setComponents(List<Component> components) {
        this.components = components;
    }
    public Component findByName(String name){
        return components.stream().filter(a->a.getName().equals(name)).findFirst().orElseThrow(()-> new RuntimeException("Component not found"));
    }

}
