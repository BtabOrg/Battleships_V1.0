/**
 * Class Ship describes characteristics common to all the ships.
 * 
 * All sea bound vessels have different states which are used by the display 
 * operations of the GUI.
 * 
 * The constructor sets the default lists for indicating which part of the
 * vessel has been hit and the labels used by the GUI to indicate which 
 * part of the vessel has been hit, missed or sunk.
 */
package bbk_battleships;

import java.util.ArrayList;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

/**
 * @author MARGARET WRIGHT
 * @author KLM
 * @author Bernard T. A. Baker <bernard@btab.org>
 */
public abstract class ShipImpl implements Ship {

    /**
     * The number of cells that surround a given location.
     */
    private final int LOCATION_PERIMETER = 9;
    
    /**
     * The identifier for a vessel.
     */
    @Setter
    @Getter
    private String vesselIdentifier = "S";
    
    /**
     * The identifier signifying a hit.
     */
    @Getter
    private String vesselThatHasBeenHitIdentifier = "S";
    
    /**
     * The identifier signifying a miss.
     */
    @Getter
    private String vesselThatHasBeenMissedIdentifier = "-";
    
    /**
     * The identifier signifying a sunk vessel.
     */
    @Getter
    private String vesselThatHasBeenSunkIdentifier = "X";
    
    /**
     * The number of squares occupied by the ship.
     * An "empty sea" has a length of 1.
     * A destroyer has a length of 2.
     * A cruiser has a length of 3.
     * A battle-ship has a length of 4.
     */
    @Getter
    private int length;
    
    /**
     * The row (0 to 9) which contains the bow (front) of the ship.
     */
    @Getter
    @Setter(AccessLevel.PACKAGE)
    private int bowRow;
    
    /**
     * The column (0 to 9) which contains the bow (front) of the ship.
     */
    @Getter
    @Setter(AccessLevel.PACKAGE)
    private int bowColumn;
    
    /**
     * The alignment of the vessel.
     */    
    @Getter
    @Setter(AccessLevel.PACKAGE)
    private boolean horizontal;
    
    /**
     * An array of boolean which indicates whether that part of the ship has
     * been hit. Only battleships use all four locations; cruisers use the first
     * three; destroyers 2; submarines 1; and "empty sea" either one or none..
     */
    protected boolean[] hit;
    
    /**
     * An array of strings which indicates the label to be used when that part
     * of the ship has been hit.
     */
    protected ArrayList<String> labels;

    /**
     * Clears the hit array indicating whether that part of the "Ship" has been
     * hit. Clears the labels used indicating which part of the vessel has 
     * been hit.
     */
    protected ShipImpl(int length) {
        this.length = length;
        hit = new boolean[this.getLength()];
        labels = new ArrayList<>(this.getLength());
        for (int i = 0; i < hit.length; i++) {
            hit[i] = false;
        }
        for (int i = 0; i < this.length; i++) {
            labels.add(".");
        }
    }

    /**
     * Checks that ship of this size will not overlap another ship, or touch
     * another ship (vertically, horizontally, or diagonally) and that ship will
     * not "stick out" beyond the array.
     *
     * @param row that will contain the bow
     * @param column that will contain the bow
     * @param horizontal
     * @param ocean
     * @return true if it is okay to put a ship of this size with its bow in
     * this location, with the given orientation.
     */
    @Override
    public boolean okToPlaceShipAt(int row, int column, boolean horizontal,
            Ocean ocean) {
        
        // start with it being ok to place the vessel (0_o)....happy code.
        boolean itsOk = true;
        
        // check if the location is out of bounds (o_0)...bad codey
        if (row + getLength() > ocean.getDimension()
                || column + getLength() > ocean.getDimension()) {
            itsOk = false;
        } else {
            // create a list to store the surrounding locations.
            ArrayList<Integer> rowArray =
                    new ArrayList(LOCATION_PERIMETER);
            // create a list to store the surrounding locations.
            ArrayList<Integer> columnArray =
                    new ArrayList(LOCATION_PERIMETER);
            // create a list to store the locations which are out of bounds.
            ArrayList<Integer> itemsToBeRemovedArray =
                    new ArrayList(LOCATION_PERIMETER);

            // check all surrounding cells of the vessel.
            if (horizontal) {
                columnArray.add(column - 1);
                columnArray.add(column - 1);
                columnArray.add(column - 1);
                rowArray.add(row - 1);
                rowArray.add(row);
                rowArray.add(row + 1);
                for (int i = 0; i <= getLength(); i++) {
                    columnArray.add(column + i);
                    columnArray.add(column + i);
                    columnArray.add(column + i);
                    rowArray.add(row - 1);
                    rowArray.add(row);
                    rowArray.add(row + 1);
                }
            } else {
                rowArray.add(row - 1);
                rowArray.add(row - 1);
                rowArray.add(row - 1);
                columnArray.add(column - 1);
                columnArray.add(column);
                columnArray.add(column + 1);
                for (int i = 0; i <= getLength(); i++) {
                    rowArray.add(row + i);
                    rowArray.add(row + i);
                    rowArray.add(row + i);
                    columnArray.add(column - 1);
                    columnArray.add(column);
                    columnArray.add(column + 1);
                }
            }
            
            // evaluate which list items will not be used.
            int newLength = rowArray.size();
            
            // remove the list items which are out of bounds.
            for (int i = 0; i < newLength; i++) {
                if (rowArray.get(i) >= ocean.getDimension()
                        || columnArray.get(i) >= ocean.getDimension()
                        || rowArray.get(i) < 0
                        || columnArray.get(i) < 0) {
                    itemsToBeRemovedArray.add(i);
                }
            }
            
            // remove the indices from the lists which will not be checked.
            for (int i = itemsToBeRemovedArray.size() - 1; i >= 0; i--) {
                int indice = itemsToBeRemovedArray.get(i);
                rowArray.remove(indice);
                columnArray.remove(indice);
            }

            // check if the surrounding cells are occupied
            boolean occupied = false;
            for (int i = 0; i < rowArray.size(); i++) {
                occupied = ocean.isOccupied(rowArray.get(i),
                        columnArray.get(i));
                if (occupied == true) {
                    itsOk = false;
                }
            }
        }
        // return the flag which answers the question
        return itsOk;
    }

