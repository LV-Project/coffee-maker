package Containers;

public class Boiler {
    String currentState;

    public Boiler(BoilerStates currentState){
        this.currentState = String.valueOf(currentState);
    }

    public String getCurrentState() {
        return currentState;
    }

    public void setCurrentState(String currentState) {
        this.currentState = currentState;
    }
}
