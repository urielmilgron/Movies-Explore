package com.alkemy.movie.Entity;
import lombok.Getter;
import lombok.Setter; 

import java.util.*;

import javax.persistence.*;

@Entity
@Table(name = "Genero")
@Getter
@Setter

/**
 *
 * @author urielmilgron
 */
public class GeneroEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long Id;
	private String nombre;
	private String image;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "pelicula_id", insertable = false, updatable = false)
	private PeliculaEntity pelicula;
    
}
