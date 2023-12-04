package com.ad.examen.service;

import java.util.List;

import com.ad.examen.dto.CancionDTO;
import com.ad.examen.model.Cancion;

public interface CancionService {

	void deleteCancion(CancionDTO canciondto);
	public List<CancionDTO> getCancionesByDisco(Long idDisco);

}
