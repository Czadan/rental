package pl.sda.rental.movies.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MovieConfiguration {

    @Bean
    MovieFacade movieFacade(MovieRepository movieRepository){
        return new MovieFacade(movieRepository);
    }

    @Bean
    MovieBuilderService movieBuilderService(PersonBuilderService personBuilderService){
        return new MovieBuilderService(personBuilderService);
    }

    @Bean
    PersonBuilderService personBuilderService(){
        return new PersonBuilderService();
    }
}
