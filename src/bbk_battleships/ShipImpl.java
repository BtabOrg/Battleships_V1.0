/*
 * Class Ship describes characteristics common to all the ships.
 *
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

    // the number of cells that surround a given location
    private final int LOCATION_PERIMETER = 9;
    /**
     * the identifier for a vessel.
     */
    @Setter
    @Getter
    private String vesselIdentifier = "S";
    /**
     * the identifier for a vessel that has been hit.
     */
    @Getter
    private String vesselThatHasBeenHitIdentifier = "S";
    /**
     * the identifier for a vessel that has been missed.
     */
    @Getter
    private String vesselThatHasBeenMissedIdentifier = "-";
    /**
     * the identifier for a vessel that has been missed.
     */
    @Getter
    private String vesselThatHasBeenSunkIdentifier = "X";
    /**
     * the number of squares occupied by the ship. An "empty sea" location has
     * length 1.
     */
    @Getter
    @Setter(AccessLevel.PROTECTED)
    private int length;
    /**
     * the row (0 to 9) which contains the bow (front) of the ship.
     */
    @Getter
    @Setter(AccessLevel.PACKAGE)
    private int bowRow;
    /**
     * the column (0 to 9) which contains the bow (front) of the ship.
     */
    @Getter
    @Setter(AccessLevel.PACKAGE)
    private int bowColumn;
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
     * The identifier used to identify a label within an ArrayList.
     */
    private int labelIdentifier = 0;

    /**
     * clears the hit array indicating whether that part of the "Ship" has been
     * hit
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
        boolean itsOk = true;
        if (row + getLength() > ocean.getDimension()
                || column + getLength() > ocean.getDimension()) {
            itsOk = false;
        } else {
            ArrayList<Integer> rowArray =
                    new ArrayList(LOCATION_PERIMETER);
            ArrayList<Integer> columnArray =
                    new ArrayList(LOCATION_PERIMETER);
            ArrayList<Integer> itemsToBeRemovedArray =
                    new ArrayList(LOCATION_PERIMETER);

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

            int newLength = rowArray.size();

            for (int i = 0; i < newLength; i++) {
                if (rowArray.get(i) >= ocean.getDimension()
                        || columnArray.get(i) >= ocean.getDimension()
                        || rowArray.get(i) < 0
                        || columnArray.get(i) < 0) {
                    itemsToBeRemovedArray.add(i);
                }
            }

            for (int i = itemsToBeRemovedArray.size() - 1; i >= 0; i--) {
                int indice = itemsToBeRemovedArray.get(i);
                rowArray.remove(indice);
                columnArray.remove(indice);
            }

            boolean occupied = false;
            for (int i = 0; i < rowArray.size(); i++) {
                occupied = ocean.isOccupied(rowArray.get(i),
                        columnArray.get(i));
                if (occupied == true) {
                    itsOk = false;
                }
            }
        }
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

        this.setBowRow(row);
        this.setBowColumn(column);
        this.setHorizontal(horizontal);

        Ship ships[][] = ocean.getShipArray();

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
     * If this ship has been hit, marks that part of the ship as "hit"
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
            hit[(row - getBowRow() + column - getBowColumn())] = true;
            labelIdentifier = row - getBowRow() + column - getBowColumn();
            labels.set(row - getBowRow() + column - getBowColumn(),
                    vesselThatHasBeenHitIdentifier);
            return true;
        } catch (ArrayIndexOutOfBoundsException exception) {
            return false;
        }
    }

    /**
     * checks whether this ship is sunk - using the hit array
     *
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
     * @return a single character String to use in Ocean's print method
     */
    @Override
    public String toString() {
        return this.getClass().getName();
    }

    /**
     * @return a single character String to use in Ocean's print method
     */
    @Override
    public String print(int row, int column) {
        return labels.get((row - getBowRow() + column - getBowColumn()));
    }

    /**
     * set all the vessel labels to indicate the vessel has sunk.
     */
    @Override
    public void updateLabelsToSunkState() {
        for (int i = 0; i < this.length; i++) {
            labels.set(i, getVesselThatHasBeenSunkIdentifier());
        }
    }
}
