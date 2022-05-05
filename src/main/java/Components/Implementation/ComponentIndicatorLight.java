package Components.Implementation;

import Components.Interfaces.Component;

public class ComponentIndicatorLight implements Component {

    private String name;
    private boolean setup=false;

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
    public void activate() {
        System.out.println("Setting up the "+name);
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
}


