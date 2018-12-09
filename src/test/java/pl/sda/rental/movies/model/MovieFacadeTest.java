package pl.sda.rental.movies.model;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
public class MovieFacadeTest {


    @MockBean
    private MovieRepository movieRepository;


    @Autowired
    private MovieFacade movieFacade;


    @Before
    public void setUp(){
        Movie movie = prepareTestMovie();
        when(movieRepository.save(any(Movie.class))).thenReturn(movie);
    }

    private Movie prepareTestMovie() {
        Movie result = new Movie();

        result.setId(1l);
        result.setTitle("Test movie");
        result.setCountry(Country.DE);
        result.setLength(120);
        result.setProductionDate(1994);
        result.setGenres(Arrays.asList(Genre.ACTION, Genre.DRAMA));

        Person person = new Person();
        person.setId(1l);
        person.setName("Andrzej");
        person.setLastName("Wichura");
        person.setDateOfBirth("12-03-1963");
        person.setCountry(Country.PL);
        result.setDirectors(Arrays.asList(person));

        Person person2 = new Person();
        person.setId(2l);
        person.setName("Kuba");
        person.setLastName("Rzeźnik");
        person.setDateOfBirth("28-06-1988");
        person.setCountry(Country.PL);
        result.setCast(Arrays.asList(person2));

        return result;
    }

    @Test
    public void shouldSaveMovie() {
    }

    @Test
    public void shouldGetMovie() {
    }
}