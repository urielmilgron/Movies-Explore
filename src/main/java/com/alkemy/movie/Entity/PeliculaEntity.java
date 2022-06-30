package com.alkemy.movie.Entity;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter; 

import java.util.*;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name = "Pelicula")
@Getter
@Setter

/**
 *
 * @author urielmilgron
 */
public class PeliculaEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE) //Genero Id en secuencia.
	private Long id; //No genero columna ya que iria el mismo nombre que Id
	
	private String image;
	
	@Column(name = "fecha_creacion") //Genero columna con caracteristicas de pelicula
	@DateTimeFormat(pattern = "yyyy-MM-dd") //Le doy formato a una fecha cuando la declare
	private LocalDate fechaCreacion;
	
	private String titulo;
	

	private Long clasificacion;
	
	@ManyToMany(mappedBy = "pelicula", cascade = CascadeType.ALL )
	private List<PersonajeEntity> personaje = new ArrayList<>();
}
