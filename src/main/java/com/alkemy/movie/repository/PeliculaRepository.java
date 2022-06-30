package com.alkemy.movie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.alkemy.movie.Entity.PeliculaEntity;

@Repository
public interface PeliculaRepository extends JpaRepository<PeliculaEntity, Long>{

}
