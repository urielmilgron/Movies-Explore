package com.alkemy.movie.mapper;


import com.alkemy.movie.Entity.GeneroEntity;
import com.alkemy.movie.dto.GeneroDTO;
import org.springframework.stereotype.Component;
import java.util.*;

@Component
public class GeneroMapper {
    public GeneroEntity generoDTO2Entity(GeneroDTO dto){
        GeneroEntity generoEntity = new GeneroEntity();
        generoEntity.setImage(dto.getImage());
        generoEntity.setNombre(dto.getNombre());
        return generoEntity;
    }

    public GeneroDTO generoEntity2DTO(GeneroEntity entity){
        GeneroDTO dto = new GeneroDTO();
        dto.setId(entity.getId());
        dto.setImage(entity.getImage());
        dto.setNombre(entity.getNombre());
        return dto;
    }
    public List<GeneroDTO> generoEntityList2DTOList(List<GeneroEntity> entities){
        List<GeneroDTO> dtos = new ArrayList<>();
        for(GeneroEntity entity : entities){
            dtos.add(this.generoEntity2DTO(entity));
        }
        return dtos;
    }
}
//Check