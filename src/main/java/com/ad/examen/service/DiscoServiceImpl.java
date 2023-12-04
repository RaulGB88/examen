package com.ad.examen.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ad.examen.dto.CompanyiaDTO;
import com.ad.examen.dto.DiscoDTO;
import com.ad.examen.model.Companyia;
import com.ad.examen.model.Disco;
import com.ad.examen.repository.DiscoRepository;
import com.ad.examen.utility.Constants;
import com.ad.examen.utility.Utility;

@Service
public class DiscoServiceImpl implements DiscoService {

	@Autowired
	DiscoRepository discoRepository;
	
	@Override
	public List<DiscoDTO> getDiscosByCompanyia(CompanyiaDTO companyiadto) {
		List<DiscoDTO> discodtoList = new ArrayList<DiscoDTO>();
		List<Disco> discosList = null;

		discosList = discoRepository.getDiscosByCompanyia(companyiadto.getIdCompanyia());

		for (Disco disco2 : discosList) {
			discodtoList.add(DiscoDTO.convertToDTO(disco2));
		}
		return discodtoList;
	}

	@Override
	public DiscoDTO getDiscoById(Long id) {
		DiscoDTO discodto = null;
		Optional<Disco> disco = null;
		
		disco = discoRepository.findById(id);
		
		if(disco.isPresent()) {
			discodto = DiscoDTO.convertToDTO(disco.get());
		}
		return discodto;
	}

	@Override
	public String saveDisco(DiscoDTO discodto) {
		Disco disco = DiscoDTO.convertToEntity(discodto);
		String errorMessage = validarDisco(discodto);
		
		if("".equalsIgnoreCase(errorMessage)) {
			discoRepository.save(disco);
		} 
		return errorMessage;
	}
	
	/**
	 * Valida los campos del formulario para que sean válidos al crear y editar una
	 * disco.
	 * 
	 * @param disco
	 * @return mensajeError
	 */
	private String validarDisco(DiscoDTO discodto) {

		String validado = "";

		if (Utility.validarCampo(discodto.getNombre(), Constants.REGEX_NOMBRES)) {
			validado = "El nombre introducido no es válido (Ejemplo válido: Apple).";

		} else if (Utility.validarCampo(discodto.getFecha(), Constants.REGEX_FECHA)) {
			validado = "La fecha introducida no es válida, deben tener formato dd/mm/yyyy o dd-mmm-yyyy (Ejemplo válido: 20/09/1988).";

		}
		return validado;
	}

	@Override
	public void deleteDisco(Long id) {
		discoRepository.deleteById(id);		
	}

}
