package com.alkemy.movie.service;
import com.alkemy.movie.controller.GeneroController;
import com.alkemy.movie.dto.GeneroDTO;

import java.util.*;

public interface GeneroService {
    GeneroDTO save(GeneroDTO dto);

    List<GeneroDTO> getAllGeneros();
    void delete(Long id);
}
