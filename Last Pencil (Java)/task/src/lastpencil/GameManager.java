package lastpencil;

public class GameManager {
    // INSTANCE VARIABLES
    private static String currentPlayer;
    private static int totalPencils;

    // GETTERS AND SETTERS
    public static String getCurrentPlayer() {
        return currentPlayer;
    }

    public static void setCurrentPlayer(String currentPlayer) {
        GameManager.currentPlayer = currentPlayer;
    }

    public static int getTotalPencils() {
        return totalPencils;
    }

    public static void setTotalPencils(int totalPencils) {
        GameManager.totalPencils = totalPencils;
    }

    public static void playGame() {
        // Ask the user for the number of pencils and set them
        int numberOfPencils = UserInputManager.promptNumberOfPencils();
        setTotalPencils(numberOfPencils);

        // Choice of names
        String name1 = "John";
        String name2 = "Jack";

        // Prompt for first player and set to the current player
        String firstPlayer = UserInputManager.promptFirstPlayer(name1, name2);
        setCurrentPlayer(firstPlayer);

        // Game loop
        while (totalPencils > 0) {
            // Print pencils and the first player
            PrintToConsole.printPencils(totalPencils);
            PrintToConsole.printCurrentPlayersTurn(currentPlayer);

            // Get the amount of pencils to remove
            int numberOfPencilsToRemove = UserInputManager.promptAmountOfPencilsToRemove();
            removePencils(numberOfPencilsToRemove);

            // Switch player
            switchCurrentPlayer(name1, name2);
        }
    }

    /**
     * Takes in an amount of pencils and removes it from the total pencils.
     *
     * @param amount The amount to be subtracted
     */
    private static void removePencils(int amount) {
        setTotalPencils(totalPencils -= amount);
    }

    /**
     * Switches from player1 to player 2
     * @param player1 The first players name
     * @param player2 The second players name
     */
    private static void switchCurrentPlayer(String player1, String player2) {
        currentPlayer = (currentPlayer.equals(player1)) ? player2 : player1;
    }
}
