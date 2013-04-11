/*
 * A Battleship class which extends ship
 * One battleship in the game
 * Length 4
 * 
 */
package bbk_battleships;

/**
 * @author KLM
 */
public class BattleShipImpl extends ShipImpl implements BattleShip {

    private static final int FOUR = 4; // The number of squares occupied.
    
    public BattleShipImpl() {
        super(FOUR);
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
        return "B";
    }
}