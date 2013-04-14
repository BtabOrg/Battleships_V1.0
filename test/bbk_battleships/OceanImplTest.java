/*
 * The OceanImplTest test cases ensure that the OceanImpl facilitates the 
 * features described in the specification of the Battleships game.
 */
package bbk_battleships;

import java.util.regex.Pattern;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * @author Bernard T. A. Baker <bernard@btab.org>
 */
public class OceanImplTest {

    @Test
    public void testGetDimension() {
        OceanImpl instance = new OceanImpl();
        int expResult = 10;
        int result = instance.getDimension();
        assertEquals("The ocean dimension is not correct.", expResult, result);
    }

    @Test(timeout = 10000)
    public void testPlaceAllShipsRandomly() {
        OceanImpl instance = new OceanImpl();
        boolean expResult = true;
        boolean result = instance.placeAllShipsRandomly();
        //System.out.println(instance.toString());
        assertEquals("The vessels were not placed randomly.",
                expResult, result);
    }

    @Test
    public void testIsOccupied() {
        OceanImpl instance = new OceanImpl();
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(0, 0));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(0, 1));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(0, 2));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(0, 3));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(0, 4));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(0, 5));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(0, 6));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(0, 7));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(0, 8));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(0, 9));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(1, 0));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(1, 1));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(1, 2));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(1, 3));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(1, 4));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(1, 5));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(1, 6));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(1, 7));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(1, 8));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(1, 9));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(2, 0));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(2, 1));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(2, 2));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(2, 3));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(2, 4));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(2, 5));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(2, 6));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(2, 7));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(2, 8));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(2, 9));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(3, 0));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(3, 1));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(3, 2));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(3, 3));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(3, 4));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(3, 5));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(3, 6));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(3, 7));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(3, 8));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(3, 9));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(4, 0));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(4, 1));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(4, 2));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(4, 3));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(4, 4));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(4, 5));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(4, 6));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(4, 7));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(4, 8));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(4, 9));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(5, 0));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(5, 1));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(5, 2));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(5, 3));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(5, 4));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(5, 5));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(5, 6));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(5, 7));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(5, 8));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(5, 9));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(6, 0));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(6, 1));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(6, 2));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(6, 3));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(6, 4));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(6, 5));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(6, 6));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(6, 7));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(6, 8));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(6, 9));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(7, 0));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(7, 1));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(7, 2));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(7, 3));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(7, 4));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(7, 5));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(7, 6));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(7, 7));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(7, 8));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(7, 9));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(8, 0));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(8, 1));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(8, 2));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(8, 3));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(8, 4));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(8, 5));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(8, 6));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(8, 7));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(8, 8));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(8, 9));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(9, 0));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(9, 1));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(9, 2));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(9, 3));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(9, 4));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(9, 5));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(9, 6));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(9, 7));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(9, 8));
        assertFalse("The ocean location was occupied, but the ocean is empty.",
                instance.isOccupied(9, 9));
    }

    @Test
    public void testShootAtAndMissTarget() {
        int deploymentRow = 0;
        int deploymentColumn = 0;
        OceanImpl ocean = new OceanImpl();
        boolean unoccupiedResult = false;
        boolean isItOccupied = ocean.isOccupied(deploymentRow,
                deploymentColumn);
        assertEquals("The location should not be occupied",
                unoccupiedResult, isItOccupied);

        Submarine submarine = new SubmarineImpl();
        boolean vesselIsHorizontal = true;
        boolean deployed = submarine.okToPlaceShipAt(deploymentRow,
                deploymentColumn, vesselIsHorizontal, ocean);
        assertTrue("It should be ok to place the vessel here.", deployed);

        submarine.placeShipAt(deploymentRow,
                deploymentColumn, vesselIsHorizontal, ocean);

        boolean expResult = false;
        int targetRow = 1;
        int targetColumn = 0;
        boolean result = ocean.shootAt(targetRow, targetColumn);
        assertEquals("The projectile should miss.", expResult, result);

        int recordedHit = 0;
        int actualHit = ocean.getHitCount();
        assertEquals("The projectile should not have hit the vessel.",
                recordedHit, actualHit);

        int shotsThatHaveBeenFired = 1;
        int actuallyShotsThatHaveBeenFired = 1;
        assertEquals("The number of shots fired is not correct.",
                shotsThatHaveBeenFired,
                actuallyShotsThatHaveBeenFired);
    }

    @Test
    public void testShootAtAndHitTarget() {

        int deploymentRow = 0;
        int deploymentColumn = 0;

        OceanImpl ocean = new OceanImpl();

        boolean unoccupiedResult = false;
        boolean isItOccupied = ocean.isOccupied(deploymentRow,
                deploymentColumn);
        assertEquals("The location should not be occupied.",
                unoccupiedResult, isItOccupied);

        Submarine submarine = new SubmarineImpl();
        boolean vesselIsHorizontal = true;
        boolean deployed = submarine.okToPlaceShipAt(0, 0, true, ocean);
        assertTrue("It should be ok to place a vessel here.", deployed);

        submarine.placeShipAt(deploymentRow,
                deploymentColumn, vesselIsHorizontal, ocean);

        boolean expResult = true;
        int targetRow = 0;
        int targetColumn = 0;
        boolean result = ocean.shootAt(targetRow, targetColumn);
        assertEquals("The projectile should have hit the vessel",
                expResult, result);

        int shotsThatHaveBeenFired = 1;
        int actualShotsThatHaveBeenFired = 1;
        assertEquals("The number of shots fired is not correct.",
                shotsThatHaveBeenFired,
                actualShotsThatHaveBeenFired);

        int recordedHit = 1;
        int actualHit = ocean.getHitCount();
        assertEquals(
                "The recorded number of hits upon the vessel is not correct",
                recordedHit,
                actualHit);
    }

    @Test
    public void testIsGameOver() {
        OceanImpl instance = new OceanImpl();
        boolean expResult = false;
        boolean result = instance.isGameOver();
        assertEquals("The game should not be over.", expResult, result);
    }

    @Test
    public void testGetShipsSunk() {
        Ocean ocean = new OceanImpl();
        int expResult = 0;
        int result = ocean.getShipsSunk();
        assertEquals("The total number of ships sunk is not correct.",
                expResult, result);
    }

    @Test
    public void testGetShipArray() {
        OceanImpl instance = new OceanImpl();
        Ship[][] result = instance.getShipArray();
        Ship[][] expResult = result.clone();
        assertArrayEquals("The copy of the ocean should be the same.",
                expResult, result);
    }

    @Test
    public void testPrintFinalScores() {
        OceanImpl instance = new OceanImpl();
        String expResult = "GAME OVER!! You scored 0. You sank 0 ships "
                + "and used 0 shots.";
        boolean result = Pattern.matches(expResult,
                instance.printFinalScores());
        assertTrue("The print final scores should be the same.", result);
    }

    @Test
    public void testGetShotsFired() {
        OceanImpl instance = new OceanImpl();
        int expResult = 0;
        int result = instance.getShotsFired();
        assertEquals("The number of shots fired is incorrect.",
                expResult, result);
    }

    @Test
    public void testSetShotsFired() {
        int shotsFired = 10;
        OceanImpl instance = new OceanImpl();
        instance.setShotsFired(shotsFired);
        int expResult = 10;
        int result = instance.getShotsFired();
        assertEquals("The number of shots fired is incorrect.",
                expResult, result);
    }

    @Test
    public void testGetHitCount() {
        OceanImpl instance = new OceanImpl();
        int expResult = 0;
        int result = instance.getHitCount();
        assertEquals("The number of hits upon the vessel is incorrect.",
                expResult, result);
    }
}