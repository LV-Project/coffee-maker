package Model;


import Enum.PlateWarmerStates;


public class PlateSensor {

    private PlateWarmerStates _plateWarmerStates;
    public PlateSensor(){
       _plateWarmerStates=PlateWarmerStates.WARMER_EMPTY;
    }


    public PlateWarmerStates getPlateWarmerStates() {
        return _plateWarmerStates;
    }

    public void setPlateWarmerStates(PlateWarmerStates plateWarmerStates) {
        this._plateWarmerStates = plateWarmerStates;
    }
}
