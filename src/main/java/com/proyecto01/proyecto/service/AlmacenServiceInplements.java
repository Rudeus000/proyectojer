package com.proyecto01.proyecto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto01.proyecto.entity.Almacen;
import com.proyecto01.proyecto.repository.AlmacenRepositry;
@Service
public class AlmacenServiceInplements implements AlmacenService {
	@Autowired
	AlmacenRepositry x;
	@Override
	public Almacen actualizar(Almacen a) {
		// TODO Auto-generated method stub
		return x.save(a);
	}

	@Override
	public Almacen registrar(Almacen a) {
		// TODO Auto-generated method stub
		return x.save(a);
	}

	@Override
	public void borrar(Almacen a) {
		// TODO Auto-generated method stub
		x.delete(a);
	}

	@Override
	public List<Almacen> consultar() {
		// TODO Auto-generated method stub
		return x.findAll();
	}

}
