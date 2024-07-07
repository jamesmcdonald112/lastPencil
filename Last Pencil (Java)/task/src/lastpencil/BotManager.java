package lastpencil;

import java.util.Random;

public class BotManager {

    /**
     * Manager for the bot move.
     */
    public static void botMove() {
        int totalPencils = PencilManager.getTotalPencils();
        int pencilsToTake = determinePencilsToTake(totalPencils);

        // Print the amount of pencils taken
        System.out.println(pencilsToTake);

        // RemovePencils
        PencilManager.removePencils(pencilsToTake);
    }

    /**
     * This method is used to make the bot choose the correct amount of pencils if it is in a
     * winning position, or a random amount if it is not.
     *
     * @param totalPencils The total pencils available
     * @return The amount to be removed.
     */
    private static int determinePencilsToTake(int totalPencils) {
        if (totalPencils % 4 == 0) {
            return 3;
        } else if (totalPencils % 4 == 3) {
            return 2;
        } else if (totalPencils % 4 == 2) {
            return 1;
        } else if (totalPencils == 1) {
            return 1;
        } else {
            Random rand = new Random();
            return rand.nextInt(3) + 1; // Take 1, 2, or 3 pencils randomly
        }
    }
}
