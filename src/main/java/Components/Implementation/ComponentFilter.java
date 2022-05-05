package Components.Implementation;

import Components.Interfaces.Component;

public class ComponentFilter implements Component {

    private String name;
    private boolean setup=false;

    public ComponentFilter(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void activate() {
        System.out.println("Setting up the "+name);
        setSetup(true);
    }

    @Override
    public void deactivate() {
        System.out.println("Disassembling "+name);
        setSetup(false);
    }
    @Override
    public boolean isSetup() {
        return setup;
    }

    public void setSetup(boolean setup) {
        this.setup = setup;
    }

    @Override
    public String execute() {
        return "Filtering the coffee";
    }

}
