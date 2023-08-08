package movies;

import java.util.Scanner;

public class UserSelection {

    public static void userSelection() {
        System.out.println("What would you like to do?");
        System.out.println(Menu.showmenu());

        System.out.print("Enter uour choice: ");
        Scanner scanner = new Scanner(System.in);

        // takes user input then calls the appropriate function
        int userSelection = scanner.nextInt();
        MoviesArray.displayMovies(userSelection);



    }
}
