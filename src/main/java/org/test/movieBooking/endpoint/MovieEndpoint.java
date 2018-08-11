package org.test.movieBooking.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.test.movieBooking.domain.Movie;
import org.test.movieBooking.domain.Response;
import org.test.movieBooking.service.MovieService;

import java.util.List;

@RestController
@RequestMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
public class MovieEndpoint{

    @Autowired
    MovieService movieService;

    @RequestMapping(path = "/v1/movies", method = RequestMethod.GET)
    public List<Movie> getAll() {

        return movieService.getAll();

    }

    @RequestMapping(path = "/v1/movie", method = RequestMethod.POST)
    public Response getAll(@RequestBody Movie movie) {

        return movieService.addMovie(movie);

    }
}
