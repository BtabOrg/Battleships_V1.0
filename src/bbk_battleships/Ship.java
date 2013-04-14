/**
 * The Ship interface provides the API which all vessels within the game
 * will execute and implementation.
 * 
 * The abstraction of this interface will have different states which include
 * describing the type of abstraction (vessel) using a named string (i.e. Empty
 * sea, Destroyer, Battleship, Submarine, etc).
 * 
 * The abstraction has different states which describe the state of play during
 * the game. If a projectile has been fired upon it, and if that projectile
 * hit or missed the vessel/empty sea abstraction.
 */
package bbk_battleships;

public interface Ship {

    
    /**
     * A set of steps used to determine if the vessel can be placed
     * at the given coordinates described by the "row" and "column". The
     * vessel is placed in either a horizontal or vertical formation. The bow of
     * the vessel will be placed at the location of the coordinates if it is
     * okay to place the vessel here.
     * @param row
     * @param column
     * @param horizontal
     * @param ocean
     * @return a boolean answering the question if it is okay to place 
     * the vessel here.
     */
    boolean okToPlaceShipAt(int row, int column, boolean horizontal,
            Ocean ocean);

    /**
     * Determine whether the vessel can be placed at the given location
     * specified by the row, column and alignment within the ocean.
     * 
     * In order to perform placement, the entire vessel must conform to a rule 
     * of placement: that no immediately surrounding coordinate specified by
     * increasing and or decreasing the row and column values by a range of 
     * -1/+1 in the duration of the length of the vessel will result in a
     * collision with another vessel. Or be out of the specified bounds of the
     * oceans perimeter given by the range of the multidimensional array.
     * 
     * @param row
     * @param column
     * @param horizontal
     * @param ocean
     * @see Ocean
     */
    void placeShipAt(int row, int column, boolean horizontal, Ocean ocean);

    /**
     * Determine if this location specified by the row and column with result
     * in a collision.
     * 
     * @param row
     * @param column
     * @return the result of the projectile being fired at this location.
     */
    boolean shootAt(int row, int column);

    /**
     * Check if the entire vessels state is now known to be in a "sunk" state.
     * @return a boolean describing the state of the entire vessel.
     */
    boolean isSunk();

    /**
     * Return the formatted string representation of this vessel.
     * @return a String to use in the Ocean's print method.
     */
    @Override
    String toString();

    /**
     * Return the length of the vessel.
     * @return a numeric value between 1 and 4.
     */
    int getLength();

    /**
     * Return the value of the row at which the bow will be located.
     * @return a numeric value between 0 and 9.
     */
    int getBowRow();

    /**
     * Return the value of the column at which the bow will be located.
     * @return a numeric value between 0 and 9.
     */
    int getBowColumn();

    /**
     * Return the alignment of the vessel.
     * @return true or false.
     */
    boolean isHorizontal();

    /**
     * Return the type of vessel.
     * @return the type of the object - "battleship".
     */
    String getShipType();

    /**
     * Stores the identifier for the vessel (i.e. D, B, S, C, etc).
     * @param param the new identifier for this vessel.
     */
    void setVesselIdentifier(String param);

    /**
     * Retrieves an identifier used by the games GUI.
     * @return a single character which is used to describe the vessel as 
     * being sunk. It is displayed when using the Oceans print method.
     */
    String getVesselThatHasBeenSunkIdentifier();

    /**
     * Retrieves an identifier used by the games GUI.
     * @return a single character which is used to describe the vessel as 
     * being missed when being shot at. It is displayed when using 
     * the Oceans print method.
     */
    String getVesselThatHasBeenMissedIdentifier();

    /**
     * The print operation accesses part of the vessel which is identified by
     * the row and column. It reflects the position of part of the vessel in
     * relation to the ocean. Each part of the vessel can return a different
     * identifier.
     * @param row
     * @param column
     * @return a single character representing a part of the vessel.
     */
    String print(int row, int column);

    /**
     * When the vessel has sunk the state of the vessel is updated and the
     * print operation will display this in the games GUI.
     */
    void updateLabelsToSunkState();
}