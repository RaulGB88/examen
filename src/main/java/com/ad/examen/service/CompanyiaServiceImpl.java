package com.ad.examen.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ad.examen.dto.CompanyiaDTO;
import com.ad.examen.model.Companyia;
import com.ad.examen.repository.CompanyiaRepository;
import com.ad.examen.utility.Constants;
import com.ad.examen.utility.Utility;

@Service
public class CompanyiaServiceImpl implements CompanyiaService {

	@Autowired
	CompanyiaRepository companyiaRepository;

	@Override
	public List<CompanyiaDTO> getAllCompanyias() {
		List<Companyia> lista = null;
		List<CompanyiaDTO> listaResult = new ArrayList<CompanyiaDTO>();

		lista = companyiaRepository.findAll();

		for (int ind = 0; ind < lista.size(); ind++) {
			listaResult.add(CompanyiaDTO.convertToDTO(lista.get(ind)));
		}
		return listaResult;
	}

	@Override
	public void deleteCompanyia(Long id) {
		companyiaRepository.deleteById(id);
	}

	@Override
	public String saveCompanyia(CompanyiaDTO companyiadto) {
		Companyia companyia = CompanyiaDTO.convertToEntity(companyiadto);
		String errorMessage = validarCompanyia(companyia);
		
		if("".equalsIgnoreCase(errorMessage)) {
			companyiaRepository.save(companyia);
		} 
		return errorMessage;
	}

	@Override
	public CompanyiaDTO getCompanyiaById(Long id) {
		CompanyiaDTO companyiadto = null;
		Optional<Companyia> companyia = null;
		
		companyia = companyiaRepository.findById(id);
		
		if(companyia.isPresent()) {
			companyiadto = CompanyiaDTO.convertToDTO(companyia.get());
		}
		return companyiadto;
	}

	/**
	 * Valida los campos del formulario para que sean válidos al crear y editar una
	 * companyia.
	 * 
	 * @param companyia
	 * @return mensajeError
	 */
	private String validarCompanyia(Companyia companyia) {

		String validado = "";

		if (Utility.validarCampo(companyia.getNombre(), Constants.REGEX_NOMBRES)) {
			validado = "El nombre introducido no es válido (Ejemplo válido: Apple).";

		}
		if (Utility.validarCampo(companyia.getDireccion(), Constants.REGEX_NOMBRES)) {
			validado = "La dirección introducida no es válida (Ejemplo válido: Calle Yecla).";
			
		} else if (Utility.validarCampo(companyia.getFax(), Constants.REGEX_TELEFONO)) {
			validado = "El fax introducido no es válido, deben ser 15 dígitos numéricos (Ejemplo válido: 675472311).";

		} else if (Utility.validarCampo(companyia.getTelefono(), Constants.REGEX_TELEFONO)) {
			validado = "El teléfono introducido no es válido, deben ser 15 dígitos numéricos (Ejemplo válido: 675472311).";

		}
		return validado;
	}

}
