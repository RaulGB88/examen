package com.ad.examen.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

@Data
@Entity
@Table(name = "cancion")
public class Cancion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String titulo;
	private Float duracion;
	
	@ManyToMany(cascade = {CascadeType.ALL}, mappedBy="listaCanciones")
	@ToString.Exclude
    private List<Disco> listaDiscos;	

	
    public Cancion() {
    	super();
    	this.listaDiscos = new ArrayList<Disco>();
    }	
	
}
