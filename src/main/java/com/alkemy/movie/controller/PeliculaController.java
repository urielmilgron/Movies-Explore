package com.alkemy.movie.controller;
import org.springframework.web.bind.annotation.PostMapping;

//Dependencias
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alkemy.movie.dto.PeliculaDTO;
import com.alkemy.movie.service.PeliculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

//Le indicamos que es un controller
@RestController
@RequestMapping("peliculas")
public class PeliculaController {
	
	@Autowired
	private PeliculaService peliculaService;

	//Guardamos peliculas
	@PostMapping
	public ResponseEntity<PeliculaDTO> save(@RequestBody PeliculaDTO pelicula) {
		
		PeliculaDTO peliculaGuardada = peliculaService.save(pelicula);
		//Devolvemos que pelicula fue guardada
		return ResponseEntity.status(HttpStatus.CREATED).body(peliculaGuardada);
		
		
	}
	
}
