package com.alkemy.movie.Entity;

//Importo dependencias
import lombok.Getter;
import lombok.Setter;

import java.util.*;

import javax.persistence.*;


@Entity
@Table(name = "Personaje")
@Getter
@Setter
/**
 *
 * @author urielmilgron
 */
public class PersonajeEntity {
@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE)
private Long Id;

private String image;

@Column (name="caract_personaje")
private String nombre;
private Long edad;
private Long peso;

@Column(name = "historia_personaje")
private String historia;

@ManyToMany( //Esté mtm engloba a todas las peliculas
		cascade = {
				CascadeType.PERSIST, //Cuando creamos un personaje, peliculas tambien se guardan
				CascadeType.MERGE //Cuando guardamos cambios en personaje, tambien peliculas
})
@JoinTable( //Aca definimos como se combinan los datos de esta relacion.
		name = "personaje_pelicula", //Nombre de la tabla intermedia.
		joinColumns = @JoinColumn(name = "personaje_id"), //Definimos a id de pais
		inverseJoinColumns = @JoinColumn(name = "pelicula_id"))
        private Set<PeliculaEntity> pelicula = new HashSet<>();

  
}
