package com.proyecto01.proyecto.service;

import java.util.List;


import com.proyecto01.proyecto.entity.Descripcion;

public interface DescripcionService {
	public Descripcion registrar(Descripcion  a);
	public Descripcion actualizar(Descripcion a);
	public void eliminar(Descripcion a);
	public List<Descripcion> ver();
}
