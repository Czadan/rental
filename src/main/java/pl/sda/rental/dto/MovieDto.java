package pl.sda.rental.dto;

import java.util.List;

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
