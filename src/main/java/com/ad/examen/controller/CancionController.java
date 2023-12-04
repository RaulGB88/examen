package com.ad.examen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ad.examen.dto.CancionDTO;
import com.ad.examen.dto.DiscoDTO;
import com.ad.examen.service.CancionService;
import com.ad.examen.service.DiscoService;

@Controller
public class CancionController {
	
	@Autowired
	CancionService cancionService;
	
	@Autowired
	DiscoService discoService;
	
	@RequestMapping("discos/{idDisco}/canciones")
	public String cancionesDiscoList(@PathVariable Long idDisco, Model model) {
		
		DiscoDTO discodto = discoService.getDiscoById(idDisco);
		List<CancionDTO> canciondtoList = cancionService.getCancionesByDisco(idDisco);
		model.addAttribute("list", canciondtoList);
		model.addAttribute("discodto", discodto);
		return "cancionesdisco";
	}
}
