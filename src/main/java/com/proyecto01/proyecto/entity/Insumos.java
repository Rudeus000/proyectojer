package com.proyecto01.proyecto.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name="Insumos")
@Table(name="Insumos")

public class Insumos {
	@Id
	String codigo;
	String suministro;
	String tipos;
	
	public Insumos() {
		super();
	}
	public Insumos(String suministro, String tipos, String codigo) {
		super();
		this.suministro = suministro;
		this.tipos = tipos;
		this.codigo = codigo;
	}
	public String getSuministro() {
		return suministro;
	}
	public void setSuministro(String suministro) {
		this.suministro = suministro;
	}
	public String getTipos() {
		return tipos;
	}
	public void setTipos(String tipos) {
		this.tipos = tipos;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	

}
