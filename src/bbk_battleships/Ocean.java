package bbk_battleships;

public interface Ocean {
    
    int getDimension();

    boolean placeAllShipsRandomly();

    @Override
    String toString();

    boolean isOccupied(int row, int column);

    boolean shootAt(int row, int column);

    boolean isGameOver();

    Ship[][] getShipArray();

    String printFinalScores();

    int getShotsFired();

    void setShotsFired(int shotsFired);

    int getHitCount();

    int getShipsSunk();
}