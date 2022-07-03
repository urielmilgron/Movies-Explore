package com.alkemy.movie.service;

import com.alkemy.movie.controller.PersonajeController;
import com.alkemy.movie.dto.PersonajeDTO;
import java.util.*;
public interface PersonajeService {
    PersonajeDTO save(PersonajeDTO dto);

    List<PersonajeDTO> getAllPersonajes();

    void delete(Long id);
}
//Check
