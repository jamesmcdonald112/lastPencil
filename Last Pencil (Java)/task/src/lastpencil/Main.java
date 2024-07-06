package lastpencil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Input for the number of pencils
        System.out.println("How many pencils would you like to use:\n");
        int numberOfPencils = s.nextInt();
        s.nextLine(); // consume token

        // Choice of names
        String name1 = "John";
        String name2 = "Jack";

        // Decide who goes first
        System.out.println("Who will be the first (" + name1 + ", " + name2 + "):\n");
        String firstPlayer = s.nextLine();

        // Print pencils and the first player
        printPencils(numberOfPencils);
        printFirstPlayer(firstPlayer);


    }

    /**
     * Takes in an amount of pencils to print to the screen and uses '|' to represent them.
     * @param amount Total pencils to be printed
     */
    private static void printPencils(int amount) {
        StringBuilder totalPencils = new StringBuilder();
        for (int pencil = 0; pencil < amount; pencil++) {
            totalPencils.append("|");
        }

        System.out.println(totalPencils);
    }

    /**
     * Takes in a name and prints it to the console along with a message notifying the user they
     * are going first.
     * @param name The name to be printed to the console
     */
    private static void printFirstPlayer(String name) {
        System.out.println(name + " is going first!");
    }
}
