package com.twu.biblioteca;

/**
 * Created by liu on 6/9/15.
 */
public class Movie {
    private static String name;
    private static String year;
    private static String director;
    private static String rating;

    public static void setName(String name) {
        Movie.name = name;
    }

    public static void setDirector(String director) {
        Movie.director = director;
    }

    public static void setRating(String rating) {
        Movie.rating = rating;
    }

    public static void setYear(String year) {
        Movie.year = year;
    }

    public static String getName() {
        return name;
    }

    public static String getDirector() {
        return director;
    }

    public static String getRating() {
        return rating;
    }

    public static String getYear() {
        return year;
    }

}
