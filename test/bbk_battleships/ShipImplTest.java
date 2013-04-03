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
public class ShipImplTest {
    
    public ShipImplTest() {
    }

    @Test
    public void testOkToPlaceShipAt() {
        System.out.println("okToPlaceShipAt");
        int row = 0;
        int column = 0;
        boolean horizontal = false;
        Ocean ocean = null;
        ShipImpl instance = null;
        boolean expResult = false;
        boolean result = instance.okToPlaceShipAt(row, column, horizontal, ocean);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testPlaceShipAt() {
        System.out.println("placeShipAt");
        int row = 0;
        int column = 0;
        boolean horizontal = false;
        Ocean ocean = null;
        ShipImpl instance = null;
        instance.placeShipAt(row, column, horizontal, ocean);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testShootAt() {
        System.out.println("shootAt");
        int row = 0;
        int column = 0;
        ShipImpl instance = null;
        boolean expResult = false;
        boolean result = instance.shootAt(row, column);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testIsSunk() {
        System.out.println("isSunk");
        ShipImpl instance = null;
        boolean expResult = false;
        boolean result = instance.isSunk();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        ShipImpl instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetLength() {
        System.out.println("getLength");
        ShipImpl instance = null;
        int expResult = 0;
        int result = instance.getLength();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetLength() {
        System.out.println("setLength");
        int length = 0;
        ShipImpl instance = null;
        instance.setLength(length);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetBowRow() {
        System.out.println("getBowRow");
        ShipImpl instance = null;
        int expResult = 0;
        int result = instance.getBowRow();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetBowRow() {
        System.out.println("setBowRow");
        int bowRow = 0;
        ShipImpl instance = null;
        instance.setBowRow(bowRow);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetBowColumn() {
        System.out.println("getBowColumn");
        ShipImpl instance = null;
        int expResult = 0;
        int result = instance.getBowColumn();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetBowColumn() {
        System.out.println("setBowColumn");
        int bowColumn = 0;
        ShipImpl instance = null;
        instance.setBowColumn(bowColumn);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testIsHorizontal() {
        System.out.println("isHorizontal");
        ShipImpl instance = null;
        boolean expResult = false;
        boolean result = instance.isHorizontal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetHorizontal() {
        System.out.println("setHorizontal");
        boolean horizontal = false;
        ShipImpl instance = null;
        instance.setHorizontal(horizontal);
    }

}
