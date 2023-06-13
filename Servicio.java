package com.proyecto01.proyecto.entity;





import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import jakarta.persistence.Table;

@Entity(name = "Servicio")
@Table(name = "servicio")
public class Servicio {
	@Id
String cod;
String carta;
public Servicio() {
	super();
}

public Servicio(String cod, String carta, Cliente cliente) {
	super();
	this.cod = cod;
	this.carta = carta;
	this.cliente = cliente;
}

public String getCod() {
	return cod;
}

public void setCod(String cod) {
	this.cod = cod;
}

public String getCarta() {
	return carta;
}

public void setCarta(String carta) {
	this.carta = carta;
}

@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "NumRuc") 
private Cliente cliente;

public Cliente getCliente() {
	return cliente;
}

public void setCliente(Cliente cliente) {
	this.cliente = cliente;
}
@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "nm.mesa")
private Mesa mesa;

public Mesa getMesa() {
	return mesa;
}


public void setMesa(Mesa mesa) {
	this.mesa = mesa;
}

}
