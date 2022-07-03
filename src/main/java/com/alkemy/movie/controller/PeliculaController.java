package com.alkemy.movie.controller;
import org.springframework.web.bind.annotation.*;

//Dependencias
import java.util.*;
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

	//Get/Vemos peliculas
	@GetMapping
	public ResponseEntity<List<PeliculaDTO>> getAll(){
    List<PeliculaDTO> peliculas = peliculaService.getAllPeliculas();
	return ResponseEntity.ok().body(peliculas);
	}
	//POST/Guardamos peliculas
	@PostMapping
	public ResponseEntity<PeliculaDTO> save(@RequestBody PeliculaDTO pelicula) { //Nos retorna el body de pelicula que es de tipo PeliculaDTO
		
		PeliculaDTO peliculaGuardada = peliculaService.save(pelicula);
		//Devolvemos que pelicula fue guardada
		return ResponseEntity.status(HttpStatus.CREATED).body(peliculaGuardada);
		
		
	}
	//Borramos peliculas
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id){
		this.peliculaService.delete(id);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}

	
}
