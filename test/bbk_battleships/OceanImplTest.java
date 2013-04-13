/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bbk_battleships;

import java.util.regex.Pattern;
import static org.junit.Assert.*;
import org.junit.Test;

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
        int expResult = 10;
        int result = instance.getDimension();
        assertEquals(expResult, result);
    }
    
    @Test(timeout=10000)
    public void testPlaceAllShipsRandomly() {
        System.out.println("placeAllShipsRandomly");
        OceanImpl instance = new OceanImpl();
        boolean expResult = true;
        boolean result = instance.placeAllShipsRandomly();
        System.out.println(instance.toString());
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsOccupied() {
        System.out.println("isOccupied");
        OceanImpl instance = new OceanImpl();
        assertFalse(instance.isOccupied(0, 0));
        assertFalse(instance.isOccupied(0, 1));
        assertFalse(instance.isOccupied(0, 2));
        assertFalse(instance.isOccupied(0, 3));
        assertFalse(instance.isOccupied(0, 4));
        assertFalse(instance.isOccupied(0, 5));
        assertFalse(instance.isOccupied(0, 6));
        assertFalse(instance.isOccupied(0, 7));
        assertFalse(instance.isOccupied(0, 8));
        assertFalse(instance.isOccupied(0, 9));
        assertFalse(instance.isOccupied(1, 0));
        assertFalse(instance.isOccupied(1, 1));
        assertFalse(instance.isOccupied(1, 2));
        assertFalse(instance.isOccupied(1, 3));
        assertFalse(instance.isOccupied(1, 4));
        assertFalse(instance.isOccupied(1, 5));
        assertFalse(instance.isOccupied(1, 6));
        assertFalse(instance.isOccupied(1, 7));
        assertFalse(instance.isOccupied(1, 8));
        assertFalse(instance.isOccupied(1, 9));
        assertFalse(instance.isOccupied(2, 0));
        assertFalse(instance.isOccupied(2, 1));
        assertFalse(instance.isOccupied(2, 2));
        assertFalse(instance.isOccupied(2, 3));
        assertFalse(instance.isOccupied(2, 4));
        assertFalse(instance.isOccupied(2, 5));
        assertFalse(instance.isOccupied(2, 6));
        assertFalse(instance.isOccupied(2, 7));
        assertFalse(instance.isOccupied(2, 8));
        assertFalse(instance.isOccupied(2, 9));
        assertFalse(instance.isOccupied(3, 0));
        assertFalse(instance.isOccupied(3, 1));
        assertFalse(instance.isOccupied(3, 2));
        assertFalse(instance.isOccupied(3, 3));
        assertFalse(instance.isOccupied(3, 4));
        assertFalse(instance.isOccupied(3, 5));
        assertFalse(instance.isOccupied(3, 6));
        assertFalse(instance.isOccupied(3, 7));
        assertFalse(instance.isOccupied(3, 8));
        assertFalse(instance.isOccupied(3, 9));
        assertFalse(instance.isOccupied(4, 0));
        assertFalse(instance.isOccupied(4, 1));
        assertFalse(instance.isOccupied(4, 2));
        assertFalse(instance.isOccupied(4, 3));
        assertFalse(instance.isOccupied(4, 4));
        assertFalse(instance.isOccupied(4, 5));
        assertFalse(instance.isOccupied(4, 6));
        assertFalse(instance.isOccupied(4, 7));
        assertFalse(instance.isOccupied(4, 8));
        assertFalse(instance.isOccupied(4, 9));
        assertFalse(instance.isOccupied(5, 0));
        assertFalse(instance.isOccupied(5, 1));
        assertFalse(instance.isOccupied(5, 2));
        assertFalse(instance.isOccupied(5, 3));
        assertFalse(instance.isOccupied(5, 4));
        assertFalse(instance.isOccupied(5, 5));
        assertFalse(instance.isOccupied(5, 6));
        assertFalse(instance.isOccupied(5, 7));
        assertFalse(instance.isOccupied(5, 8));
        assertFalse(instance.isOccupied(5, 9));
        assertFalse(instance.isOccupied(6, 0));
        assertFalse(instance.isOccupied(6, 1));
        assertFalse(instance.isOccupied(6, 2));
        assertFalse(instance.isOccupied(6, 3));
        assertFalse(instance.isOccupied(6, 4));
        assertFalse(instance.isOccupied(6, 5));
        assertFalse(instance.isOccupied(6, 6));
        assertFalse(instance.isOccupied(6, 7));
        assertFalse(instance.isOccupied(6, 8));
        assertFalse(instance.isOccupied(6, 9));
        assertFalse(instance.isOccupied(7, 0));
        assertFalse(instance.isOccupied(7, 1));
        assertFalse(instance.isOccupied(7, 2));
        assertFalse(instance.isOccupied(7, 3));
        assertFalse(instance.isOccupied(7, 4));
        assertFalse(instance.isOccupied(7, 5));
        assertFalse(instance.isOccupied(7, 6));
        assertFalse(instance.isOccupied(7, 7));
        assertFalse(instance.isOccupied(7, 8));
        assertFalse(instance.isOccupied(7, 9));
        assertFalse(instance.isOccupied(8, 0));
        assertFalse(instance.isOccupied(8, 1));
        assertFalse(instance.isOccupied(8, 2));
        assertFalse(instance.isOccupied(8, 3));
        assertFalse(instance.isOccupied(8, 4));
        assertFalse(instance.isOccupied(8, 5));
        assertFalse(instance.isOccupied(8, 6));
        assertFalse(instance.isOccupied(8, 7));
        assertFalse(instance.isOccupied(8, 8));
        assertFalse(instance.isOccupied(8, 9));
        assertFalse(instance.isOccupied(9, 0));
        assertFalse(instance.isOccupied(9, 1));
        assertFalse(instance.isOccupied(9, 2));
        assertFalse(instance.isOccupied(9, 3));
        assertFalse(instance.isOccupied(9, 4));
        assertFalse(instance.isOccupied(9, 5));
        assertFalse(instance.isOccupied(9, 6));
        assertFalse(instance.isOccupied(9, 7));
        assertFalse(instance.isOccupied(9, 8));
        assertFalse(instance.isOccupied(9, 9));
    }

    @Test
    public void testShootAtAndMissTarget() {
        System.out.println("shootAtAndMissTarget");

        int deploymentRow = 0;
        int deploymentColumn = 0;
        OceanImpl ocean = new OceanImpl();
        boolean unoccupiedResult = false;
        boolean isItOccupied = ocean.isOccupied(deploymentRow,
                deploymentColumn);
        assertEquals(unoccupiedResult,isItOccupied);
        
        Submarine submarine = new SubmarineImpl();
        boolean vesselIsHorizontal = true;
        boolean deployed = submarine.okToPlaceShipAt(deploymentRow,
                deploymentColumn, vesselIsHorizontal, ocean);
        assertTrue(deployed);
        
        submarine.placeShipAt(deploymentRow,
                deploymentColumn, vesselIsHorizontal, ocean);
        
        boolean expResult = false;
        int targetRow = 1;
        int targetColumn = 0;
        boolean result = ocean.shootAt(targetRow, targetColumn);
        assertEquals(expResult, result);
        
        int recordedHit = 0;
        int actualHit = ocean.getHitCount();
        assertEquals(recordedHit,
                actualHit);
        
        int shotsThatHaveBeenFired = 1;
        int actuallyShotsThatHaveBeenFired = 1;
        assertEquals(shotsThatHaveBeenFired,
                actuallyShotsThatHaveBeenFired);
    }

    @Test
    public void testShootAtAndHitTarget() {
        System.out.println("shootAtAndHitTarget");
        
        int deploymentRow = 0;
        int deploymentColumn = 0;
        
        OceanImpl ocean = new OceanImpl();
        
        boolean unoccupiedResult = false;
        boolean isItOccupied = ocean.isOccupied(deploymentRow,
                deploymentColumn);
        assertEquals(unoccupiedResult,isItOccupied);
        
        Submarine submarine = new SubmarineImpl();
        boolean vesselIsHorizontal = true;
        boolean deployed = submarine.okToPlaceShipAt(0,
                0, true, ocean);
        assertTrue(deployed);
        
        submarine.placeShipAt(deploymentRow,
                deploymentColumn, vesselIsHorizontal, ocean);
        
        boolean expResult = true;
        int targetRow = 0;
        int targetColumn = 0;
        boolean result = ocean.shootAt(targetRow, targetColumn);
        assertEquals(expResult, result);
        
        int shotsThatHaveBeenFired = 1;
        int actualShotsThatHaveBeenFired = 1;
        assertEquals(shotsThatHaveBeenFired,
                actualShotsThatHaveBeenFired);
        
        int recordedHit = 1;
        int actualHit = ocean.getHitCount();
        assertEquals(recordedHit,
                actualHit);
    }

    @Test
    public void testIsGameOver() {
        System.out.println("isGameOver");
        OceanImpl instance = new OceanImpl();
        boolean expResult = false;
        boolean result = instance.isGameOver();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetShipsSunk() {
        Ocean ocean = new OceanImpl();
        int expResult = 0;
        int result = ocean.getShipsSunk();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetShipArray() {
        System.out.println("getShipArray");
        OceanImpl instance = new OceanImpl();
        Ship[][] result = instance.getShipArray();
        Ship[][] expResult = result.clone();
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testPrintFinalScores() {
        System.out.println("printFinalScores");
        OceanImpl instance = new OceanImpl();
        String expResult = "GAME OVER!! You scored 0. You sank 0 ships "+
                "and used 0 shots.";
        boolean result = Pattern.matches(expResult,
                instance.printFinalScores());
        assertTrue(result);
    }

    @Test
    public void testGetShotsFired() {
        System.out.println("getShotsFired");
        OceanImpl instance = new OceanImpl();
        int expResult = 0;
        int result = instance.getShotsFired();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetShotsFired() {
        System.out.println("setShotsFired");
        int shotsFired = 10;
        OceanImpl instance = new OceanImpl();
        instance.setShotsFired(shotsFired);
        int expResult = 10;
        int result = instance.getShotsFired();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetHitCount() {
        System.out.println("getHitCount");
        OceanImpl instance = new OceanImpl();
        int expResult = 0;
        int result = instance.getHitCount();
        assertEquals(expResult, result);
    }
    
}
