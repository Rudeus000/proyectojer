package com.proyecto01.proyecto.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "Orden")
@Table(name = "orden")
public class Orden {
	@Id
String nm_mesa;
String dni;
String pedido;
public Orden() {
	super();
}
public Orden(String nm_mesa, String dni, String pedido) {
	super();
	this.nm_mesa = nm_mesa;
	this.dni = dni;
	this.pedido = pedido;
}
public String getNm_mesa() {
	return nm_mesa;
}
public void setNm_mesa(String nm_mesa) {
	this.nm_mesa = nm_mesa;
}
public String getDni() {
	return dni;
}
public void setDni(String dni) {
	this.dni = dni;
}
public String getPedido() {
	return pedido;
}
public void setPedido(String pedido) {
	this.pedido = pedido;
}

}
