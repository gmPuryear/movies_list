package movies;

public class ContinueProgram {
    public static void continueProgram(String goToMenu) {
        if (goToMenu.equalsIgnoreCase("y")) {
            UserSelection.userSelection();
        } else {
            System.out.println("Good bye!");
            System.exit(0);
        }
    }

}
