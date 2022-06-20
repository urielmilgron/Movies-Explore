package com.alkemy.movie.dto;
//Dependencias
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;




@Getter
@Setter
public class PeliculaDTO {


	private Long id;
	private String image;
	//private LocalDate fechaCreacion;
	private String titulo;
	//private Long clasificacion;
	
	
	
}
