package com.alkemy.movie.Entity;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter; 

import java.util.*;

import javax.persistence.*;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;
import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name = "Pelicula")
@Getter
@Setter
@SQLDelete(sql = "UPDATE pelicula SET deleted = true WHERE id=?")
@Where(clause = "deleted=false")
/**
 *
 * @author urielmilgron
 */
public class PeliculaEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE) //Genero Id en secuencia.
	private Long id; //No genero columna ya que iria el mismo nombre que Id
	
	private String image;
	
	@Column(name = "fecha_creacion") //Genero columna ya que nombre no va a ser igual por buenas prácticas.
	@DateTimeFormat(pattern = "yyyy-MM-dd") //Le doy formato a una fecha cuando la declare
	private LocalDate fechaCreacion;
	
	private String titulo;
	

	private Long clasificacion;

	private boolean deleted = Boolean.TRUE;
	
	@ManyToMany(mappedBy = "pelicula", cascade = CascadeType.ALL )
	private List<PersonajeEntity> personaje = new ArrayList<>();
}
