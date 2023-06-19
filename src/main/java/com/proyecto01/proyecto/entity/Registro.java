package com.proyecto01.proyecto.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity(name = "Registro")
@Table(name = "registro")
public class Registro {
	@Id
String ruc;
String rgconsumo;
String rgpago;
public Registro() {
	super();
}
public Registro(String ruc, String rgconsumo, String rgpago) {
	super();
	this.ruc = ruc;
	this.rgconsumo = rgconsumo;
	this.rgpago = rgpago;
}
public String getRuc() {
	return ruc;
}
public void setRuc(String ruc) {
	this.ruc = ruc;
}
public String getRgconsumo() {
	return rgconsumo;
}
public void setRgconsumo(String rgconsumo) {
	this.rgconsumo = rgconsumo;
}
public String getRgpago() {
	return rgpago;
}
public void setRgpago(String rgpago) {
	this.rgpago = rgpago;
}

}
