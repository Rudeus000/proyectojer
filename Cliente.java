package com.proyecto01.proyecto.entity;



import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity(name="Clientes")
@Table(name="Clientes")

public class Cliente {
	@Id
	String dni;
	String ruc;
	public Cliente() {
		super();
	}
	public Cliente(String dni, String ruc) {
		super();
		this.dni = dni;
		this.ruc = ruc;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getRuc() {
		return ruc;
	}
	public void setRuc(String ruc) {
		this.ruc = ruc;
	}

	@OneToMany(fetch = FetchType.LAZY,mappedBy = "cliente")
	List<Servicio> x;
	public List<Servicio> getX() {
		return x;
	}
	public void setX(List<Servicio> x) {
		this.x = x;
	}
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "cliente")
	List<Registro> regitro;
}
