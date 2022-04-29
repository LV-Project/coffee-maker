package Containers;

public class Pot{

    String currentState;

    public Pot(String currentState){
        this.currentState = currentState;
    }

    public String getCurrentState() {
        return currentState;
    }

    public void setCurrentState(String currentState) {
        this.currentState = currentState;
    }
}
