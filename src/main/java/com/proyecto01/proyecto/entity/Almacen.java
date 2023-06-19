package com.proyecto01.proyecto.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "Almacen")
@Table(name = "almacen")
public class Almacen {
	@Id
String dni;
String Codigo;
String fecha;
int cantidad;
public Almacen() {
	super();
}
public Almacen(String dni, String codigo, String fecha, int cantidad) {
	super();
	this.dni = dni;
	Codigo = codigo;
	this.fecha = fecha;
	this.cantidad = cantidad;
}
public String getDni() {
	return dni;
}
public void setDni(String dni) {
	this.dni = dni;
}
public String getCodigo() {
	return Codigo;
}
public void setCodigo(String codigo) {
	Codigo = codigo;
}
public String getFecha() {
	return fecha;
}
public void setFecha(String fecha) {
	this.fecha = fecha;
}
public int getCantidad() {
	return cantidad;
}
public void setCantidad(int cantidad) {
	this.cantidad = cantidad;
}

}
