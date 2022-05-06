package Components.Implementation;

import Components.Interfaces.Component;

public class ComponentPressureValve implements Component {
    private boolean state;
    private String name;
    public ComponentPressureValve(String name){
        this.name=name;
    }
    @Override
    public String execute() {
        return "Pressure valve working";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void activate() {
        System.out.println("Pressure Valve open");
        state=true;
    }

    @Override
    public void deactivate() {
        System.out.println("Pressure Valve closed");
        state=false;
    }

    @Override
    public boolean isSetup() {
        return state;
    }
}
