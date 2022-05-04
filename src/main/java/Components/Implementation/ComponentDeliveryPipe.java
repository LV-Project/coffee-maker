package Components.Implementation;

import Components.Interfaces.Component;

public class ComponentDeliveryPipe implements Component {
    private String name;

    public ComponentDeliveryPipe(String name) {
        this.name = name;
    }
    @Override
    public void setUp() {
        System.out.println("Setting up the "+name);
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public String execute() {
        return "Delivering the water";
    }
}
