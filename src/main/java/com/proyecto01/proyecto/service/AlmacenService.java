package com.proyecto01.proyecto.service;

import java.util.List;

import com.proyecto01.proyecto.entity.Almacen;



public interface AlmacenService  {
		public Almacen actualizar(Almacen a);
		public Almacen registrar(Almacen a);
		public void borrar (Almacen a);
		public List<Almacen>consultar();
}
