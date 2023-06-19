package com.proyecto01.proyecto.service;

import java.util.List;


import com.proyecto01.proyecto.entity.Registro;

public interface RegistroService {
	
	public Registro actualizar(Registro a);
	public Registro registrar(Registro a);
	public void borrar (Registro a);
	public List<Registro>consultar();
}
