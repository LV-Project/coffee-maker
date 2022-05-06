package Components.Implementation;

import Components.Component;

public class ComponentBoilerHeater implements Component {
    private boolean state;
    private String name;
    public ComponentBoilerHeater(String name){
        this.name=name;
    }
    @Override
    public String execute() {
        return "Boiling water";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void activate() {
        System.out.println("Turning on boiler");
        state=true;
    }

    @Override
    public void deactivate() {
        System.out.println("Turning off boiler");
        state=false;
    }

    @Override
    public boolean isSetup() {
        return state;
    }
}
