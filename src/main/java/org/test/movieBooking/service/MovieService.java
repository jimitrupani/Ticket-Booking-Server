package org.test.movieBooking.service;

import org.springframework.stereotype.Service;
import org.test.movieBooking.domain.Movie;
import org.test.movieBooking.domain.Response;
import org.test.movieBooking.util.Utils;

import java.util.List;

@Service
public class MovieService {

	public List<Movie> getAll() {
		return Utils.getMovies();
	}

	public Response addMovie(Movie movie) {
		if(Utils.addMovie(movie)) {
			return new Response("Success", 200, null);
		} else {
			return new Response("Failure", 500, "Server Error");
		}
	}
}
