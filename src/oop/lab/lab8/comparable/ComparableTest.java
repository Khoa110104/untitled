package oop.lab.lab8.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableTest {
    public static void main(String[] args) {
        List<Movie> moviesList = new ArrayList<>();
        moviesList.add(new Movie("Force Awakens", 8.3, 2015));
        moviesList.add(new Movie("Star Wars", 8.7, 1977));
        moviesList.add(new Movie("Empire Strikes Back", 8.8, 1980));
        moviesList.add(new Movie("Return of the Jedi", 8.4, 1983));

        System.out.println("Before sorting: ");
        printInfo(moviesList);

        Collections.sort(moviesList);

        System.out.println("\nAfter sorting: ");
        printInfo(moviesList);

        List<Movie> cloneMovies1 = new ArrayList<>(moviesList);
        sortUsingSelectionSortAlgorithm(cloneMovies1);
        System.out.println("\nMovie after sorting using selectionSort: ");
        printInfo(cloneMovies1);

        System.out.println();
        for (Movie movie : moviesList) {
            System.out.println(movie.getName() + " " + movie.getRating() + " " + movie.getYear());
        }
    }

    public static void printInfo(List<Movie> movieList) {
        for (Movie movie : movieList) {
            System.out.println(movie);
        }
    }


    public static void sortUsingSelectionSortAlgorithm(List<Movie> movieList) {
        int length = movieList.size();
        for (int i = 0; i < length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < length; j++) {
                if (movieList.get(j).getYear() < movieList.get(minIndex).getYear()) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                Movie temp = movieList.get(i);
                movieList.set(i, movieList.get(minIndex));
                movieList.set(minIndex, temp);

            }
        }
    }
}
