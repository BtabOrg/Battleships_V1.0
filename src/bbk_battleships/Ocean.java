/**
 * The Ocean provides an API for accessing the operations and instance members
 * of the implementation.
 * 
 * The ocean stores a reference to all sea bound vessels. It can place the 
 * entire fleet of sea bound vessels randomly within the bounds of the board.
 * 
 * It can check any location on the board. Tally different scores and provides
 * an operation for displaying information within the GUI.
 * 
 */
package bbk_battleships;

public interface Ocean {

    /**
     * Get the length of the board.
     * @return the size of the row/column.
     */
    int getDimension();

    /**
     * Place the fleet on the empty board.
     * The fleet must consist of one battleship, two cruisers, three destroyers,
     * and four submarines. The vessels must be placed starting with the largest
     * and ending with the smallest. This is because the board may run out of 
     * feasible locations to place the vessels if it performed in a random
     * manner.
     * @return a boolean true if all fleet members were placed on the board.
     */
    boolean placeAllShipsRandomly();

    /**
     * Return the formatted string representation of this instance.
     * @return a String to use in the GUI.
     */
    @Override
    String toString();

    /**
     * Checks whether the location contains anything other than empty sea.
     * @param row the x position on the board
     * @param column the y position on the board
     * @return true if the given location contains a ship, false if it does not.
     */
    boolean isOccupied(int row, int column);

    /**
     * Checks whether the location contains a ship, still afloat. Marks that
     * ship as hit and checks whether whole ship is sunk. Updates the number of
     * shots that have been fired, and number of hits.
     * @param row the x position
     * @param column the y position
     * @return true if location contains a "real" ship, still afloat, false if
     * not.
     */
    boolean shootAt(int row, int column);

    /**
     * Returns true if all the ships on the board have been sunk, otherwise
     * false.
     * @return the "fleet" has been sunk
     */
    boolean isGameOver();

    /**
     * Gets the board so that the Ocean parameter can look at the contents of
     * this array; the placeShipAt method can modify it this board (not a good
     * idea).
     * @return the array of board
     */
    Ship[][] getShipArray();

    /**
     * Returns a string containing the final results for hits, ships sunk 
     * and shots fired.
     * @return a string with information about the game.
     */
    String printFinalScores();

    /**
     * Returns the total number of shots fired by the user.
     * @return a numeric value.
     */
    int getShotsFired();

    /**
     * Sets the total number of shots fired by the user.
     * @param shotsFired
     */
    void setShotsFired(int shotsFired);

    /**
     * Return the total hit count which will be used by the GUI print 
     * operations.
     * @return a numeric value.
     */
    int getHitCount();

    /**
     * Return the total number of vessels that have been sunk.
     * @return the number of ships sunk (in this game).
     */
    int getShipsSunk();
}