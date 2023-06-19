package com.proyecto01.proyecto.service;

import java.util.List;

import com.proyecto01.proyecto.entity.Orden;

public interface OrdenService {

		public Orden actualizar(Orden a);
		public Orden registrar(Orden a);
		public void borrar (Orden a);
		public List<Orden>consultar();
}

