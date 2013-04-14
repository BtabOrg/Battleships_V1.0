/**
 * Class CruiserImpl describes characteristics common to all cruiser
 * vessels.
 * 
 * This abstraction is a different type of vessel. It has a different name and
 * a different length.
 * 
 * There are two cruisers in the game.
 * The length of the cruiser is 3.
 * 
 */
package bbk_battleships;

/**
 * @author Bernard T. A. Baker <bernard@btab.org>
 */
public class CruiserImpl extends ShipImpl implements Cruiser {

    /**
     * Number of squares occupied.
     */
    private static final int THREE = 3;
    
    /**
     * The vessel identifier.
     */
    private static final String CRUISER = "C";

    /**
     * Sets the length of the vessel and stores the identifier for the vessel.
     */
    public CruiserImpl() {
        super(THREE);
        setVesselIdentifier(CRUISER);
    }

    /**
     * Return the type of vessel.
     * @return the type of the object - "cruiser".
     */
    @Override
    public String getShipType() {
        return "cruiser";
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