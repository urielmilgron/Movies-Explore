package com.alkemy.movie.service.implem;



import com.alkemy.movie.Entity.PersonajeEntity;
import com.alkemy.movie.dto.PersonajeDTO;
import com.alkemy.movie.mapper.PersonajeMapper;
import com.alkemy.movie.repository.PersonajeRepository;
import com.alkemy.movie.service.PersonajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class PersonajeServiceImpl implements PersonajeService {

    @Autowired
    private PersonajeMapper personajeMapper;
    @Autowired
    private PersonajeRepository personajeRepository;

    public PersonajeDTO save(PersonajeDTO dto){
        PersonajeEntity entity = personajeMapper.personajeDTO2Entity(dto);
        PersonajeEntity personajeSaved = personajeRepository.save(entity);
        PersonajeDTO result = personajeMapper.personajeEntity2DTO(personajeSaved);
        return  result;
    }
    public List<PersonajeDTO> getAllPersonajes(){
        List<PersonajeEntity> entities = personajeRepository.findAll();
        List<PersonajeDTO> result = personajeMapper.personajeEntityList2DTOList(entities);
        return result;
    }
    public void delete(Long id){
        this.personajeRepository.deleteById(id);
    }
}
//Checks
