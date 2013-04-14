/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bbk_battleships;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

class Position {

    @Getter
    @Setter(AccessLevel.PACKAGE)
    private int x;
    @Getter
    @Setter(AccessLevel.PACKAGE)
    private int y;

    public Position() {
        this.x = 0;
        this.y = 0;
    }

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
