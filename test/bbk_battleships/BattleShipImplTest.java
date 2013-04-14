/*
 * The BattleshipImplTest test cases ensure that the BattleshipTest facilitates
 * the features described in the specification of the Battleships game.
 */
package bbk_battleships;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * @author Bernard T. A. Baker <bernard@btab.org>
 */
public class BattleShipImplTest {

    @Test
    public void testGetShipType() {
        BattleShipImpl instance = new BattleShipImpl();
        String expResult = "battleship";
        String result = instance.getShipType();
        assertEquals(expResult, result);
        assertEquals("The vessel is not correct.", expResult, result);
    }

    @Test
    public void testToString() {
        BattleShipImpl instance = new BattleShipImpl();
        String expResult = "B";
        String result = instance.toString();
        assertEquals(expResult, result);
        assertEquals("The default vessel identifier is not correct.",
                expResult, result);
    }

    @Test
    public void testGetLength() {
        BattleShipImpl instance = new BattleShipImpl();
        int expResult = 4;
        int result = instance.getLength();
        assertEquals(expResult, result);
        assertEquals("The length is not correct.", expResult, result);
    }

    @Test
    public void testOkToPlaceShipInBounds() {
        boolean horizontal = false;
        Ocean ocean = new OceanImpl();
        ShipImpl instance = new BattleShipImpl();

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

    }

    @Test
    public void testNotOkToPlaceShipOutOfBounds() {
        boolean horizontal = false;
        Ocean ocean = new OceanImpl();
        ShipImpl instance = new BattleShipImpl();
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
        ShipImpl instance = new BattleShipImpl();
        instance.placeShipAt(row, column, horizontal, ocean);

        String expResult = "battleship";

        Ship[][] map = ocean.getShipArray();
        Ship shipLocation1 = (Ship) map[0][0];
        String result1 = shipLocation1.getShipType();
        assertEquals("The vessel located here is not the right vessel.",
                expResult, result1);

        Ship shipLocation2 = (Ship) map[1][0];
        String result2 = shipLocation2.getShipType();
        assertEquals("The vessel located here is not the right vessel.",
                expResult, result2);

        Ship shipLocation3 = (Ship) map[2][0];
        String result3 = shipLocation3.getShipType();
        assertEquals("The vessel located here is not the right vessel.",
                expResult, result3);

        Ship shipLocation4 = (Ship) map[3][0];
        String result4 = shipLocation4.getShipType();
        assertEquals("The vessel located here is not the right vessel.",
                expResult, result4);
    }

    @Test
    public void testShootAtAndHitTargetUntilItIsSunk() {
        // create the ocean and the vessel
        Ocean ocean = new OceanImpl();
        ShipImpl instance = new BattleShipImpl();

        // place the vessel.
        int locationRow = 0;
        int locationColumn = 0;
        boolean horizontal = true;
        instance.okToPlaceShipAt(locationRow, locationColumn, horizontal,
                ocean);
        instance.placeShipAt(locationRow, locationColumn, horizontal, ocean);

        // check that no shots have been fired and the vessel is afloat.
        assertEquals("No shots will have been fired yet.", 0,
                ocean.getShotsFired());
        assertEquals("The vessel should not have been hit yet.", 0,
                ocean.getHitCount());
        assertFalse("The vessel should not be sunk.", instance.isSunk());

        int firstTargetRow = 0;
        int firstTargetColumn = 0;
        boolean firstConfirmedHit = ocean.shootAt(firstTargetRow,
                firstTargetColumn);
        assertTrue("The projectile should have hit the vessel.",
                firstConfirmedHit);

        int totalNumberOfShotsAfterFirstShot = 1;
        assertEquals("The total number of shots should be 1.",
                totalNumberOfShotsAfterFirstShot, ocean.getShotsFired());

        int hitCountAfterFirstShot = 1;
        assertEquals("The vessel should have been hit 1 times.",
                hitCountAfterFirstShot, ocean.getHitCount());

        int secondTargetRow = 0;
        int secondTargetColumn = 1;
        boolean secondConfirmedHit = ocean.shootAt(secondTargetRow,
                secondTargetColumn);
        assertTrue("The projectile should have hit the vessel.",
                secondConfirmedHit);

        int totalNumberOfShotsAfterSecondShot = 2;
        assertEquals("The total number of shots should be 2.",
                totalNumberOfShotsAfterSecondShot, ocean.getShotsFired());

        int hitCountAfterSecondShot = 2;
        assertEquals("The vessel should have been hit 2 times.",
                hitCountAfterSecondShot, ocean.getHitCount());

        int thirdTargetRow = 0;
        int thirdTargetColumn = 2;
        boolean thirdConfirmedHit = ocean.shootAt(thirdTargetRow,
                thirdTargetColumn);
        assertTrue("The projectile should have hit the vessel.",
                thirdConfirmedHit);

        int totalNumberOfShotsAfterThirdShot = 3;
        assertEquals("The total number of shots should be 3.",
                totalNumberOfShotsAfterThirdShot, ocean.getShotsFired());

        int hitCountAfterThirdShot = 3;
        assertEquals("The vessel should have been hit 3 times.",
                hitCountAfterThirdShot, ocean.getHitCount());

        int fourthTargetRow = 0;
        int fourthTargetColumn = 3;
        boolean fourthConfirmedHit = ocean.shootAt(fourthTargetRow,
                fourthTargetColumn);
        assertTrue("The projectile should have hit the vessel.",
                fourthConfirmedHit);

        int totalNumberOfShotsAfterFourthShot = 4;
        assertEquals("The total number of shots should be 4.",
                totalNumberOfShotsAfterFourthShot, ocean.getShotsFired());

        int hitCountAfterFourthShot = 4;
        assertEquals("The vessel should have been hit 4 times.",
                hitCountAfterFourthShot, ocean.getHitCount());

        boolean isTheVesselSunk = instance.isSunk();
        assertTrue("The vessel should be sunk.", isTheVesselSunk);
    }

