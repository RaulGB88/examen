package com.ad.examen.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.ad.examen.model.Companyia;
import com.ad.examen.model.Disco;

import lombok.Data;
import lombok.ToString;

@Data
public class CompanyiaDTO implements Serializable {
	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	
	private Long idCompanyia;
	private String nombre;
	private String direccion;	
	private String fax;	
	private String telefono;
	@ToString.Exclude
	private List<DiscoDTO> listaDiscosdto;	
	
	public static CompanyiaDTO convertToDTO(Companyia companyia) {
		
		CompanyiaDTO companyiadto = new CompanyiaDTO();
		companyiadto.setIdCompanyia(companyia.getId());
		companyiadto.setNombre(companyia.getNombre());
		companyiadto.setDireccion(companyia.getDireccion());
		companyiadto.setFax(companyia.getFax());
		companyiadto.setTelefono(companyia.getTelefono());
		
//		for (int ind = 0; ind < companyia.getListaDiscos().size(); ind++) {
//			DiscoDTO discodto = DiscoDTO.convertToDTO(companyia.getListaDiscos().get(ind));		
//			companyiadto.getListaDiscosdto().add(discodto);
//		}
//		
		return companyiadto;
	}
	
	public static Companyia convertToEntity(CompanyiaDTO companyiadto) {
		
		Companyia companyia = new Companyia();
		companyia.setId(companyiadto.getIdCompanyia());
		companyia.setNombre(companyiadto.getNombre());
		companyia.setDireccion(companyiadto.getDireccion());
		companyia.setFax(companyiadto.getFax());
		companyia.setTelefono(companyiadto.getTelefono());
		
//		for (int ind = 0; ind < companyiadto.getListaDiscosdto().size(); ind++) {
//			Disco disco = DiscoDTO.convertToEntity(companyiadto.getListaDiscosdto().get(ind));		
//			companyia.getListaDiscos().add(disco);
//		}
		
		return companyia;
	}

	public CompanyiaDTO() {
		super();
		this.listaDiscosdto = new ArrayList<DiscoDTO>();
	}

}
