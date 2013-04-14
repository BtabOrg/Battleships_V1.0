/**
 * A Battleship Game class.
 * Sets up the game; accepts "shots" from the user, displays the results,
 * prints final scores, and asks the user if he/she wants to play again.
 * 
 * Uses Java 7 features.
 */

package bbk_battleships;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author MARGARET WRIGHT
 * @author KLM
 * @author Bernard T. A. Baker <bernard@btab.org>
 */
public class BattleshipGame {

    /**
     * The BattleshipGame main method. In this class the game is set up; 
     * the game accepts shots from the user; the game displays the results; 
     * the game prints the final scores; and asks the user if s/he wants to 
     * play again. All input/output is done here (although some of it is 
     * done by calling a print() method in the Ocean class.) All computation 
     * will be done in the Ocean class and the various Ship classes. To aid 
     * the user, row numbers should be displayed along the left edge of the 
     * array, and column numbers should be displayed along the top. Numbers 
     * should be 0 to 9, not 1to10. The top left corner square should be 
     * location 0,0. Use different characters to indicate locations that 
     * contain a hit, locations that contain a miss, and locations that have 
     * never been red upon (see later).
     * 
     * @param args
     */
    public static void main(String[] args) {

        Set<String> replies = new HashSet<>();
        replies.add("YES");
        replies.add("Yes");
        replies.add("yes");
        replies.add("Y");
        replies.add("y");

        int limit;
        String reply;
        Scanner input = new Scanner(System.in);

        do {
            // set up the game
            Ocean oc = new OceanImpl();
            oc.placeAllShipsRandomly();
            System.out.println();
            System.out.println(oc);
            limit = oc.getDimension();

            do {
                // read in the shot.
                Position p = getValidInput(input, limit);

                // accept shots & check whether it's a hit (in Ocean).
                if (!oc.shootAt(p.getX(), p.getY())) {
                    // a miss
                    System.out.println("\n\n");
                    System.out.println("A miss, try again.");
                    System.out.println();
                }
                // print the ocean.
                System.out.println(oc);
                // display the instructions and help information.
                System.out.println("Help and info [. is empty sea; '-' is a "
                        + "miss; 'S' is a hit; 'X' is a sunken ship.]");
                System.out.println();

            } while (!oc.isGameOver());
            // print out final scores.
            System.out.println(oc.printFinalScores());

            System.out.print("Do you want to play again (Yes or No)? ");
            reply = input.next();
        } while (replies.contains(reply)); // play again?
    }


    /*
     * Gets valid input from user for row (x) & column (y).
     *
     * @param user input from keyboard
     *
     * @return the valid shot location
     */
    private static Position getValidInput(Scanner input, int limit) {
        // x is the row; y is the column
        int x, y;

        System.out.println("Where do you want to fire (x,y)? ");
        x = askForInput(input, "x/row = ", limit);
        y = askForInput(input, "y/col = ", limit);
        return new Position(x, y);
    }

    /*
     * Checks for valid user input for x or y.
     * 
     * @param input from user
     * 
     * @return the valid co-ordinate
     */
    private static int askForInput(Scanner input, String promptString,
            int limit) {
        int coordinate;
        do {
            try {
                do {
                    System.out.print(promptString);
                    coordinate = input.nextInt();
                } while (coordinate < 0 || coordinate > limit - 1);
                return coordinate;
            } // checks for not an integer
            catch (Exception ex) {
                System.err
                        .println("Invalid answer - please enter a number"
                        + " between 0-" + limit + ".");
                input.nextLine();
            } // end of catch
        } while (true);
    }
}