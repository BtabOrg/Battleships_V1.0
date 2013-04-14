/**
 * Class BattleShipImpl describes characteristics common to all battleship
 * vessels.
 * 
 * This abstraction is a different type of vessel. It has a different name and
 * a different length.
 * 
 * There is one battleship in the game.
 * The length of the battleship is 4.
 * 
 */
package bbk_battleships;

/**
 * @author KLM
 * @author Bernard T. A. Baker <bernard@btab.org>
 */
public class BattleShipImpl extends ShipImpl implements BattleShip {

    /**
     * Number of squares occupied.
     */
    private static final int FOUR = 4;
    
    /**
     * The vessel identifier.
     */
    private static final String BATTLESHIP = "B";

    /**
     * Sets the length of the vessel and stores the identifier for the vessel.
     */
    public BattleShipImpl() {
        super(FOUR);
        setVesselIdentifier(BATTLESHIP);
    }

    /**
     * Return the type of vessel.
     * @return the type of the object - "battleship".
     */
    @Override
    public String getShipType() {
        return "battleship";
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