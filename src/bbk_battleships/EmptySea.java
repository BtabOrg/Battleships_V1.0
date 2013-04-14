/**
 * The EmptySea defines specific operations for retrieving the type of ship
 * and returning the string representation of the class.
 */
package bbk_battleships;

public interface EmptySea extends Ship {

    /**
     * The sea is not a sea bound vessel and returns false when shot at.
     * Update the identifier of this instance in preparation for it being
     * displayed in the GUI.
     * 
     * @param row User's supplied row shot.
     * @param column User's supplied column shot.
     */
    @Override
    boolean shootAt(int row, int column);

    /**
     * Return the formatted string representation of this object.
     * @return a String to use in the Ocean's print method.
     */
    @Override
    public String toString();
}