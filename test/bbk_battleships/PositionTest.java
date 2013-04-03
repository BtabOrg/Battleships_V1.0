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
public class PositionTest {
    
    public PositionTest() {
    }

    @Test
    public void testGetX() {
        System.out.println("getX");
        Position instance = new Position();
        int expResult = 0;
        int result = instance.getX();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetX() {
        System.out.println("setX");
        int x = 0;
        Position instance = new Position();
        instance.setX(x);
    }

    @Test
    public void testGetY() {
        System.out.println("getY");
        Position instance = new Position();
        int expResult = 0;
        int result = instance.getY();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetY() {
        System.out.println("setY");
        int y = 0;
        Position instance = new Position();
        instance.setY(y);
    }
}
