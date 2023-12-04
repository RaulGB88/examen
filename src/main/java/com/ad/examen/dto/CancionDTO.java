package com.ad.examen.dto;

import com.ad.examen.model.Cancion;

import lombok.Data;

@Data
public class CancionDTO  {
	
	private Long idCancion;
	private String titulo;
    private Float duracion;
    
	public static CancionDTO convertToDTO(Cancion cancion) {
		
		CancionDTO canciondto = new CancionDTO();
		canciondto.setIdCancion(cancion.getId());
		canciondto.setTitulo(cancion.getTitulo());
		canciondto.setDuracion(cancion.getDuracion());
		
		return canciondto;
	}
	
	public static Cancion convertToEntity(CancionDTO canciondto) {
		
		Cancion cancion = new Cancion();
		cancion.setId(canciondto.getIdCancion());
		cancion.setTitulo(canciondto.getTitulo());
		cancion.setDuracion(canciondto.getDuracion());
		
		return cancion;
	}

}
