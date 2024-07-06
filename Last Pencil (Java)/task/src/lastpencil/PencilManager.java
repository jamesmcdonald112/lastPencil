package lastpencil;

public class PencilManager {

    // INSTANCE VARIABLES
    private static int totalPencils;

    public static int getTotalPencils() {
        return totalPencils;
    }

    public static void setTotalPencils(int totalPencils) {
        PencilManager.totalPencils = totalPencils;
    }

    /**
     * Gets a validates the amount of pencils from the user.
     *
     * @return The number of pencils for the game as an int.
     */
    public static void setValidPencilAmount() {
        int pencilAmount = -1;
        boolean running = true;
        while (running){
            String userInput = UserInputManager.getUserInput();
            if (!isANumber(userInput)) {
                continue;
            }
            pencilAmount = Integer.parseInt(userInput);
            if (!isValidPencilAmount(pencilAmount)) {
                continue;
            }
            running = false;
        }
        totalPencils = pencilAmount;
    }

    /**
     * Takes in an amount of pencils and removes it from the total pencils.
     *
     * @param amount The amount to be subtracted
     */
    public static void removePencils(int amount) {
        totalPencils -= amount;
    }

    /**
     * Checks if a String input is a numeric value. The user is notified if it is not.
     *
     * @param input The string to be validated
     * @return True if it is an integer, false otherwise
     */
    private static boolean isANumber(String input) {
        try {
            Integer.parseInt(input);
        }catch (NumberFormatException e) {
            System.err.println("The number of pencils should be numeric");
            return false;
        }
        return true;
    }
    /**
     * Takes an int as the input and makes sure it is a positive number
     *
     * @param numberOfPencils The input to be validated
     * @return True if it is a valid pencil amount; false otherwise.
     */
    private static boolean isValidPencilAmount(int numberOfPencils) {
        // Pencils must be a numeric value
        if (numberOfPencils <= 0) {
            System.err.println("The number of pencils should be positive");
            return false;
        }
        return true;
    }

}
