package bbk_battleships;

/**
 *
 * @author Bernard T. A. Baker <bernard@btab.org>
 */
public interface Destroyer extends Ship {
    
    @Override
    String getShipType();
    
    @Override
    String toString();
}
