package Components.Implementation;

import Components.Interfaces.Component;

public class ComponentDeliveryPipe implements Component {
    private String name;
    private boolean setup=false;

    public ComponentDeliveryPipe(String name) {
        this.name = name;
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
    public String getName() {
        return name;
    }
    @Override
    public String execute() {
        return "Delivering the water";
    }
    @Override
    public boolean isSetup() {
        return setup;
    }

    private void setSetup(boolean setup) {
        this.setup = setup;
    }
}
