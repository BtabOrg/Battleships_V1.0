package bbk_battleships;

/**
 *
 * @author Bernard T. A. Baker <bernard@btab.org>
 */
public interface Submarine extends Ship {

    @Override
    String toString();

    @Override
    String getShipType();

    @Override
    boolean shootAt(int row, int column);
}
