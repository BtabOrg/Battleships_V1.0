/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bbk_battleships;

import java.lang.reflect.Array;
import org.junit.Test;
import org.junit.Assert;

/**
 *
 * @author Bernard T. A. Baker <bernard@btab.org>
 */
public class BattleshipGameTest {
    
    public BattleshipGameTest() {
    }

    @Test(timeout=15000)
    public void testMain() {
        System.out.println("main argument lists match row 2 and columns 0-9");
        
        String [] coordinates = 
                new String[20];
        coordinates[0] = "2";
        coordinates[1] = "0";
        coordinates[2] = "2";
        coordinates[3] = "1";
        coordinates[4] = "2";
        coordinates[5] = "2";
        coordinates[6] = "2";
        coordinates[7] = "3";
        coordinates[8] = "2";
        coordinates[9] = "4";
        coordinates[10] = "2";
        coordinates[11] = "5";
        coordinates[12] = "2";
        coordinates[13] = "6";
        coordinates[14] = "2";
        coordinates[15] = "7";
        coordinates[16] = "2";
        coordinates[17] = "8";
        coordinates[18] = "2";
        coordinates[19] = "9";
        
        String[] args = new String[20];
        args[0] = "2";
        args[1] = "0";
        args[2] = "2";
        args[3] = "1";
        args[4] = "2";
        args[5] = "2";
        args[6] = "2";
        args[7] = "3";
        args[8] = "2";
        args[9] = "4";
        args[10] = "2";
        args[11] = "5";
        args[12] = "2";
        args[13] = "6";
        args[14] = "2";
        args[15] = "7";
        args[16] = "2";
        args[17] = "8";
        args[18] = "2";
        args[19] = "9";
        
        Assert.assertArrayEquals("String[] do not match.",coordinates, args);
       
        BattleshipGame.main(args);
    }
}
