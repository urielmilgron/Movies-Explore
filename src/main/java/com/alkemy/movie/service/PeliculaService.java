package com.alkemy.movie.service;

import com.alkemy.movie.controller.PeliculaController;
import java.util.*;
import com.alkemy.movie.dto.PeliculaDTO;

public interface PeliculaService {
    PeliculaDTO save(PeliculaDTO dto);

    List<PeliculaDTO> getAllPeliculas();

    void delete(Long id);
}
