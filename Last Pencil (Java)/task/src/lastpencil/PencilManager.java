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
                System.out.println("The number of pencils should be numeric");
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
     * Gets the amount of pencils to be removed from the user, validates the value, and removes
     * the value from the total pencils
     */
    public static void removePencilManager() {
        String userInput;
        while (true) {
            // Get user Input
            userInput = UserInputManager.getUserInput();

            // Check that it is a number
            if (!isANumber(userInput)) {
                System.out.println("Possible values: '1', '2', '3'");
                continue;
            }

            int pencilValue = Integer.parseInt(userInput);
            // Check if the pencil value is in the correct range and not more than total pencils
            // left
            if (isValidPencilValue(pencilValue)) {
                // If it passes all tests, then remove pencils
                removePencils(pencilValue);
                break;
            }


        }

    }

    /**
     * Takes in an amount of pencils and removes it from the total pencils.
     *
     * @param amount The amount to be subtracted
     */
    private static void removePencils(int amount) {
        totalPencils -= amount;
    }

    /**
     * Makes the sure value is between 1 and 3 and notifies the user if it is not.
     * @param value
     * @return
     */
    private static boolean isValidPencilValue(int value) {
        if (value < 1 || value > 3) {
            System.out.println("Possible values: '1', '2', '3'");
            return false;
        } else if (totalPencils - value < 0) {
            System.out.println("Too many pencils were taken");
            return false;
        } else {
            return true;
        }
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
            System.out.println("The number of pencils should be positive");
            return false;
        }
        return true;
    }

}
