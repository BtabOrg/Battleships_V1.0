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
public class SubmarineImplTest {
    
    public SubmarineImplTest() {
    }

    @Test
    public void testGetShipType() {
        System.out.println("getShipType");
        SubmarineImpl instance = new SubmarineImpl();
        String expResult = "submarine";
        String result = instance.getShipType();
        assertEquals(expResult, result);
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        SubmarineImpl instance = new SubmarineImpl();
        String expResult = "S";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetLength() {
        System.out.println("getLength");
        SubmarineImpl instance = new SubmarineImpl();
        int expResult = 1;
        int result = instance.getLength();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testOkToPlaceShipInBounds() {
        System.out.println("okToPlaceShipInBounds");
        boolean horizontal = false;
        Ocean ocean = new OceanImpl();
        ShipImpl instance = new SubmarineImpl();
               
        boolean expResult = true;
        boolean result = instance.okToPlaceShipAt(0, 0, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(0, 1, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(0, 2, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(0, 3, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(0, 4, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(0, 5, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(0, 6, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(0, 7, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(0, 8, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(0, 9, horizontal, ocean);
        assertEquals(expResult, result);
        
        // row 1
        result = instance.okToPlaceShipAt(1, 0, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(1, 1, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(1, 2, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(1, 3, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(1, 4, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(1, 5, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(1, 6, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(1, 7, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(1, 8, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(1, 9, horizontal, ocean);
        assertEquals(expResult, result);

        // row 2
        result = instance.okToPlaceShipAt(2, 0, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(2, 1, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(2, 2, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(2, 3, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(2, 4, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(2, 5, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(2, 6, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(2, 7, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(2, 8, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(2, 9, horizontal, ocean);
        assertEquals(expResult, result);

        // row 2
        result = instance.okToPlaceShipAt(3, 0, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(3, 1, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(3, 2, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(3, 3, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(3, 4, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(3, 5, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(3, 6, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(3, 7, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(3, 8, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(3, 9, horizontal, ocean);
        assertEquals(expResult, result);

        // row 2
        result = instance.okToPlaceShipAt(4, 0, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(4, 1, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(4, 2, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(4, 3, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(4, 4, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(4, 5, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(4, 6, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(4, 7, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(4, 8, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(4, 9, horizontal, ocean);
        assertEquals(expResult, result);

        // row 2
        result = instance.okToPlaceShipAt(5, 0, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(5, 1, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(5, 2, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(5, 3, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(5, 4, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(5, 5, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(5, 6, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(5, 7, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(5, 8, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(5, 9, horizontal, ocean);
        assertEquals(expResult, result);

        // row 2
        result = instance.okToPlaceShipAt(6, 0, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(6, 1, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(6, 2, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(6, 3, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(6, 4, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(6, 5, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(6, 6, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(6, 7, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(6, 8, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(6, 9, horizontal, ocean);
        assertEquals(expResult, result);

        // row 2
        result = instance.okToPlaceShipAt(7, 0, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(7, 1, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(7, 2, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(7, 3, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(7, 4, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(7, 5, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(7, 6, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(7, 7, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(7, 8, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(7, 9, horizontal, ocean);
        assertEquals(expResult, result);

        // row 2
        result = instance.okToPlaceShipAt(8, 0, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(8, 1, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(8, 2, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(8, 3, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(8, 4, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(8, 5, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(8, 6, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(8, 7, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(8, 8, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(8, 9, horizontal, ocean);
        assertEquals(expResult, result);

        // row 2
        result = instance.okToPlaceShipAt(9, 0, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(9, 1, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(9, 2, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(9, 3, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(9, 4, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(9, 5, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(9, 6, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(9, 7, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(9, 8, horizontal, ocean);
        assertEquals(expResult, result);
        
        result = instance.okToPlaceShipAt(9, 9, horizontal, ocean);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testPlaceShipOutOfBounds() {
        System.out.println("placeShipOutOfBounds");
        int row = 0;
        int column = 10;
        boolean horizontal = false;
        Ocean ocean = new OceanImpl();
        ShipImpl instance = new SubmarineImpl();
        assertFalse(instance.okToPlaceShipAt(0, 10, horizontal, ocean));
        assertFalse(instance.okToPlaceShipAt(1, 10, horizontal, ocean));
        assertFalse(instance.okToPlaceShipAt(2, 10, horizontal, ocean));
        assertFalse(instance.okToPlaceShipAt(3, 10, horizontal, ocean));
        assertFalse(instance.okToPlaceShipAt(4, 10, horizontal, ocean));
        assertFalse(instance.okToPlaceShipAt(5, 10, horizontal, ocean));
        assertFalse(instance.okToPlaceShipAt(6, 10, horizontal, ocean));
        assertFalse(instance.okToPlaceShipAt(7, 10, horizontal, ocean));
        assertFalse(instance.okToPlaceShipAt(8, 10, horizontal, ocean));
        assertFalse(instance.okToPlaceShipAt(9, 10, horizontal, ocean));
    }

    @Test
    public void testPlaceShipAt() {
        System.out.println("placeShipAt");
        int row = 0;
        int column = 0;
        boolean horizontal = false;
        Ocean ocean = new OceanImpl();
        ShipImpl instance = new SubmarineImpl();
        instance.placeShipAt(row, column, horizontal, ocean);

        String expResult = "submarine";
        
        Ship[][] map = ocean.getShipArray();
        Ship shipLocation1 = (Ship)map[0][0];
        String result1 = shipLocation1.getShipType();
        assertEquals(expResult, result1);
    }
    
    @Test
    public void testShootAtAndHitTarget() {
        System.out.println("shootAtAndHitTarget");
        
        // place the vessel.
        int locationRow = 0;
        int locationColumn = 0;
        boolean horizontal = true;
        Ocean ocean = new OceanImpl();
        ShipImpl instance = new SubmarineImpl();
        instance.okToPlaceShipAt(locationRow, locationColumn, horizontal, ocean);
        instance.placeShipAt(locationRow, locationColumn, horizontal, ocean);
        
        int shotsFiredPriorToShot = ocean.getShotsFired();
        int hitCountPriorToShotBeingFired = ocean.getHitCount();
        
        int targetRow = 0;
        int targetColumn = 0;
        boolean result = ocean.shootAt(targetRow, targetColumn);
        assertTrue(result);
        
        int shotsFiredAfterFiring = ocean.getShotsFired();
        assertTrue( shotsFiredPriorToShot < shotsFiredAfterFiring );
        
        int hitCountAfterShotBeingFired = ocean.getHitCount();
        assertTrue(hitCountPriorToShotBeingFired < hitCountAfterShotBeingFired);
        
        boolean isTheVesselSunk = instance.isSunk();
        assertTrue(isTheVesselSunk);
    }
    
    @Test
    public void testShootAtAndMissTarget() {
        System.out.println("shootAtAndMissTarget");
        
        // place the vessel.
        int placeAtRow = 1;
        int placeAtColumn = 1;
        boolean horizontal = true;
        Ocean ocean = new OceanImpl();
        ShipImpl instance = new SubmarineImpl();
        instance.okToPlaceShipAt(placeAtRow, placeAtColumn, horizontal, ocean);
        instance.placeShipAt(placeAtRow, placeAtColumn, horizontal, ocean);

        int targetRow = 0;
        int targetColumn = 0;
        boolean confirmedHit = ocean.shootAt(targetRow, targetColumn);
        assertFalse(confirmedHit);
        
        targetRow = 0;
        targetColumn = 1;
        confirmedHit = ocean.shootAt(targetRow, targetColumn);
        assertFalse(confirmedHit);

        targetRow = 0;
        targetColumn = 2;
        confirmedHit = ocean.shootAt(targetRow, targetColumn);
        assertFalse(confirmedHit);
        
        targetRow = 1;
        targetColumn = 0;
        confirmedHit = ocean.shootAt(targetRow, targetColumn);
        assertFalse(confirmedHit);
        
        targetRow = 1;
        targetColumn = 2;
        confirmedHit = ocean.shootAt(targetRow, targetColumn);
        assertFalse(confirmedHit);
        
        targetRow = 2;
        targetColumn = 0;
        confirmedHit = ocean.shootAt(targetRow, targetColumn);
        assertFalse(confirmedHit);
        
        targetRow = 2;
        targetColumn = 1;
        confirmedHit = ocean.shootAt(targetRow, targetColumn);
        assertFalse(confirmedHit);
        
        targetRow = 2;
        targetColumn = 2;
        confirmedHit = ocean.shootAt(targetRow, targetColumn);
        assertFalse(confirmedHit);

        boolean isTheVesselSunk = instance.isSunk();
        assertFalse(isTheVesselSunk);
    }

    @Test
    public void testIsSunkWithoutBeingHit() {
        System.out.println("isSunk");
        ShipImpl instance = new SubmarineImpl();
        boolean expResult = false;
        boolean result = instance.isSunk();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetLength() {
        System.out.println("setLength");
        int length = 1;
        ShipImpl instance = new SubmarineImpl();
        instance.setLength(length);
        int expResult = 1;
        int result = instance.getLength();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetBowRow() {
        System.out.println("getBowRow");
        ShipImpl instance = new SubmarineImpl();
        int expResult = 0;
        int result = instance.getBowRow();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetBowRow() {
        System.out.println("setBowRow");
        int bowRow = 0;
        ShipImpl instance = new SubmarineImpl();
        instance.setBowRow(bowRow);
        int expResult = 0;
        int result = instance.getBowRow();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetBowColumn() {
        System.out.println("getBowColumn");
        ShipImpl instance = new SubmarineImpl();
        int expResult = 0;
        int result = instance.getBowColumn();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetBowColumn() {
        System.out.println("setBowColumn");
        int bowColumn = 0;
        ShipImpl instance = new SubmarineImpl();
        instance.setBowColumn(bowColumn);
        int expResult = 0;
        int result = instance.getBowColumn();
        assertEquals(expResult, result);
    }

    @Test
    public void testIsHorizontal() {
        System.out.println("isHorizontal");
        ShipImpl instance = new SubmarineImpl();
        boolean expResult = false;
        boolean result = instance.isHorizontal();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetHorizontal() {
        System.out.println("setHorizontal");
        boolean horizontal = true;
        ShipImpl instance = new SubmarineImpl();
        instance.setHorizontal(horizontal);
        boolean expResult = true;
        boolean result = instance.isHorizontal();
        assertEquals(expResult, result);
    }
}