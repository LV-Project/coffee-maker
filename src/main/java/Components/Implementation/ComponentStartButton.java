package Components.Implementation;

import Components.Component;

public class ComponentStartButton implements Component {
    private String name;
    private boolean state=false;

    public ComponentStartButton(String name) {
        this.name = name;
    }
    @Override
    public void activate() {
        System.out.println("Turning on ");
        setSetup(true);
    }

    @Override
    public void deactivate() {
        System.out.println("Turning off the process ");
        setSetup(false);
    }

    @Override
    public String getName() {
        return name;
    }
    @Override
    public String execute() {
        return "Coffee maker starting! :)";
    }
    @Override
    public boolean isSetup() {
        return state;
    }

    private void setSetup(boolean setup) {
        this.state = setup;
    }
}
