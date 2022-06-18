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
    private Long id;
    private String image;
    private String nombre;
    
    
}
