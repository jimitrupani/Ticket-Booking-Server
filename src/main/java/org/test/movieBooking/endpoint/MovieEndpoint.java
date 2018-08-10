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

    /*@RequestMapping(path = "/v1/person/{id}", method = RequestMethod.GET)
    public ResponseEntity<Person> get(@PathVariable("id") Long id) {

        Person person = personService.findOne(id);
        return (person == null ? ResponseEntity.status(HttpStatus.NOT_FOUND) : ResponseEntity.ok()).body(person);
    }

    @RequestMapping(path = "/v1/person", method = RequestMethod.PUT, consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<Person> add(
            @Valid @RequestBody Person person,
            @Valid @Size(max = 40, min = 8, message = "user id size 8-40") @RequestHeader(name = HEADER_USER_ID) String userId,
            @Valid @Size(max = 40, min = 2, message = "token size 2-40") @RequestHeader(name = HEADER_TOKEN, required = false) String token) {

        person = personService.save(person);
        return ResponseEntity.ok().body(person);
    }

    @InitBinder("person")
    protected void initBinder(WebDataBinder binder) {
        binder.addValidators(new PersonValidator());
    }*/
}