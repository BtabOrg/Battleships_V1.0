/*
 * The SubmarineImplTest test cases ensure that the SubmarineImpl facilitates
 * the features described in the specification of the Battleships game.
 */
package bbk_battleships;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * @author Bernard T. A. Baker <bernard@btab.org>
 */
public class SubmarineImplTest {

    @Test
    public void testGetShipType() {
        SubmarineImpl instance = new SubmarineImpl();
        String expResult = "submarine";
        String result = instance.getShipType();
        assertEquals("The vessel is not correct.",expResult, result);
    }
    
    @Test
    public void testToString() {
        SubmarineImpl instance = new SubmarineImpl();
        String expResult = "S";
        String result = instance.toString();
        assertEquals("The default vessel identifier is not correct.",
                expResult, result);
    }

    @Test
    public void testGetLength() {
        SubmarineImpl instance = new SubmarineImpl();
        int expResult = 1;
        int result = instance.getLength();
        assertEquals("The length is not correct.",expResult, result);
    }
    
    @Test
    public void testOkToPlaceShipInBounds() {
        boolean horizontal = false;
        Ocean ocean = new OceanImpl();
        ShipImpl instance = new SubmarineImpl();
               
        boolean expResult = true;
        boolean result = instance.okToPlaceShipAt(0, 0, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(0, 1, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(0, 2, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(0, 3, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(0, 4, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(0, 5, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(0, 6, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(0, 7, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(0, 8, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(0, 9, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(1, 0, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(1, 1, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(1, 2, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(1, 3, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(1, 4, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(1, 5, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(1, 6, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(1, 7, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(1, 8, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(1, 9, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);

        result = instance.okToPlaceShipAt(2, 0, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(2, 1, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(2, 2, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(2, 3, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(2, 4, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(2, 5, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(2, 6, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(2, 7, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(2, 8, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(2, 9, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);

        result = instance.okToPlaceShipAt(3, 0, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(3, 1, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(3, 2, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(3, 3, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(3, 4, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(3, 5, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(3, 6, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(3, 7, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(3, 8, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(3, 9, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);

        result = instance.okToPlaceShipAt(4, 0, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(4, 1, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(4, 2, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(4, 3, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(4, 4, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(4, 5, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(4, 6, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(4, 7, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(4, 8, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(4, 9, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);

        result = instance.okToPlaceShipAt(5, 0, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(5, 1, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(5, 2, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(5, 3, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(5, 4, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(5, 5, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(5, 6, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(5, 7, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(5, 8, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(5, 9, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);

        result = instance.okToPlaceShipAt(6, 0, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(6, 1, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(6, 2, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(6, 3, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(6, 4, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(6, 5, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(6, 6, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(6, 7, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(6, 8, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(6, 9, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);

        result = instance.okToPlaceShipAt(7, 0, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(7, 1, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(7, 2, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(7, 3, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(7, 4, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(7, 5, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(7, 6, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(7, 7, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(7, 8, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(7, 9, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);

        result = instance.okToPlaceShipAt(8, 0, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(8, 1, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(8, 2, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(8, 3, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(8, 4, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(8, 5, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(8, 6, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(8, 7, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(8, 8, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(8, 9, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);

        result = instance.okToPlaceShipAt(9, 0, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(9, 1, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(9, 2, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(9, 3, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(9, 4, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(9, 5, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(9, 6, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(9, 7, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(9, 8, horizontal, ocean);
        assertEquals("It is not ok to place the ship.", expResult, result);
        
        result = instance.okToPlaceShipAt(9, 9, horizontal, ocean);
        assertEquals("It is not ok to place the vessel.", expResult, result);
    }
    
    @Test
    public void testPlaceShipOutOfBounds() {
        boolean horizontal = true;
        Ocean ocean = new OceanImpl();
        ShipImpl instance = new SubmarineImpl();
        assertFalse("The vessel was placed incorrectly.", 
                instance.okToPlaceShipAt(0, 10, horizontal, ocean));
        assertFalse("The vessel was placed incorrectly.", 
                instance.okToPlaceShipAt(1, 10, horizontal, ocean));
        assertFalse("The vessel was placed incorrectly.", 
                instance.okToPlaceShipAt(2, 10, horizontal, ocean));
        assertFalse("The vessel was placed incorrectly.", 
                instance.okToPlaceShipAt(3, 10, horizontal, ocean));
        assertFalse("The vessel was placed incorrectly.", 
                instance.okToPlaceShipAt(4, 10, horizontal, ocean));
        assertFalse("The vessel was placed incorrectly.", 
                instance.okToPlaceShipAt(5, 10, horizontal, ocean));
        assertFalse("The vessel was placed incorrectly.", 
                instance.okToPlaceShipAt(6, 10, horizontal, ocean));
        assertFalse("The vessel was placed incorrectly.", 
                instance.okToPlaceShipAt(7, 10, horizontal, ocean));
        assertFalse("The vessel was placed incorrectly.", 
                instance.okToPlaceShipAt(8, 10, horizontal, ocean));
        assertFalse("The vessel was placed incorrectly.", 
                instance.okToPlaceShipAt(9, 10, horizontal, ocean));
    }

    @Test
    public void testPlaceShipAt() {
        int row = 0;
        int column = 0;
        boolean horizontal = false;
        Ocean ocean = new OceanImpl();
        ShipImpl instance = new SubmarineImpl();
        instance.placeShipAt(row, column, horizontal, ocean);

        Ship[][] map = ocean.getShipArray();
        Ship shipLocation1 = (Ship)map[0][0];
        String expResult = "submarine";
        String result1 = shipLocation1.getShipType();
        assertEquals("The vessel located here is not the right vessel.",
                expResult, result1);
    }
    
    @Test
    public void testShootAtAndHitTarget() {
        int locationRow = 0;
        int locationColumn = 0;
        boolean horizontal = true;
        Ocean ocean = new OceanImpl();
        ShipImpl instance = new SubmarineImpl();
        instance.okToPlaceShipAt(locationRow, locationColumn, horizontal,
                ocean);
        instance.placeShipAt(locationRow, locationColumn, horizontal, ocean);
        
        int shotsFiredPriorToShot = ocean.getShotsFired();
        int hitCountPriorToShotBeingFired = ocean.getHitCount();
        
        int targetRow = 0;
        int targetColumn = 0;
        boolean result = ocean.shootAt(targetRow, targetColumn);
        assertTrue("The target was missed.", result);
        
        int shotsFiredAfterFiring = ocean.getShotsFired();
        assertTrue("The shot fired result is not correct.", 
                shotsFiredPriorToShot < shotsFiredAfterFiring );
        
        int hitCountAfterShotBeingFired = ocean.getHitCount();
        assertTrue("The vessels that have been hit is not correct.", 
                hitCountPriorToShotBeingFired < hitCountAfterShotBeingFired);
        
        boolean isTheVesselSunk = instance.isSunk();
        assertTrue("The vessel has not been sunk.", isTheVesselSunk);
    }
    
    @Test
    public void testShootAtAndMissTarget() {        
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
        
        //System.out.println(ocean.toString());
    }

    @Test
    public void testIsSunkWithoutBeingHit() {
        ShipImpl instance = new SubmarineImpl();
        boolean expResult = false;
        boolean result = instance.isSunk();
        assertEquals("The vessel should not be sunk.",expResult, result);
    }

    @Test
    public void testGetBowRow() {
        ShipImpl instance = new SubmarineImpl();
        int expResult = 0;
        int result = instance.getBowRow();
        assertEquals("The bow row value is not correct.", expResult, result);
    }

    @Test
    public void testSetBowRow() {
        int bowRow = 0;
        ShipImpl instance = new SubmarineImpl();
        instance.setBowRow(bowRow);
        int expResult = 0;
        int result = instance.getBowRow();
        assertEquals("The bow row value was not set correctly.",
                expResult, result);
    }

    @Test
    public void testGetBowColumn() {
        ShipImpl instance = new SubmarineImpl();
        int expResult = 0;
        int result = instance.getBowColumn();
        assertEquals("The bow column is not correct.", expResult, result);
    }

    @Test
    public void testSetBowColumn() {
        int bowColumn = 0;
        ShipImpl instance = new SubmarineImpl();
        instance.setBowColumn(bowColumn);
        int expResult = 0;
        int result = instance.getBowColumn();
        assertEquals("The bow column was not set correctly.",
                expResult, result);
    }

    @Test
    public void testIsHorizontal() {
        ShipImpl instance = new SubmarineImpl();
        boolean expResult = false;
        boolean result = instance.isHorizontal();
        assertEquals("The vessel should not be horizontal.",
                expResult, result);
    }

    @Test
    public void testSetHorizontal() {
        boolean horizontal = true;
        ShipImpl instance = new SubmarineImpl();
        instance.setHorizontal(horizontal);
        boolean expResult = true;
        boolean result = instance.isHorizontal();
        assertEquals("The vessel should be horizontal.", expResult, result);
    }

}