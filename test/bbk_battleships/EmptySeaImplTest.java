/*
 * The EmptySeaImplTest test cases ensure that the EmptySeaImpl facilitates the 
 * features described in the specification of the Battleships game.
 */
package bbk_battleships;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * @author Bernard T. A. Baker <bernard@btab.org>
 */
public class EmptySeaImplTest {

    @Test
    public void testGetShipType() {
        EmptySeaImpl instance = new EmptySeaImpl();
        String expResult = "emptysea";
        String result = instance.getShipType();
        assertEquals("The type of ship is incorrect.", expResult, result);
    }

    @Test
    public void testToString() {
        EmptySeaImpl instance = new EmptySeaImpl();
        String expResult = ".";
        String result = instance.toString();
        assertEquals("The default to string is incorrect.", expResult, result);
    }

    @Test
    public void testShootAt() {
        int row = 0;
        int column = 0;
        EmptySeaImpl instance = new EmptySeaImpl();
        boolean expResult = false;
        boolean result = instance.shootAt(row, column);
        assertEquals("There is no vessel located here.", expResult, result);
        String expIdentifier = instance.getVesselIdentifier();
        assertEquals("The identifier should change after a shot on an "
                + "empty location.", expIdentifier, instance.toString());
    }
}