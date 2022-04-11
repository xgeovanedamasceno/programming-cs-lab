package diocollection.comparers;

public class Movie implements Comparable<Movie>{
    private double rating;
    private String name;
    private int year;

    public Movie(String name, int year, double rating) {
        this.name = name;
        this.year = year;
        this.rating = rating;
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
    public int compareTo(Movie movie) {
        return this.year - movie.getYear();
    }

    @Override
    public String toString() {
        return this.getName() + " - " + this.getYear() + " - " + this.getRating();
    }
}
