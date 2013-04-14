/**
 * The Submarine defines specific operations for retrieving the type of ship
 * and returning the string representation of the class.
 */
package bbk_battleships;

/**
 * @author Bernard T. A. Baker <bernard@btab.org>
 */
public interface Submarine extends Ship {

    /**
     * Return the type of vessel.
     * @return the type of the object - "submarine".
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
