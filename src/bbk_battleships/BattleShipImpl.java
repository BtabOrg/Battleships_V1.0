/*
 * A Battleship class which extends ship
 * One battleship in the game
 * Length 4
 * 
 */
package bbk_battleships;

/**
 * @author KLM
 * @author Bernard T. A. Baker <bernard@btab.org>
 */
public class BattleShipImpl extends ShipImpl implements BattleShip {

    private static final int FOUR = 4; // The number of squares occupied.
    private static final String BATTLESHIP = "B"; // the battleship identifier.
    
    public BattleShipImpl() {
        super(FOUR);
        setVesselIdentifier(BATTLESHIP);
    }
    
    /**
     * set the length of the vessel.
     */
    @Override
    public void setLength(int length){
        if(length != FOUR) {
            super.setLength(FOUR);
        }
        super.setLength(length);
    }

    /**
     * @return the type of the object - "battleship".
     */
    @Override
    public String getShipType() {
        return "battleship";
    }

    /**
     * @return a String to use in the Ocean's print method.
     */
    @Override
    public String toString() {
        return getVesselIdentifier();
    }
}