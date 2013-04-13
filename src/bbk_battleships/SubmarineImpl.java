/*
 * Submarine class
 * Four submarines
 * Length 1
 * 
 */
package bbk_battleships;

/**
 * @author KLM
 */
public class SubmarineImpl extends ShipImpl implements Submarine {

    private static final int ONE = 1; // number of squares occupied.
    private static final String SUBMARINE = "S"; // the vessel identifier.

    public SubmarineImpl() {
        super(ONE);
        //setVesselIdentifier(SUBMARINE);
    }
    
    /**
     * set the length of the vessel.
     */
    @Override
    public void setLength(int length){
        if(length != ONE) {
            super.setLength(ONE);
        }
        super.setLength(length);
    }

    /**
     * @return the type of the object - "submarine".
     */
    @Override
    public String getShipType() {
        return "submarine";
    }
}
