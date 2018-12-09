package pl.sda.rental.movies.model;


import lombok.AllArgsConstructor;
import pl.sda.rental.movies.dto.MovieDto;

@AllArgsConstructor
public class MovieBuilderService {


    private PersonBuilderService personBuilderService;

    public Movie entityFromDto(MovieDto movieDto){
        Movie result = new Movie();

        result.setTitle(movieDto.getTitle());
        result.setProductionDate(movieDto.getProductionDate());
        result.setLength(movieDto.getLength());
        result.setId(Long.valueOf(movieDto.getId()));

        return result;
    }
}
