package com.ad.examen.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "disco")
public class Disco {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private String fecha;
	
	@ManyToOne
	@JoinColumn(name = "idcompanyia", nullable = false)
	private Companyia companyia;
	
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(name="canciondisco", // Tabla que mantiene la relacion M-N
		joinColumns=@JoinColumn(name="iddisco"), // Columna con la id del disco en la tabla canciondisco
		inverseJoinColumns=@JoinColumn(name="idcancion")) // Columna con la id de la cancion en la tabla canciondisco
	private List<Cancion> listaCanciones;
	
	public Disco() {
		super();
		this.listaCanciones = new ArrayList<Cancion>();
	}
	

}
