package oop.lab.lab8.comparable;

public class Movie implements Comparable<Movie> {
    private String name;
    private double rating;
    private int year;

    public Movie() {
        this.name = "";
        this.rating = 0.0;
        this.year = 0;
    }

    public Movie(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Movie[" +
                "name=" + name +
                ", rating=" + rating +
                ", year=" + year +
                ']';
    }

    @Override
    public int compareTo(Movie another) {
        return this.year - another.year;
    }

}
