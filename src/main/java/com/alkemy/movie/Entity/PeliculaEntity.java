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
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String image;
    private String titulo;
    
    @Column(name = "fecha_creacion")
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private LocalDate fechaCreacion;
    
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "genero_id", insertable = false, updatable = false)
    private GeneroEntity genero;
    
    @Column(name = "genero_id", nullable = false) 
	private Long generoId;
    
    @ManyToMany(mappedBy = "icons", cascade = CascadeType.ALL)
    private List<PersonajeEntity> personaje = new ArrayList<>(); 
}
