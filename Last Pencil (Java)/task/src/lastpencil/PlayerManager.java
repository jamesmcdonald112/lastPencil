package lastpencil;

public class PlayerManager {
    // INSTANCE VARIABLES
    private static String name1 = "John";
    private static String name2 = "Jack";
    private static String currentPlayer;

    public static String getName1() {
        return name1;
    }

    public static void setName1(String name1) {
        PlayerManager.name1 = name1;
    }

    public static String getName2() {
        return name2;
    }

    public static void setName2(String name2) {
        PlayerManager.name2 = name2;
    }

    public static String getCurrentPlayer() {
        return currentPlayer;
    }

    public static void setCurrentPlayer(String currentPlayer) {
        PlayerManager.currentPlayer = currentPlayer;
    }

    /**
     * Gets the user to select the first player.
     */
    public static void setFirstPlayer() {
        boolean running = true;
        while (running) {
            String userInput = UserInputManager.getUserInput();
            if (isValidUserName(userInput)) {
                currentPlayer = userInput;
                running = false;
            }
        }

    }

    /**
     * Switches from player1 to player 2
     */
    public static void switchCurrentPlayer() {
        currentPlayer = (currentPlayer.equals(name1)) ? name2 : name1;
    }

    /**
     * Takes the name in as a string and compares it to name1 and name2 in GameManager. If the
     * user picks one of these name, the method returns true; else false with a message.
     *
     * @param name The name to be compared to name1 and name2;
     * @return True if they match; false otherwise.
     */
    private static boolean isValidUserName(String name) {
        if (name.equals(name1) || name.equals(name2)) {
            return true;
        } else {
            System.out.println("Choose between " + name1 + "  and " + name2);
        } return false;
    }
}
