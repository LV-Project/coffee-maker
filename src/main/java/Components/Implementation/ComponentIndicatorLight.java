package Components.Implementation;

import Components.Interfaces.Component;

public class ComponentIndicatorLight implements Component {
    private boolean state;
    private String name;

    public ComponentIndicatorLight(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
    @Override
    public String execute() {
        return "Turning light on\nCoffee is Ready!!!";
    }
    @Override
    public void setUp() {
        System.out.println("Setting up the "+name);
    }
}


