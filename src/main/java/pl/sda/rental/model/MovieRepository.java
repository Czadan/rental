package pl.sda.rental.model;

import org.springframework.data.jpa.repository.JpaRepository;

 interface MovieRepository extends JpaRepository<Movie, Long> {
}
