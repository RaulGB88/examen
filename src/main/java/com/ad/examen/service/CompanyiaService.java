package com.ad.examen.service;

import java.util.List;

import com.ad.examen.dto.CompanyiaDTO;

public interface CompanyiaService {
	
	List<CompanyiaDTO> getAllCompanyias();

	void deleteCompanyia(Long id);

	String saveCompanyia(CompanyiaDTO companyiadto);

	CompanyiaDTO getCompanyiaById(Long id);
}
