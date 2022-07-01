package com.alkemy.movie.service.implem;
//Dependencias
import com.alkemy.movie.Entity.PeliculaEntity;
import com.alkemy.movie.mapper.PeliculaMapper;
import com.alkemy.movie.repository.PeliculaRepository;
import com.alkemy.movie.service.PeliculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alkemy.movie.dto.PeliculaDTO;

import java.util.List;

//Definimos que es Servicio
@Service
public class PeliculaServiceImpl implements PeliculaService {
    //Inyectamos
	@Autowired
	private PeliculaMapper peliculaMapper;
	@Autowired
	private PeliculaRepository peliculaRepository;

	public PeliculaDTO save(PeliculaDTO dto) {
		//Convertimos dto en entidad
		PeliculaEntity entity = peliculaMapper.peliculaDTO2Entity(dto);
		//GUARDAMOS PELICULA
		PeliculaEntity peliculaSaved = peliculaRepository.save(entity);
		PeliculaDTO result = peliculaMapper.peliculaEntity2DTO(peliculaSaved);
		return result;
		//return dto; //Test funcionamiento.
	}
	public List<PeliculaDTO> getAllPeliculas() {
		List<PeliculaEntity> entities = peliculaRepository.findAll();
		List<PeliculaDTO> result = peliculaMapper.peliculaEntityList2DTOList(entities);
		return result;
	}
	
}
