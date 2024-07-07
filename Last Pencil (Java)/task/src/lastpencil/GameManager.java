package lastpencil;

public class GameManager {

    /**
     * The manager for the game's logic. It begins by prompting the user for the total pencils
     * for the game and sets the amount. Next, the user decides which player goes first. The game
     * loop begins where the user and the bot take it in turns to remove the pencils until there
     * are no pencils left. The last person to take the pencil loses.
     */
    public static void playGame() {
        // Ask the user for the number of pencils and set them
        System.out.println("How many pencils would you like to use:");
        PencilManager.setValidPencilAmount();

        // Set who will play first
        System.out.println("Who will be the first (" + PlayerManager.getName1() + ", " + PlayerManager.getName2() + "):");
        PlayerManager.setFirstPlayer();

        // Game Loop
        while (true) {
            // Print total pencils
            PrintToConsole.printPencils();
            PrintToConsole.printCurrentPlayersTurn();

            // Check if the current player is the bot
            if (PlayerManager.getCurrentPlayer().equals(PlayerManager.getName2())) {
                BotManager.botMove();
            } else {
                // Get User input for number of pencils to remove
                PencilManager.removePencilManager();
            }

            // Analyse game
            if (isWinner()) {
                PrintToConsole.printWinner();
                break;
            }
            // Switch player
            PlayerManager.switchCurrentPlayer();
        }
        // Close Scanner
        UserInputManager.closeScanner();

    }

    /**
     * The game is over if there are 0 pencils
     * @return True if there are 0 or fewer pencils; false otherwise
     */
    private static boolean isWinner() {
        return PencilManager.getTotalPencils() <=0;
    }

}
