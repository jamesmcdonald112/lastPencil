package lastpencil;

import java.util.Scanner;

public class UserInputManager {
    // INSTANCE VARIABLES
    private static Scanner s = new Scanner(System.in);

    /**
     * Prompts the user for the number of pencils they would like to use.
     * @return The number of pencils as an int
     */
    public static int promptNumberOfPencils() {
        // Input for the number of pencils
        System.out.println("How many pencils would you like to use:");
        int numberOfPencils = s.nextInt();
        s.nextLine(); // consume token

        return numberOfPencils;
    }

    /**
     * Prompt the user to select the first player.
     *
     * @param player1 The first player
     * @param player2 The second player
     * @return
     */
    public static String promptFirstPlayer(String player1, String player2) {
        System.out.println("Who will be the first (" + player1 + ", " + player2 + "):");
        return s.nextLine();
    }

    /**
     * Prompt the user for the amount of pencils to remove
     * @return The amount of pencils to remove as an int
     */
    public static int promptAmountOfPencilsToRemove() {
        //TODO: Add this line back in at the end
//        System.out.println("How many pencils would you like to remove?");
        return s.nextInt();
    }
}
