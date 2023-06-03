package com.proyecto01.proyecto.service;

import java.util.List;

import com.proyecto01.proyecto.entity.Personal;

public interface PersonalService {
	public Personal registrar(Personal  a);
	public Personal actualizar(Personal a);
	public void eliminar(Personal  a);
	public List<Personal> ver();
}
