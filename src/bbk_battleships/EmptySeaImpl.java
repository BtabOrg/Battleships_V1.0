/**
 * Class EmptySeaImpl describes characteristics common to aall empty sea 
 * instances.
 * 
 * This abstraction is not a vessel. It has a different name and a different
 * length.
 * 
 * The constructor sets the length and provides a single-character used 
 * as an identifier.
 * 
 * All locations not occupied by a sea bound vessel is an empty sea instance.
 * The length of the empty-sea is 1.
 * 
 */
package bbk_battleships;

/**
 * @author KLM
 * @author Bernard T. A. Baker <bernard@btab.org>
 */
public class EmptySeaImpl extends ShipImpl implements EmptySea {

    /**
     * Number of squares occupied.
     */
    private final static int SIZE = 1;
    
    /**
     * The vessel identifier.
     */
    private static final String EMPTY_SEA = ".";

    /**
     * Sets the length of the vessel and stores the identifier for the vessel.
     */
    public EmptySeaImpl() {
        super(SIZE);
        setVesselIdentifier(EMPTY_SEA);
    }

    /**
     * Return the type of vessel.
     * @return the type of object - "EmptySea".
     */
    @Override
    public String getShipType() {
        return "emptysea";
    }

    /**
     * Return the formatted string representation of this object.
     * @return a String to use in the Ocean's print method.
     */
    @Override
    public String toString() {
        return getVesselIdentifier();
    }
    
    /**
     * The print operation returns a single-character String to use in the 
     * Ocean's print method.
     * @param row
     * @param column
     * @return a single character representing a part of the vessel.
     */
    @Override
    public String print(int row, int column) {
        return getVesselIdentifier();
    }

    /**
     * The sea is not a sea bound vessel and returns false when shot at.
     * Update the identifier of this instance in preparation for it being
     * displayed in the GUI.
     * 
     * @param row User's supplied row shot.
     * @param column User's supplied column shot.
     * @return false
     */
    @Override
    public boolean shootAt(int row, int column) {
        // Tpdate the identifier used in the GUI.
        setVesselIdentifier(getVesselThatHasBeenMissedIdentifier());
        // The ocean is not a sea bound vessel.
        return false;
    }
}
