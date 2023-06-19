package com.proyecto01.proyecto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto01.proyecto.entity.Orden;
import com.proyecto01.proyecto.repository.OrdenRepository;
@Service
public class OrdenServiceImplements implements OrdenService {
	@Autowired
 OrdenRepository x;
	@Override
	public Orden actualizar(Orden a) {
		// TODO Auto-generated method stub
		return x.save(a);
	}

	@Override
	public Orden registrar(Orden a) {
		// TODO Auto-generated method stub
		return x.save(a);
	}

	@Override
	public void borrar(Orden a) {
		// TODO Auto-generated method stub
		x.delete(a);
	}

	@Override
	public List<Orden> consultar() {
		// TODO Auto-generated method stub
		return x.findAll();
	}

}
