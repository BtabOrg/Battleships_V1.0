/*
 * Cruiser class
 * Two destroyers
 * Length 3
 * 
 */
package bbk_battleships;

/**
 * @author Bernard T. A. Baker <bernard@btab.org>
 */
public class CruiserImpl extends ShipImpl implements Cruiser {

    private static final int THREE = 3; // The number of squares occupied.
    private static final String CRUISER = "C"; // the crusier identifier.

    public CruiserImpl() {
        super(THREE);
    }

    /**
     * set the length of the vessel.
     */
    @Override
    public void setLength(int length) {
        if (length != THREE) {
            super.setLength(THREE);
        }
        super.setLength(length);
    }

    /**
     * @return the type of the object - "cruiser".
     */
    @Override
    public String getShipType() {
        return "cruiser";
    }
}