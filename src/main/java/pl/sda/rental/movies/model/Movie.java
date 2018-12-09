package pl.sda.rental.movies.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "MOVIES")
@Getter
@Setter
class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private int length;
    private int productionDate;

    @Enumerated(EnumType.STRING)
    private Country country;

    @Enumerated(EnumType.STRING)
    @ElementCollection(targetClass = Genre.class)
    List<Genre> genres;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "MOVIE_DIRECTOR", joinColumns = {@JoinColumn(name = "MOVIE_ID")},
            inverseJoinColumns = {@JoinColumn(name = "DIRECTOR_ID")})
    List<Person> directors;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "MOVIE_CAST",joinColumns = {@JoinColumn(name = "MOVIE_ID")},
            inverseJoinColumns = {@JoinColumn(name = "STAR_ID")})
    List<Person> cast;

}
