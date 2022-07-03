package com.alkemy.movie.repository;


import com.alkemy.movie.Entity.PersonajeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonajeRepository extends JpaRepository<PersonajeEntity, Long> {
}
