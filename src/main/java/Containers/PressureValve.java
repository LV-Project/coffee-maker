package Containers;

public class PressureValve {

    PressureValveStates currentState;

    public PressureValve() {
        currentState = PressureValveStates.CLOSED;
    }

    public void open() {
        currentState = PressureValveStates.OPEN;
    }

    public void close() {
        currentState = PressureValveStates.CLOSED;
    }

    public boolean isOpen() {
        return currentState == PressureValveStates.OPEN;
    }

    public boolean isClosed() {
        return currentState == PressureValveStates.CLOSED;
    }

    public String toString() {
        return currentState.toString();
    }
}
