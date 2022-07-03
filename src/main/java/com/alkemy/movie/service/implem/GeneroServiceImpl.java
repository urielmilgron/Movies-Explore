package com.alkemy.movie.service.implem;


import com.alkemy.movie.Entity.GeneroEntity;
import com.alkemy.movie.dto.GeneroDTO;
import com.alkemy.movie.mapper.GeneroMapper;
import com.alkemy.movie.repository.GeneroRepository;
import com.alkemy.movie.service.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class GeneroServiceImpl implements GeneroService{
    @Autowired
    private GeneroMapper generoMapper;

    @Autowired
    private GeneroRepository generoRepository;

    public GeneroDTO save(GeneroDTO dto){
        //Convertimos DTO en entidad
        GeneroEntity entity = generoMapper.generoDTO2Entity(dto);
        //Guardamos genero
        GeneroEntity generoSaved = generoRepository.save(entity);
        GeneroDTO result = generoMapper.generoEntity2DTO(generoSaved);
        return result;
    }

    public List<GeneroDTO> getAllGeneros(){
        List<GeneroEntity> entities = generoRepository.findAll();
        List<GeneroDTO> result = generoMapper.generoEntityList2DTOList(entities);
        return result;
    }
    public void delete(Long id){
        this.generoRepository.deleteById(id);
    }
}
//Check