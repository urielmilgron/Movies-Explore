package com.alkemy.movie.service;
//Dependencias
import org.springframework.stereotype.Service;

import com.alkemy.movie.dto.PeliculaDTO;

//Definimos que es Servicio
@Service
public class PeliculaService {
    //Método save
	public PeliculaDTO save(PeliculaDTO dto) {
		//GUARDAR PELICULA
		System.out.println("GUARDAR PELICULA");
		return dto;
	}
	
}
