package pl.sda.rental.movies.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class MovieDto {
    String id;
    String title;
    int length;
    int productionDate;
    CountryDto country;
    List<GenreDto> genres;
    List<PersonDto> directors;
    List<PersonDto> cast;
}
