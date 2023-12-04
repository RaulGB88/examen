package com.ad.examen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ad.examen.dto.CompanyiaDTO;
import com.ad.examen.service.CompanyiaService;


@Controller
public class CompanyiaController {
	
	@Autowired
	CompanyiaService companyiaService;
	
	@Value("${aplicacion.nombre}")
	private String nombreAplicacion;
	
	@Value("${asignatura}")
	private String nombreAsignatura;	
			
    @GetMapping("/")
    public String index(Model model) {
    	model.addAttribute("titulo", nombreAplicacion);
    	model.addAttribute("nombreAsignatura", nombreAsignatura);
        return "index";
    }  
    
    @GetMapping("/companyias")
    public String listarCompanyias(Model model) {
    	model.addAttribute("list", companyiaService.getAllCompanyias());
        return "companyias";
    } 
    
	@RequestMapping("/companyias/new")
	public String newCompanyia(Model model) {
		model.addAttribute("companyiadto", new CompanyiaDTO());
		model.addAttribute("add", true);
		return "companyiaform";
	}
	
	@PostMapping("/companyias/save")
	public String saveCompanyia(Model model, @ModelAttribute("companyiadto") CompanyiaDTO companyiadto) {
		String errorMessage = companyiaService.saveCompanyia(companyiadto);
		String page = "redirect:/companyias";
		model.addAttribute("errorMessage", errorMessage);
		
		if(!"".equalsIgnoreCase(errorMessage)) {
			if(companyiadto.getIdCompanyia() == null) {
				model.addAttribute("add", true);
			}
			errorMessage = "Campo incorrecto";
			model.addAttribute("error", true);
			return "companyiaForm";
		} 
		return page;
	}
	
	@RequestMapping("/companyias/{id}")
	public String showCompanyiaById(@PathVariable Long id, Model model) {
		model.addAttribute("companyiadto", companyiaService.getCompanyiaById(id));
		return "companyiashow";
	}
	
	@RequestMapping("/companyias/delete/{idCompanyia}")
	public String deleteCompanyia(@PathVariable Long idCompanyia) {
		companyiaService.deleteCompanyia(idCompanyia);
		return "redirect:/companyias";
	}
        
}
