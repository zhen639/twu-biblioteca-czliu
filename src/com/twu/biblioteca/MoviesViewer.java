package com.twu.biblioteca;

import java.util.ArrayList;

public class MoviesViewer {
    private static ArrayList<Movie> moviesList;

    public static void setMoviesList(ArrayList<Movie> moviesList) {
        MoviesViewer.moviesList = moviesList;
    }

    public static String show(){
        String result = "";
        for (int i = 0; i < moviesList.size(); i++) {
            result += Integer.toString(i+1) + ". " + moviesList.get(i).getName() + ", " +
                    moviesList.get(i).getYear() + ", " +
                    moviesList.get(i).getDirector() + ", " +
                    moviesList.get(i).getRating() + "\n";
        }
        return result;
    }

    public static ArrayList<Movie> getMoviesList() {
        return moviesList;
    }
}
