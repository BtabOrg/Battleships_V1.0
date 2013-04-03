/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bbk_battleships;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Bernard T. A. Baker <bernard@btab.org>
 */
public class OceanImplTest {
    
    public OceanImplTest() {
    }

    @Test
    public void testGetDimension() {
        System.out.println("getDimension");
        OceanImpl instance = new OceanImpl();
        int expResult = 0;
        int result = instance.getDimension();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testPlaceAllShipsRandomly() {
        System.out.println("placeAllShipsRandomly");
        OceanImpl instance = new OceanImpl();
        instance.placeAllShipsRandomly();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        OceanImpl instance = new OceanImpl();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testIsOccupied() {
        System.out.println("isOccupied");
        int row = 0;
        int column = 0;
        OceanImpl instance = new OceanImpl();
        boolean expResult = false;
        boolean result = instance.isOccupied(row, column);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testShootAt() {
        System.out.println("shootAt");
        int row = 0;
        int column = 0;
        OceanImpl instance = new OceanImpl();
        boolean expResult = false;
        boolean result = instance.shootAt(row, column);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testIsGameOver() {
        System.out.println("isGameOver");
        OceanImpl instance = new OceanImpl();
        boolean expResult = false;
        boolean result = instance.isGameOver();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetShipsSunk() {
        System.out.println("getShipsSunk");
        OceanImpl instance = new OceanImpl();
        int expResult = 0;
        int result = instance.getShipsSunk();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetShipArray() {
        System.out.println("getShipArray");
        OceanImpl instance = new OceanImpl();
        Ship[][] expResult = null;
        Ship[][] result = instance.getShipArray();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testPrintFinalScores() {
        System.out.println("printFinalScores");
        OceanImpl instance = new OceanImpl();
        String expResult = "";
        String result = instance.printFinalScores();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetShotsFired() {
        System.out.println("getShotsFired");
        OceanImpl instance = new OceanImpl();
        int expResult = 0;
        int result = instance.getShotsFired();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetShotsFired() {
        System.out.println("setShotsFired");
        int shotsFired = 0;
        OceanImpl instance = new OceanImpl();
        instance.setShotsFired(shotsFired);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetHitCount() {
        System.out.println("getHitCount");
        OceanImpl instance = new OceanImpl();
        int expResult = 0;
        int result = instance.getHitCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
