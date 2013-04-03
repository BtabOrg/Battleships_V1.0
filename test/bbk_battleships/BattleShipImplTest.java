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
public class BattleShipImplTest {
    
    public BattleShipImplTest() {
    }

    @Test
    public void testGetShipType() {
        System.out.println("getShipType");
        BattleShipImpl instance = new BattleShipImpl();
        String expResult = "battleship";
        String result = instance.getShipType();
        assertEquals(expResult, result);
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        BattleShipImpl instance = new BattleShipImpl();
        String expResult = "B";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetLength() {
        System.out.println("getLength");
        BattleShipImpl instance = new BattleShipImpl();
        int expResult = 4;
        int result = instance.getLength();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testOkToPlaceShipInBounds() {
        System.out.println("okToPlaceShipInBounds");
        int row = 0;
        int column = 0;
        boolean horizontal = false;
        Ocean ocean = new OceanImpl();
        ShipImpl instance = new BattleShipImpl();
        boolean expResult = true;
        boolean result = instance.okToPlaceShipAt(row, column, horizontal, ocean);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testNotOkToPlaceShipOutOfBounds() {
        System.out.println("notOkToPlaceShipOutOfBounds");
        int row = 7;
        int column = 9;
        boolean horizontal = false;
        Ocean ocean = new OceanImpl();
        ShipImpl instance = new BattleShipImpl();
        boolean expResult = false;
        boolean result = instance.okToPlaceShipAt(row, column, horizontal, ocean);
        assertEquals(expResult, result);
    }

    @Test
    public void testPlaceShipAt() {
        System.out.println("placeShipAt");
        int row = 0;
        int column = 0;
        boolean horizontal = false;
        Ocean ocean = new OceanImpl();
        ShipImpl instance = new BattleShipImpl();
        instance.placeShipAt(row, column, horizontal, ocean);

        String expResult = "battleship";
        
        Ship[][] map = ocean.getShipArray();
        Ship shipLocation1 = (Ship)map[0][0];
        String result1 = shipLocation1.getShipType();
        assertEquals(expResult, result1);
        
        Ship shipLocation2 = (Ship)map[1][0];
        String result2 = shipLocation2.getShipType();
        assertEquals(expResult, result2);
        
        Ship shipLocation3 = (Ship)map[2][0];
        String result3 = shipLocation3.getShipType();
        assertEquals(expResult, result3);
        
        Ship shipLocation4 = (Ship)map[3][0];
        String result4 = shipLocation4.getShipType();
        assertEquals(expResult, result4);
    }

    @Test
    public void testShootAtAndHitTargetUntilItIsSunk() {
        System.out.println("shootAtAndHitTargetUntilItIsSunk");
        // create the ocean and the vessel
        Ocean ocean = new OceanImpl();
        ShipImpl instance = new BattleShipImpl();
        
        // place the vessel.
        int locationRow = 0;
        int locationColumn = 0;
        boolean horizontal = true;
        instance.okToPlaceShipAt(locationRow, locationColumn, horizontal, ocean);
        instance.placeShipAt(locationRow, locationColumn, horizontal, ocean);
        
        // check that no shots have been fired and the vessel is afloat.
        assertEquals(0, ocean.getShotsFired());
        assertEquals(0, ocean.getHitCount());
        assertFalse(instance.isSunk());
        
        int firstTargetRow = 0;
        int firstTargetColumn = 0;
        boolean firstConfirmedHit = ocean.shootAt(firstTargetRow, firstTargetColumn);
        assertTrue(firstConfirmedHit);
        
        int totalNumberOfShotsAfterFirstShot = 1;
        assertEquals(totalNumberOfShotsAfterFirstShot, ocean.getShotsFired());
        
        int hitCountAfterFirstShot = 1;
        assertEquals(hitCountAfterFirstShot, ocean.getHitCount());
        
        int secondTargetRow = 0;
        int secondTargetColumn = 1;
        boolean secondConfirmedHit = ocean.shootAt(secondTargetRow, secondTargetColumn);
        assertTrue(secondConfirmedHit);
        
        int totalNumberOfShotsAfterSecondShot = 2;
        assertEquals(totalNumberOfShotsAfterSecondShot, ocean.getShotsFired());
                
        int hitCountAfterSecondShot = 2;
        assertEquals(hitCountAfterSecondShot, ocean.getHitCount());
        
        int thirdTargetRow = 0;
        int thirdTargetColumn = 2;
        boolean thirdConfirmedHit = ocean.shootAt(thirdTargetRow, thirdTargetColumn);
        assertTrue(thirdConfirmedHit);
        
        int totalNumberOfShotsAfterThirdShot = 3;
        assertEquals(totalNumberOfShotsAfterThirdShot, ocean.getShotsFired());
                
        int hitCountAfterThirdShot = 3;
        assertEquals(hitCountAfterThirdShot, ocean.getHitCount());
        
        int fourthTargetRow = 0;
        int fourthTargetColumn = 3;
        boolean fourthConfirmedHit = ocean.shootAt(fourthTargetRow, fourthTargetColumn);
        assertTrue(fourthConfirmedHit);
        
        int totalNumberOfShotsAfterFourthShot = 4;
        assertEquals(totalNumberOfShotsAfterFourthShot, ocean.getShotsFired());
                
        int hitCountAfterFourthShot = 4;
        assertEquals(hitCountAfterFourthShot, ocean.getHitCount());
        
        boolean isTheVesselSunk = instance.isSunk();
        assertTrue(isTheVesselSunk);
    }
    
    @Test
    public void testShootAtAndMissTarget() {
        System.out.println("shootAtAndMissTarget");
        
        // place the vessel.
        int placeAtRow = 0;
        int placeAtColumn = 0;
        boolean horizontal = true;
        Ocean ocean = new OceanImpl();
        ShipImpl instance = new BattleShipImpl();
        instance.okToPlaceShipAt(placeAtRow, placeAtColumn, horizontal, ocean);
        instance.placeShipAt(placeAtRow, placeAtColumn, horizontal, ocean);
                
        int targetRow = 1;
        int targetColumn = 0;
        boolean confirmedHit = ocean.shootAt(targetRow, targetColumn);
        assertFalse(confirmedHit);
        
        targetRow = 1;
        targetColumn = 1;
        confirmedHit = ocean.shootAt(targetRow, targetColumn);
        assertFalse(confirmedHit);
        
        targetRow = 1;
        targetColumn = 2;
        confirmedHit = ocean.shootAt(targetRow, targetColumn);
        assertFalse(confirmedHit);
        
        targetRow = 1;
        targetColumn = 3;
        confirmedHit = ocean.shootAt(targetRow, targetColumn);
        assertFalse(confirmedHit);

        targetRow = 0;
        targetColumn = 4;
        confirmedHit = ocean.shootAt(targetRow, targetColumn);
        assertFalse(confirmedHit);
        
        boolean isTheVesselSunk = instance.isSunk();
        assertFalse(isTheVesselSunk);
    }

    @Test
    public void testIsSunkWithoutBeingHit() {
        System.out.println("isSunk");
        ShipImpl instance = new BattleShipImpl();
        boolean expResult = false;
        boolean result = instance.isSunk();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetLength() {
        System.out.println("setLength");
        int length = 4;
        ShipImpl instance = new BattleShipImpl();
        instance.setLength(length);
        int expResult = 4;
        int result = instance.getLength();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetBowRow() {
        System.out.println("getBowRow");
        ShipImpl instance = new BattleShipImpl();
        int expResult = 0;
        int result = instance.getBowRow();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetBowRow() {
        System.out.println("setBowRow");
        int bowRow = 0;
        ShipImpl instance = new BattleShipImpl();
        instance.setBowRow(bowRow);
        int expResult = 0;
        int result = instance.getBowRow();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetBowColumn() {
        System.out.println("getBowColumn");
        ShipImpl instance = new BattleShipImpl();
        int expResult = 0;
        int result = instance.getBowColumn();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetBowColumn() {
        System.out.println("setBowColumn");
        int bowColumn = 0;
        ShipImpl instance = new BattleShipImpl();
        instance.setBowColumn(bowColumn);
        int expResult = 0;
        int result = instance.getBowColumn();
        assertEquals(expResult, result);
    }

    @Test
    public void testIsHorizontal() {
        System.out.println("isHorizontal");
        ShipImpl instance = new BattleShipImpl();
        boolean expResult = false;
        boolean result = instance.isHorizontal();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetHorizontal() {
        System.out.println("setHorizontal");
        boolean horizontal = true;
        ShipImpl instance = new BattleShipImpl();
        instance.setHorizontal(horizontal);
        boolean expResult = true;
        boolean result = instance.isHorizontal();
        assertEquals(expResult, result);
    }
}