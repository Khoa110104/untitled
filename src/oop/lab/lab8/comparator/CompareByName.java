package oop.lab.lab8.comparator;

import java.util.Comparator;

public class CompareByName implements Comparator<Movie> {
    @Override
    public int compare(Movie another1, Movie another2) {
        return another1.getName().compareTo(another2.getName());
    }


}
