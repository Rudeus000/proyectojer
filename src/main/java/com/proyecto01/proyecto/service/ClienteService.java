package com.proyecto01.proyecto.service;

import java.util.List;

import com.proyecto01.proyecto.entity.Cliente;

public interface ClienteService {

	public Cliente registrar(Cliente  a);
	public Cliente actualizar(Cliente a);
	public void eliminar(Cliente a);
	public List<Cliente> ver();
}