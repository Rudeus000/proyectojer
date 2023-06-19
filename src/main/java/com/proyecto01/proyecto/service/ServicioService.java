package com.proyecto01.proyecto.service;

import java.util.List;


import com.proyecto01.proyecto.entity.Servicio;

public interface ServicioService {
	public Servicio actualizar(Servicio a);
	public Servicio registrar(Servicio a);
	public void borrar (Servicio a);
	public List<Servicio>consultar();
}
