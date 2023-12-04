package com.ad.examen.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.ad.examen.model.Cancion;
import com.ad.examen.model.Companyia;
import com.ad.examen.model.Disco;

import lombok.Data;
import lombok.ToString;

@Data
public class DiscoDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long idDisco;
	private String nombre;
	private String fecha;
	@ToString.Exclude
	private CompanyiaDTO companyiadto;
	@ToString.Exclude
	private List<CancionDTO> listaCanciones;
	
	public static DiscoDTO convertToDTO(Disco disco) {
		
		DiscoDTO discodto = new DiscoDTO();
		discodto.setIdDisco(disco.getId());
		discodto.setNombre(disco.getNombre());
		discodto.setFecha(disco.getFecha());
		discodto.setCompanyiadto(CompanyiaDTO.convertToDTO(disco.getCompanyia()));
		
		for (int ind = 0; ind < disco.getListaCanciones().size(); ind++) {
			
			CancionDTO canciondto = CancionDTO.convertToDTO(disco.getListaCanciones().get(ind));
			discodto.getListaCanciones().add(canciondto);
		}
		
		return discodto;
	}
	
	public static Disco convertToEntity(DiscoDTO discodto) {
		
		Disco disco = new Disco();
		disco.setId(discodto.getIdDisco());
		disco.setNombre(discodto.getNombre());
		disco.setFecha(discodto.getFecha());
		disco.setCompanyia(CompanyiaDTO.convertToEntity(discodto.getCompanyiadto()));
		
		for (int ind = 0; ind < discodto.getListaCanciones().size(); ind++) {
			
			Cancion cancion = CancionDTO.convertToEntity(discodto.getListaCanciones().get(ind));
			disco.getListaCanciones().add(cancion);
		}
		
		return disco;
	}

	public DiscoDTO() {
		super();
		this.companyiadto = new CompanyiaDTO();
		this.listaCanciones = new ArrayList<CancionDTO>();
	}
	
}
