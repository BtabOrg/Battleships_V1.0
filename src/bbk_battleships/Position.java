/**
 * The position is used to store coordinates provided by the user who performs
 * input via the keyboard during the execution of the game.
 */
package bbk_battleships;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Bernard T. A. Baker <bernard@btab.org>
 */
class Position {

    /**
     * The "x" coordinate which the user would like to target.
     */
    @Getter
    @Setter(AccessLevel.PACKAGE)
    private int x;
    /**
     * The "x" coordinate which the user would like to target.
     */
    @Getter
    @Setter(AccessLevel.PACKAGE)
    private int y;

    /**
     * Initialise the "x" and "y" coordinate to zero.
     */
    public Position() {
        this.x = 0;
        this.y = 0;
    }

    /**
     * Initialise the "x" and "y" coordinate to the supplied arguments.
     */
    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
