package lastpencil;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInputManager {
    // INSTANCE VARIABLES
    private static Scanner s = new Scanner(System.in);

    /**
     * Gets the user input as a String
     *
     * @return Returns the user input
     */
    public static String getUserInput() {
        String userInput = s.nextLine();
        return userInput;
    }

    /**
     * Closes the scanner
     */
    public static void closeScanner() {
        s.close();
    }

}
