/*
 * Class Empty Sea
 * describes part of the ocean that doesn't have a ship in it.
 * Length of 1
 *
 */
package bbk_battleships;

/**
 * @author KLM
 * @author Bernard T. A. Baker <bernard@btab.org>
 */
public class EmptySeaImpl extends ShipImpl implements EmptySea {

    private final static int SIZE = 1; // number of squares occupied.
    private static final String EMPTY_SEA = "."; // the empty sea identifier.

    /**
     * sets the length & clears the hit array
     */
    public EmptySeaImpl() {
        super(SIZE);
        setVesselIdentifier(EMPTY_SEA);
    }

    /**
     * set the length of the vessel.
     */
    @Override
    public void setLength(int length) {
        if (length != SIZE) {
            super.setLength(SIZE);
        }
        super.setLength(length);
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
