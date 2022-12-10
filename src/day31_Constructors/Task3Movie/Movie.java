package day31_Constructors.Task3Movie;

import java.util.ArrayList;
import java.util.Arrays;

public class Movie {

    public String country, title,genre,releaseDate,director;

    ArrayList<String> castList= new ArrayList<>();

    public Movie(String country, String title, String genre, String releaseDate, String director) {
        this.country = country;
        this.title = title;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.director = director;
    }

    public void addCast(String cast){
        castList.add(cast);
    }
    public void addCasts(String[] casts){
        castList.addAll(Arrays.asList(casts));
    }

    public String toString() {
        return "Movie{" +
                "country='" + country + '\'' +
                ", title='" + title + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", Total Number Of Cast='" + castList.size() +
                '}';
    }
}