    @Test
    public void testShootAtAndMissTarget() {
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
        assertFalse("The projectile should not have beeen hit.", confirmedHit);

        targetRow = 1;
        targetColumn = 1;
        confirmedHit = ocean.shootAt(targetRow, targetColumn);
        assertFalse("The projectile should not have been hit.", confirmedHit);

        targetRow = 1;
        targetColumn = 2;
        confirmedHit = ocean.shootAt(targetRow, targetColumn);
        assertFalse("The projectile should not have been hit.", confirmedHit);

        targetRow = 1;
        targetColumn = 3;
        confirmedHit = ocean.shootAt(targetRow, targetColumn);
        assertFalse("The projectile should not have been hit.", confirmedHit);

        targetRow = 0;
        targetColumn = 4;
        confirmedHit = ocean.shootAt(targetRow, targetColumn);
        assertFalse("The projectile should not have been hit.", confirmedHit);

        boolean isTheVesselSunk = instance.isSunk();
        assertFalse("The vessel should not have sunk.", isTheVesselSunk);
    }

    @Test
    public void testIsSunkWithoutBeingHit() {
        ShipImpl instance = new BattleShipImpl();
        boolean expResult = false;
        boolean result = instance.isSunk();
        assertEquals("The vessel should not be sunk.", expResult, result);
    }

    @Test
    public void testSetLength() {
        int length = 4;
        ShipImpl instance = new BattleShipImpl();
        instance.setLength(length);
        int expResult = 4;
        int result = instance.getLength();
        assertEquals("The length is not correct.", expResult, result);
    }

    @Test
    public void testGetBowRow() {
        ShipImpl instance = new BattleShipImpl();
        int expResult = 0;
        int result = instance.getBowRow();
        assertEquals("The bow row value is not correct.", expResult, result);
    }

    @Test
    public void testSetBowRow() {
        int bowRow = 0;
        ShipImpl instance = new BattleShipImpl();
        instance.setBowRow(bowRow);
        int expResult = 0;
        int result = instance.getBowRow();
        assertEquals("The bow row value was not set correctly.",
                expResult, result);
    }

    @Test
    public void testGetBowColumn() {
        ShipImpl instance = new BattleShipImpl();
        int expResult = 0;
        int result = instance.getBowColumn();
        assertEquals(expResult, result);
        assertEquals("The bow column is not correct.", expResult, result);
    }

    @Test
    public void testSetBowColumn() {
        int bowColumn = 0;
        ShipImpl instance = new BattleShipImpl();
        instance.setBowColumn(bowColumn);
        int expResult = 0;
        int result = instance.getBowColumn();
        assertEquals("The bow column was not set correctly.",
                expResult, result);
    }

    @Test
    public void testIsHorizontal() {
        ShipImpl instance = new BattleShipImpl();
        boolean expResult = false;
        boolean result = instance.isHorizontal();
        assertEquals("The vessel should not be horizontal.",
                expResult, result);
    }

    @Test
    public void testSetHorizontal() {
        boolean horizontal = true;
        ShipImpl instance = new BattleShipImpl();
        instance.setHorizontal(horizontal);
        boolean expResult = true;
        boolean result = instance.isHorizontal();
        assertEquals("The vessel should be horizontal.", expResult, result);
    }
}