package lastpencil;

public class GameManager {
    // INSTANCE VARIABLES
    private static String currentPlayer;
    private static int totalPencils;
    // Choice of names
    private static String name1 = "John";
    private static String name2 = "Jack";

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

    public static String getName1() {
        return name1;
    }

    public static void setName1(String name1) {
        GameManager.name1 = name1;
    }

    public static String getName2() {
        return name2;
    }

    public static void setName2(String name2) {
        GameManager.name2 = name2;
    }

    public static void playGame() {
        // Ask the user for the number of pencils and set them
        System.out.println("How many pencils would you like to use:");
        setTotalPencils(PencilManager.getValidPencilAmount());
        System.out.println("Total pencils: " + totalPencils);




        // User enters an amount
        System.out.println("The user eneters an amount. If it is correct, meaning it is positive " +
                "and a number, it will be set. If it is not, the user will be notified and asked " +
                "to enter again.");

        UserInputManager.closeScanner();

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
