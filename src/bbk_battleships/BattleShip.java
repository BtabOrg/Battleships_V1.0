package bbk_battleships;

public interface BattleShip extends Ship {

    /**
     * Return the type of vessel.
     * @return the type of the object - "battleship".
     */
    @Override
    String getShipType();

    /**
     * Return the formatted string representation of this object.
     * @return a String to use in the Ocean's print method.
     */
    @Override
    String toString();
}
