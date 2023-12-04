package com.ad.examen.service;

import java.util.List;

import com.ad.examen.dto.CompanyiaDTO;
import com.ad.examen.dto.DiscoDTO;

public interface DiscoService {

	List<DiscoDTO> getDiscosByCompanyia(CompanyiaDTO companyia);

	DiscoDTO getDiscoById(Long id);

	String saveDisco(DiscoDTO discodto);

	void deleteDisco(Long id);

}
