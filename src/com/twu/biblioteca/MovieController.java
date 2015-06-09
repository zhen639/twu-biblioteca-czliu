package com.twu.biblioteca;

import java.util.ArrayList;

/**
 * Created by liu on 6/9/15.
 */
public class MovieController {

    public String checkout(int i){
        ArrayList<Movie> movieList =  MoviesViewer.getMoviesList();
        return  "You checkout " + movieList.get(i).getName() + "\n";
    }
}
