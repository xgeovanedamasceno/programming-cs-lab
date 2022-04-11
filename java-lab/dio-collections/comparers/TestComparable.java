package diocollection.comparers;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparable {
    public static void main(String[] args) {
        List<Movie> listMovies = new ArrayList<>();
        listMovies.add(new Movie("Toy Story", 2010, 9.4));
        listMovies.add(new Movie("Star Wars", 1977, 9.6));
        listMovies.add(new Movie("Empire of Love", 1980, 7.4));
        listMovies.add(new Movie("You are alone", 1983, 4.8));

        System.out.println(listMovies);

        Collections.sort(listMovies);

        System.out.println("After sorting:");

        listMovies.forEach(movie -> System.out.println(movie));

        System.out.println();
        System.out.println();
        System.out.println("Sorted by rating: ");

        Collections.sort(listMovies, new RatingCompare());

        for (Movie listMovie : listMovies) {
            System.out.println(listMovie);
        }

        System.out.println();
        System.out.println();
        System.out.println("Name Compare");
        Collections.sort(listMovies, new NameCompare());

        listMovies.forEach(movie -> System.out.println(movie));
    }
}
