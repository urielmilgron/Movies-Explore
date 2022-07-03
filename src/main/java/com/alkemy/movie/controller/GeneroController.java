package com.alkemy.movie.controller;
import org.springframework.web.bind.annotation.*;


import com.alkemy.movie.dto.GeneroDTO;
import com.alkemy.movie.service.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import java.util.*;

//Indicamos que es controller
@RestController
@RequestMapping("generos")
public class GeneroController {

    @Autowired
    private GeneroService generoService;
    //Obtenemos Generos
    @GetMapping
    public ResponseEntity<List<GeneroDTO>> getAll(){
    List<GeneroDTO> generos = generoService.getAllGeneros();
    return ResponseEntity.ok().body(generos);
    }
    //Guardams Generos
    @PostMapping
    public ResponseEntity<GeneroDTO> save(@RequestBody GeneroDTO genero){

        GeneroDTO generoGuardado = generoService.save(genero);
        return ResponseEntity.status(HttpStatus.CREATED).body(generoGuardado);
    }
    //Soft Delete generos
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        this.generoService.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
//Check
