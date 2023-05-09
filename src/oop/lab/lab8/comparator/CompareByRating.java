package oop.lab.lab8.comparator;

import java.util.Comparator;

public class CompareByRating implements Comparator<Movie> {

    @Override
    public int compare(Movie another1, Movie another2) {
        return Double.compare(another1.getRating(), another2.getRating());
    }
}
