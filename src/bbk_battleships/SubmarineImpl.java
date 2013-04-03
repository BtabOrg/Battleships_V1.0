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

    public SubmarineImpl() {
        super(ONE);
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

    /**
     * @return a single-character String to use in the Ocean's print method.
     */
    @Override
    public String toString() {
        return "S";
    }
}