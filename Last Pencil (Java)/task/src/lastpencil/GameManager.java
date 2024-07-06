package lastpencil;

public class GameManager {

    public static void playGame() {
        // Ask the user for the number of pencils and set them
        System.out.println("How many pencils would you like to use:");
        PencilManager.setValidPencilAmount();

        // Set who will play first
        System.out.println("Who will be the first (" + PlayerManager.getName1() + ", " + PlayerManager.getName2() + "):");
        PlayerManager.setFirstPlayer();

        // Print total pencils
        PrintToConsole.printPencils();
        PrintToConsole.printCurrentPlayersTurn();


        // Close Scanner
        UserInputManager.closeScanner();

    }

}
