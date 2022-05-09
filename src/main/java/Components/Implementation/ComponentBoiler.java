package Components.Implementation;

import Components.Component;

public class ComponentBoiler implements Component {
    private String name;
    private boolean setup=false;

    public ComponentBoiler(String name) {
        this.name = name;
    }
    @Override
    public String execute() {
        return null;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void activate() {

    }

    @Override
    public void deactivate() {

    }

    @Override
    public boolean isSetup() {
        return setup;
    }
}
