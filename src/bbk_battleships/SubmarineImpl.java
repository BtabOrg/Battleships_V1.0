/**
 * Class SubmarineImpl describes characteristics common to all submarines
 * vessels.
 * 
 * This abstraction is a different type of vessel. It has a different name and
 * a different length.
 * 
 * The constructor sets the length of the vessel and provides a 
 * single-character used as an identifier.
 * 
 * There are four submarines in the game.
 * The length of the submarine is 1.
 * 
 */
package bbk_battleships;

/**
 * @author KLM
 * @author Bernard T. A. Baker <bernard@btab.org>
 */
public class SubmarineImpl extends ShipImpl implements Submarine {

    /**
     * Number of squares occupied.
     */
    private static final int ONE = 1;
    
    /**
     * The vessel identifier.
     */
    private static final String SUBMARINE = "S";

    /**
     * Sets the length of the vessel and stores the identifier for the vessel.
     */
    public SubmarineImpl() {
        super(ONE);
        setVesselIdentifier(SUBMARINE);
    }

    /**
     * Return the type of vessel.
     * @return the type of the object - "submarine".
     */
    @Override
    public String getShipType() {
        return "submarine";
    }
    
    /**
     * Return the formatted string representation of this object.
     * @return a String to use in the Ocean's print method.
     */
    @Override
    public String toString() {
        return getVesselIdentifier();
    }
}