package Containers;

public class Pot{

    PotStates currentState;

    public Pot(PotStates currentState){
        this.currentState = currentState;
    }

    public PotStates getCurrentState() {
        return currentState;
    }

    public void setCurrentState(PotStates currentState) {
        this.currentState = currentState;
    }
}
