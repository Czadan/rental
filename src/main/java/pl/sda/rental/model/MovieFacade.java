package pl.sda.rental.model;

import lombok.AllArgsConstructor;
import pl.sda.rental.dto.MovieDto;

@AllArgsConstructor
public class MovieFacade {

    private MovieRepository movieRepository;


    public MovieDto saveMovie(MovieDto movie){
        return null;
    }
}
