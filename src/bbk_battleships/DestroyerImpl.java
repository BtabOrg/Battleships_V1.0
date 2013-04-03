/*
 * Destroyer class
 * Three destroyers
 * Length 2
 * 
 */
package bbk_battleships;

/**
 *
 * @author Bernard T. A. Baker <bernard@btab.org>
 */
public class DestroyerImpl extends ShipImpl implements Destroyer {
    
    private static final int TWO = 2; // The number of squares occupied.

    public DestroyerImpl(){
        super(TWO);
    }

    
    /**
     * set the length of the vessel.
     */
    @Override
    public void setLength(int length){
        if(length != TWO) {
            super.setLength(TWO);
        }
        super.setLength(length);
    }
    
    /**
     * @return the type of the object - "destroyer".
     */
    @Override
    public String getShipType() {
        return "destroyer";
    }
    
    /**
     * @return a single-character String to use in the Ocean's print method.
     */
    @Override
    public String toString(){
        return "D";
    }
    
}
