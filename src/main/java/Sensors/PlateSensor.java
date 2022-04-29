package Sensors;

class PlateSensor implements Sensor {

    Pot pot;


    public PlateSensor(Pot pot, PotStates states){
        this.pot=pot;
        this.states=states;
    }

    boolean trigger(){
        if(pot.getCurrentState() == states.WARMER_EMPTY ){

        }
    }

    @Override
    public String status() {
        return checkPot();
    }
}
