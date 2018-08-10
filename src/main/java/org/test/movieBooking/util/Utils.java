package org.test.movieBooking.util;

import org.test.movieBooking.domain.Movie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public final class Utils {

    private static List<Movie> movies = new ArrayList<>(
            Arrays.asList(new Movie("Test1", new Date(), null)));

    public static List<Movie> getMovies() {
        return movies;
    }

    public static boolean addMovie(Movie movie) {
        return movies.add(movie);
    }
}
