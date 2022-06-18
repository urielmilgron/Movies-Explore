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

    private String denominacion;

    @Column(name = "carac_personaje")
    private Long edad;
    private Long peso;
    
    @Column(name = "biografia")
    private String historia;
    
    @ManyToMany(cascade = {
    CascadeType.MERGE,
        CascadeType.PERSIST
        
    })
    @JoinTable(
    name = "personaje_pelicula",
            joinColumns = @JoinColumn(name = "personaje_id"),
            inverseJoinColumns = @JoinColumn(name = "pelicula_id")
    )
    private Set<PeliculaEntity> pelicula = new HashSet<>();
}
