package oop.lab.lab8.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorTest {
    public static void main(String[] args) {
        List<Movie> list = new ArrayList<>();
        list.add(new Movie("Force Awakens", 8.3, 2015));
        list.add(new Movie("Star Wars", 8.7, 1977));
        list.add(new Movie("Empire Strikes Back", 8.8, 1980));
        list.add(new Movie("Return of the Jedi", 8.4, 1983));

        System.out.println("\nSort by rating: ");
        CompareByRating compareByRating = new CompareByRating();
        Collections.sort(list, compareByRating);
        for (Movie movie : list) {
            System.out.println(movie.getName() + " " +
                    movie.getRating() + " " +
                    movie.getYear() + " ");
        }

        System.out.println("\nSort by name: ");
        CompareByName compareByName = new CompareByName();
        Collections.sort(list, compareByName);
        for (Movie movie : list) {
            System.out.println(movie.getName() + " " +
                    movie.getRating() + " " +
                    movie.getYear() + " ");
        }

        System.out.println("\nSort by year: ");
        Collections.sort(list);
        for (Movie movie : list) {
            System.out.println(movie.getName() + " " +
                    movie.getRating() + " " +
                    movie.getYear() + " ");
        }
    }
}
