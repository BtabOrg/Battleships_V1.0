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
     * @return the type of object - "EmptySea".
     */
    @Override
    public String getShipType() {
        return "emptysea";
    }

    /**
     * @return a single-character String to use in the Ocean's print method.
     */
    @Override
    public String toString() {
        return getVesselIdentifier();
    }

    /**
     * @return a single-character String to use in the Ocean's print method.
     */
    @Override
    public String print(int row, int column) {
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
        setVesselIdentifier(getVesselThatHasBeenMissedIdentifier());
        return false; // it's not a hit
    }
}
