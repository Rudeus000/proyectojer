package com.proyecto01.proyecto.service;

import java.util.List;

import com.proyecto01.proyecto.entity.Mesa;

public interface MesaService {
	public Mesa registrar(Mesa  a);
	public Mesa actualizar(Mesa a);
	public void eliminar(Mesa a);
	public List<Mesa> ver();
}
