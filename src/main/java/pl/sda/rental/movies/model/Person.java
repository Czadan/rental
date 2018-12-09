package pl.sda.rental.movies.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "PERSONS")
@Getter
@Setter
class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String name;
    String lastName;
    Country country;
    String dateOfBirth;
}
