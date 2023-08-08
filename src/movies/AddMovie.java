package movies;

import java.util.ArrayList;
import java.util.Scanner;

public class AddMovie {

    static public void addMovie() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the title of the movie: ");
        String titleOfMovie = scanner.next();
        System.out.println("Please enter the category of the movie (drama, musical, horror, scifi, animated)");
        String categoryOfMovie = scanner.next();

        Movie movieToAdd = new Movie(titleOfMovie, categoryOfMovie);
        System.out.println("this is the new movie: " + movieToAdd.getName() + " " + movieToAdd.getCategory());
        int lengthOfNewMovieArray = MoviesArray.findAll().length + 1;
        System.out.println("explicit length of new array: " + lengthOfNewMovieArray);
        Movie[] newMovieArray = new Movie[lengthOfNewMovieArray];
        System.out.println("actual length of new array: " + newMovieArray.length);


//        if the loop is at the final element of the original array, add the new element to the new array at the
//        element of old array plus 1
        System.out.println("length of original array: " + MoviesArray.findAll().length);;

        for (int i = 0; i < MoviesArray.findAll().length; i++) {
            if (i == MoviesArray.findAll().length - 1) {
                System.out.println(i + " end of existing array");
                newMovieArray[i + 1] = movieToAdd;
//                break;
//                System.out.println(MoviesArray.findAll()[i]);
//                System.out.println(newMovieArray[i]);
            } else {
                System.out.println(i + " not end of array");
                System.out.println(MoviesArray.findAll()[i].getName() + " " + MoviesArray.findAll()[i].getCategory());
                MoviesArray.findAll()[i] = newMovieArray[i];
                System.out.println(newMovieArray[i]);
            }

//            newMovieArray[i].setName(MoviesArray.findAll()[i].getName());
//            newMovieArray[i].setName(MoviesArray.findAll()[i].getCategory());
//            System.out.println(newMovieArray);
//            System.out.println(newMovieArray[i].getName());
//            System.out.println(newMovieArray[i].getCategory());
        }
//        for (Movie movie : newMovieArray) {
//            System.out.println(movie.getName() + " -- " + movie.getCategory());
//        }
    }

}
