package Components.Implementation;

import Components.Interfaces.Component;

public class ComponentFilter implements Component {

    private String name;

    public ComponentFilter(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setUp() {
        System.out.println("Setting up the "+name);
    }

    @Override
    public String execute() {
        return "Filtering the coffe";
    }

}
