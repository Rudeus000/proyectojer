package com.proyecto01.proyecto.service;
 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto01.proyecto.entity.Descripcion;

import com.proyecto01.proyecto.repository.DescripcionRepository;

@Service
public class DescripcionServiceImplements implements DescripcionService {
	@Autowired
	DescripcionRepository descripcionRepository;
	@Override
	public Descripcion registrar(Descripcion a) {
		// TODO Auto-generated method stub
		return descripcionRepository.save(a);
	}

	@Override
	public Descripcion actualizar(Descripcion a) {
		// TODO Auto-generated method stub
		return descripcionRepository.save(a);
	}

	@Override
	public void eliminar(Descripcion a) {
		// TODO Auto-generated method stub
		descripcionRepository.delete(a);
	}

	@Override
	public List<Descripcion> ver() {
		// TODO Auto-generated method stub
		return descripcionRepository.findAll();
	}

}
