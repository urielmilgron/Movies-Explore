package com.alkemy.movie.mapper;

import com.alkemy.movie.Entity.PeliculaEntity;
import com.alkemy.movie.dto.PeliculaDTO;
import org.springframework.stereotype.Component;
import java.util.*;

@Component
public class PeliculaMapper {

    public PeliculaEntity peliculaDTO2Entity(PeliculaDTO dto){
        PeliculaEntity peliculaEntity = new PeliculaEntity();
        peliculaEntity.setImage(dto.getImage());
        peliculaEntity.setFechaCreacion(dto.getFechaCreacion());
        peliculaEntity.setTitulo(dto.getTitulo());
        peliculaEntity.setClasificacion(dto.getClasificacion());
        return peliculaEntity;
    }

    public PeliculaDTO peliculaEntity2DTO(PeliculaEntity entity){
        PeliculaDTO dto = new PeliculaDTO();
        dto.setId(entity.getId());
        dto.setImage(entity.getImage());
        dto.setFechaCreacion(entity.getFechaCreacion());
        dto.setTitulo(entity.getTitulo());
        dto.setClasificacion(entity.getClasificacion());
        return dto;
    }

    public List<PeliculaDTO> peliculaEntityList2DTOList(List<PeliculaEntity> entities){
    List<PeliculaDTO> dtos = new ArrayList<>();
    for(PeliculaEntity entity : entities){
        dtos.add(this.peliculaEntity2DTO(entity));
    }
    return dtos;
    }
}
