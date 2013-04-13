/*
 * The position tests ensure that the position object can get and set
 * two instance variables.
 */
package bbk_battleships;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * @author Bernard T. A. Baker <bernard@btab.org>
 */
public class PositionTest {

    @Test
    public void testGetX() {
        Position instance = new Position();
        int expResult = 0;
        int result = instance.getX();
        assertEquals("The default position x value was not correct",
                expResult, result);
    }

    @Test
    public void testSetX() {
        int x = 2;
        Position instance = new Position();
        instance.setX(x);
        assertEquals("The position x value is not correct.",
                instance.getX(), 2);
    }

    @Test
    public void testGetY() {
        Position instance = new Position();
        int expResult = 0;
        int result = instance.getY();
        assertEquals("The default position y value was not correct",
                expResult, result);
    }

    @Test
    public void testSetY() {
        int y = 2;
        Position instance = new Position();
        instance.setY(y);
        assertEquals("The position y value is not correct.",
                instance.getY(), 2);
    }
}