package bbk_battleships;

public interface Ship {

    boolean okToPlaceShipAt(int row, int column, boolean horizontal,
            Ocean ocean);

    void placeShipAt(int row, int column, boolean horizontal, Ocean ocean);

    boolean shootAt(int row, int column);

    boolean isSunk();

    @Override
    String toString();

    int getLength();

    int getBowRow();

    int getBowColumn();

    boolean isHorizontal();

    String getShipType();

    void setVesselIdentifier(String param);

    String getVesselThatHasBeenSunkIdentifier();

    String getVesselThatHasBeenMissedIdentifier();

    String print(int row, int column);

    void updateLabelsToSunkState();
}
