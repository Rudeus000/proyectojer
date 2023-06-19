package com.proyecto01.proyecto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto01.proyecto.entity.Reseña;
import com.proyecto01.proyecto.repository.ResenaRepository;
@Service
public class ResenaServiceImplements implements ResenaService {
	@Autowired
	ResenaRepository x;
	@Override
	public Reseña actualizar(Reseña a) {
		// TODO Auto-generated method stub
		return x.save(a);
	}

	@Override
	public Reseña registrar(Reseña a) {
		// TODO Auto-generated method stub
		return x.save(a);
	}

	@Override
	public void borrar(Reseña a) {
		// TODO Auto-generated method stub
		x.delete(a);
	}

	@Override
	public List<Reseña> consultar() {
		// TODO Auto-generated method stub
		return x.findAll();
	}

}
