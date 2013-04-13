/*
 * Destroyer class
 * Three destroyers
 * Length 2
 * 
 */
package bbk_battleships;

/**
 * @author Bernard T. A. Baker <bernard@btab.org>
 */
public class DestroyerImpl extends ShipImpl implements Destroyer {
    
    private static final int TWO = 2; // The number of squares occupied.
    private static final String DESTROYER = "D"; // the destroyer identifier.

    public DestroyerImpl(){
        super(TWO);
        setVesselIdentifier(DESTROYER);
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
        return getVesselIdentifier();
    }
    
    /**
     * If this ship has been hit, marks that part of the ship as "hit"
     *
     * @param row User's supplied row shot
     * @param column User's supplied column shot
     * @return true if ship is hit, false otherwise
     */
    @Override
    public boolean shootAt(int row, int column) {
        boolean theVesselWasHit = super.shootAt(row, column);
        if(theVesselWasHit){
            setVesselIdentifier( getVesselThatHasBeenHitIdentifier() );
        }
        return theVesselWasHit;
    }
}
