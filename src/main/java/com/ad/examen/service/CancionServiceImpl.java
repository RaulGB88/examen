package com.ad.examen.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ad.examen.dto.CancionDTO;
import com.ad.examen.model.Cancion;
import com.ad.examen.repository.CancionRepository;

@Service
public class CancionServiceImpl implements CancionService {

	@Autowired
	CancionRepository cancionRepository;
	
	@Override
	public void deleteCancion(CancionDTO canciondto) {
		cancionRepository.deleteById(canciondto.getIdCancion());	
	}

	@Override
	public List<CancionDTO> getCancionesByDisco(Long idDisco) {
		List<CancionDTO> canciondtoList = new ArrayList<CancionDTO>();
		List<Cancion> cancionList = null;

		cancionList = cancionRepository.getCancionesByDisco(idDisco);

		for (Cancion cancion : cancionList) {
			canciondtoList.add(CancionDTO.convertToDTO(cancion));
		}
		return canciondtoList;
	}
	
}
