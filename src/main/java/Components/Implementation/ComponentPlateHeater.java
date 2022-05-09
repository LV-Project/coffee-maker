package Components.Implementation;

import Components.Component;

public class ComponentPlateHeater implements Component {
    private boolean state;
    private String name;
    public ComponentPlateHeater(String name){
        this.name=name;
    }
    @Override
    public String execute() {
        return "Plate heated";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void activate() {
        System.out.println("Turning on the plate heater");
        state=true;
    }

    @Override
    public void deactivate() {
        System.out.println("Turning off the plate heater");
        state=false;
    }

    @Override
    public boolean isSetup() {
        return state;
    }
}
