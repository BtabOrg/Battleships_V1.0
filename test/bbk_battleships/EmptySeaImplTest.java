/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bbk_battleships;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Bernard T. A. Baker <bernard@btab.org>
 */
public class EmptySeaImplTest {
    
    public EmptySeaImplTest() {
    }

    @Test
    public void testGetShipType() {
        System.out.println("getShipType");
        EmptySeaImpl instance = new EmptySeaImpl();
        String expResult = "emptysea";
        String result = instance.getShipType();
        assertEquals(expResult, result);
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        EmptySeaImpl instance = new EmptySeaImpl();
        String expResult = ".";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    @Test
    public void testShootAt() {
        System.out.println("shootAt");
        int row = 0;
        int column = 0;
        EmptySeaImpl instance = new EmptySeaImpl();
        boolean expResult = false;
        boolean result = instance.shootAt(row, column);
        assertEquals(expResult, result);
    }
}
