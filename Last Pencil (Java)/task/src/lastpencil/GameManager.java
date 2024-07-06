package lastpencil;

public class GameManager {

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

            // Get User input for number of pencils to remove
            PencilManager.removePencilManager();

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

    private static boolean isWinner() {
        return PencilManager.getTotalPencils() <=0;
    }

}
