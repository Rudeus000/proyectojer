package com.proyecto01.proyecto.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "Servicio")
@Table(name = "servicio")
public class Servicio {
	@Id
String ruc;
String nm_mesa;
String carta;
public Servicio() {
	super();
}
public Servicio(String ruc, String nm_mesa, String carta) {
	super();
	this.ruc = ruc;
	this.nm_mesa = nm_mesa;
	this.carta = carta;
}

public String getRuc() {
	return ruc;
}

public void setRuc(String ruc) {
	this.ruc = ruc;
}

public String getNm_mesa() {
	return nm_mesa;
}

public void setNm_mesa(String nm_mesa) {
	this.nm_mesa = nm_mesa;
}

public String getCarta() {
	return carta;
}

public void setCarta(String carta) {
	this.carta = carta;
}

}