    /**
     * "places" the ship in the ocean, assigning values to the bowRow,
     * bowColumn, and horizontal. Places a reference to the ship in the ships
     * array in the Ocean object.
     *
     * @param row to contain the bow
     * @param column to contain the bow
     * @param horizontal
     * @param ocean
     */
    @Override
    public void placeShipAt(int row, int column, boolean horizontal,
            Ocean ocean) {

        // set the vessel instance variables used for placement.
        this.setBowRow(row);
        this.setBowColumn(column);
        this.setHorizontal(horizontal);

        // get a reference to the multidimenional array.
        Ship ships[][] = ocean.getShipArray();

        // store a reference to this vessel at the defined locations.
        for (int i = 0; i < this.getLength(); i++) {
            // set position in array to contain the ship
            ships[row][column] = this;
            labels.set(i, ".");
            if (horizontal) {
                column++;
            } else {
                row++;
            }
        }
    }

    /**
     * If this ship has been hit, marks that part of the ship as "hit".
     * Update the label which will be used by the games GUI display operations
     * in the ocean implementation.
     *
     * @param row User's supplied row shot
     * @param column User's supplied column shot
     * @return true if ship is hit, false otherwise
     */
    @Override
    public boolean shootAt(int row, int column) {
        if ((isHorizontal() && (row != getBowRow()))
                || (!isHorizontal() && (column != getBowColumn()))) {
            return false; // it's not a hit
        }
        // it's a hit. Work out offset & set that position in hit array to true
        try {
            // mark that part of the vessel as being hit.
            hit[(row - getBowRow() + column - getBowColumn())] = true;
            // update the label of that part of the vessel as being hit.
            labels.set(row - getBowRow() + column - getBowColumn(),
                    vesselThatHasBeenHitIdentifier);
            return true;
        } catch (ArrayIndexOutOfBoundsException exception) {
            return false;
        }
    }

    /**
     * Checks whether this ship is sunk - using the hit array.
     * @return true if every part of the ship has been hit, false otherwise.
     */
    @Override
    public boolean isSunk() {
        for (boolean b : hit) {
            if (!b) {
                return false;
            }
        }
        return true;
    }

    /**
     * Return the formatted string representation of this object.
     * @return a String to use in the Ocean's print method.
     */
    @Override
    public String toString() {
        return this.getClass().getName();
    }

    /**
     * The print operation accesses part of the vessel which is identified by
     * the row and column. It reflects the position of part of the vessel in
     * relation to the ocean. Each part of the vessel can return a different
     * identifier.
     * @param row
     * @param column
     * @return a single character representing a part of the vessel.
     */
    @Override
    public String print(int row, int column) {
        return labels.get((row - getBowRow() + column - getBowColumn()));
    }

    /**
     * When the vessel has sunk the state of the vessel is updated and the
     * print operation will display this in the games GUI.
     */
    @Override
    public void updateLabelsToSunkState() {
        for (int i = 0; i < this.length; i++) {
            labels.set(i, getVesselThatHasBeenSunkIdentifier());
        }
    }
}