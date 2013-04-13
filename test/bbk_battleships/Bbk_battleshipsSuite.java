/*
 * The Battleships_V1.0 test suite runs the tests for all the *_battleships
 * API classes.
 */
package bbk_battleships;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * @author Bernard T. A. Baker <bernard@btab.org>
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
    bbk_battleships.PositionTest.class,
    bbk_battleships.OceanImplTest.class,
    bbk_battleships.SubmarineImplTest.class,
    bbk_battleships.DestroyerImplTest.class,
    bbk_battleships.CruiserImplTest.class,
    bbk_battleships.BattleShipImplTest.class
})
public class Bbk_battleshipsSuite {
    
}
