package lastpencil;

import java.util.InputMismatchException;

public class GameRulesManager {
    /**
     * Takes the name in as a string and compares it to name1 and name2 in GameManager. If the
     * user picks one of these name, the method returns true; else false with a message.
     *
     * @param name The name to be compared to name1 and name2;
     * @return True if they match; false otherwise.
     */
    public static boolean isValidUserName(String name) {
        String name1 = GameManager.getName1();
        String name2 = GameManager.getName2();
        if (name.equals(GameManager.getName1()) || name.equals(GameManager.getName2())) {
            return true;
        } else {
            System.out.println("Choose between " + name1 + "  and " + name2);
        } return false;
    }

}

