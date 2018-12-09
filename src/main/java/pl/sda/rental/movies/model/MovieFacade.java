package pl.sda.rental.movies.model;

import lombok.AllArgsConstructor;
import pl.sda.rental.movies.dto.MovieDto;

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
}
