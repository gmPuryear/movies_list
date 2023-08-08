package movies;

public class Menu {

    public static String showmenu(){
        String menu = "\n1 - View all movies" +
                "\n2 - view movies in the animated category" +
                "\n3 - view movies in the drama category" +
                "\n4 - view movies in the horror category" +
                "\n5 - view movies in the scifi category" +
                "\n6 = Add movie" +
                "\n0 - exit\n";
        return menu;
    }
}
