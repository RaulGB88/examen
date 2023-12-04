package com.ad.examen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ad.examen.dto.CompanyiaDTO;
import com.ad.examen.dto.DiscoDTO;
import com.ad.examen.service.CompanyiaService;
import com.ad.examen.service.DiscoService;

@Controller
public class DiscoController {
	
	@Autowired
	DiscoService discoService;
	
	@Autowired
	CompanyiaService companyiaService;
	
	@RequestMapping("/companyias/{idCompanyia}/discos")
	public String discosCompanyiaList(@PathVariable Long idCompanyia, Model model) {
		CompanyiaDTO companyiadto = companyiaService.getCompanyiaById(idCompanyia);
		List<DiscoDTO> discodtoList = discoService.getDiscosByCompanyia(companyiadto);
		model.addAttribute("list", discodtoList);
		model.addAttribute("companyia", companyiadto);
		return "discoscompanyia";
	}
	
	@RequestMapping("/companyias/{idCompanyia}/discos/new")
	public String newDisco(Model model, @PathVariable Long idCompanyia) {
		
		CompanyiaDTO companyiadto = companyiaService.getCompanyiaById(idCompanyia);
		
		DiscoDTO discodto = new DiscoDTO();
		discodto.setCompanyiadto(companyiadto);
		
		model.addAttribute("discodto", discodto);
		model.addAttribute("companyiadto", companyiadto);
		
		return "discoform";
	}
	
	@PostMapping("/companyias/{idCompanyia}/discos/save")
	public String saveDisco(Model model, @PathVariable Long idCompanyia, @ModelAttribute("discodto") DiscoDTO discodto) {
		
		CompanyiaDTO companyiadto = companyiaService.getCompanyiaById(idCompanyia);
		discodto.setCompanyiadto(companyiadto);
		
		String errorMessage = discoService.saveDisco(discodto);
		String page = "discoscompanyia";
		model.addAttribute("errorMessage", errorMessage);
		
		if(!"".equalsIgnoreCase(errorMessage)) {
			errorMessage = "Campo incorrecto";
			page = "discoForm";
			model.addAttribute("error", true);
			model.addAttribute("discodto", discodto);
			model.addAttribute("companyiadto", companyiadto);
		} else {
			List<DiscoDTO> discodtoList = discoService.getDiscosByCompanyia(companyiadto);
			model.addAttribute("list", discodtoList);
			model.addAttribute("companyia", companyiadto);
		}
		
		return page;
	}
	
	@RequestMapping("/discos/{idDisco}/delete/")
	public String deleteDisco(@PathVariable Long idDisco, Model model) {
		CompanyiaDTO companyiadto = discoService.getDiscoById(idDisco).getCompanyiadto();
		
		discoService.deleteDisco(idDisco);
		
		List<DiscoDTO> discodtoList = discoService.getDiscosByCompanyia(companyiadto);
		
		model.addAttribute("list", discodtoList);
		model.addAttribute("companyia", companyiadto);
		
		return "discoscompanyia";
	}
	
}
