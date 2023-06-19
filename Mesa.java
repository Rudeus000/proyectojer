package com.proyecto01.proyecto.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity(name="Mesa")
@Table(name="Mesa")

public class Mesa {
	@Id
	String n_mesa;
	String mesa_d;
	
	public Mesa() {
		super();
	}
	public Mesa(String n_mesa, String mesa_d, String registro_p) {
		super();
		this.n_mesa = n_mesa;
		this.mesa_d = mesa_d;
		
	}
	public String getN_mesa() {
		return n_mesa;
	}
	public void setN_mesa(String n_mesa) {
		this.n_mesa = n_mesa;
	}
	public String getMesa_d() {
		return mesa_d;
	}
	public void setMesa_d(String mesa_d) {
		this.mesa_d = mesa_d;
	}

	@OneToMany(fetch = FetchType.LAZY,mappedBy = "mesa")
	List<Servicio> servicio;


	public List<Servicio> getServicio() {
		return servicio;
	}
	
	public void setServicio(List<Servicio> servicio) {
		this.servicio = servicio;
	}
	
	

}
