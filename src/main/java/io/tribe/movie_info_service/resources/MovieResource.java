package io.tribe.movie_info_service.resources;

import io.tribe.movie_info_service.models.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieResource {
    
    @GetMapping("/{movieId}")
    public List<Movie> getMovieInfo(@PathVariable("movieId") String movieId ){
        return Collections.singletonList(
                new Movie("1234","John Wick")
        );
    }
}
