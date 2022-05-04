package Components.Implementation;

import Components.Interfaces.Component;

public class ComponentStartButton implements Component {
    private boolean state;
    private String name;

    public ComponentStartButton(String name) {
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
        return "Coffee maker starting! :)";
    }
}
