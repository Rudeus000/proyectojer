package com.proyecto01.proyecto.service;

import java.util.List;

import com.proyecto01.proyecto.entity.Reseña;

public interface ResenaService {
	public Reseña actualizar(Reseña a);
	public Reseña registrar(Reseña a);
	public void borrar (Reseña a);
	public List<Reseña>consultar();

}
