/**
 * Class DestroyerImpl describes characteristics common to all destroyer 
 * vessels.
 * 
 * This abstraction is a different type of vessel. It has a different name and
 * a different length.
 * 
 * The constructor sets the length of the vessel and provides a 
 * single-character used as an identifier.
 * 
 * There are three destroyers in the game.
 * The length of the destroyer is 2.
 * 
 */
package bbk_battleships;

/**
 * @author Bernard T. A. Baker <bernard@btab.org>
 */
public class DestroyerImpl extends ShipImpl implements Destroyer {

    /**
     * Number of squares occupied.
     */
    private static final int TWO = 2;
    
    /**
     * The vessel identifier.
     */
    private static final String DESTROYER = "D";

    /**
     * Sets the length of the vessel and stores the identifier for the vessel.
     */
    public DestroyerImpl() {
        super(TWO);
        setVesselIdentifier(DESTROYER);
    }

    /**
     * Return the type of vessel.
     * @return the type of the object - "destroyer".
     */
    @Override
    public String getShipType() {
        return "destroyer";
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
