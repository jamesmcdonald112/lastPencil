package lastpencil;

public class PrintToConsole {
    /**
     * Takes in an amount of pencils to print to the screen and uses '|' to represent them.
     * @param amount Total pencils to be printed
     */
    public static void printPencils(int amount) {
        StringBuilder totalPencils = new StringBuilder();
        for (int pencil = 0; pencil < amount; pencil++) {
            totalPencils.append("|");
        }

        System.out.println(totalPencils);
    }

    /**
     * Takes in a name and prints it to the console along with a message notifying the user it is
     * their turn
     * @param currentPlayer The name to be printed to the console
     */
    public static void printCurrentPlayersTurn(String currentPlayer) {
        System.out.println(currentPlayer + "'s turn:");
    }

}
