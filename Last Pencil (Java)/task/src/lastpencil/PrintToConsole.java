package lastpencil;

public class PrintToConsole {
    /**
     * Takes in an amount of pencils to print to the screen and uses '|' to represent them.
     *
     */
    public static void printPencils() {
        int amount = PencilManager.getTotalPencils();
        StringBuilder totalPencils = new StringBuilder();
        for (int pencil = 0; pencil < amount; pencil++) {
            totalPencils.append("|");
        }

        System.out.println(totalPencils);
    }

    /**
     * Takes in a name and prints it to the console along with a message notifying the user it is
     * their turn
     */
    public static void printCurrentPlayersTurn() {
        System.out.println(PlayerManager.getCurrentPlayer() + "'s turn");
    }

    /**
     * Prints the winner to the screen
     */
    public static void printWinner() {
        // Last player to take the pencil looses so you must swap to the other player
        PlayerManager.switchCurrentPlayer();
        System.out.println(PlayerManager.getCurrentPlayer() + " won!");
    }

}
