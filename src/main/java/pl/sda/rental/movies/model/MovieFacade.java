package pl.sda.rental.movies.model;

import lombok.AllArgsConstructor;
import pl.sda.rental.movies.dto.MovieDto;

import java.util.Optional;

@AllArgsConstructor
public class MovieFacade {

    private MovieRepository movieRepository;

    private MovieBuilderService movieBuilderService;

    public MovieDto saveMovie(MovieDto movie){

        Movie movieEntity = movieBuilderService.entityFromDto(movie);
        Movie saveMovie = movieRepository.save(movieEntity);
        //TODO: converter saveMovie to DTO object

        return movieBuilderService.dtoFromEntity(saveMovie);
    }

    public MovieDto getMovie(Long id) {

        Optional<Movie> movie = movieRepository.findById(id);
        return movieBuilderService.dtoFromEntity(movie.get());
    }
}
