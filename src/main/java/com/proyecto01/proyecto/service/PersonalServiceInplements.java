package com.proyecto01.proyecto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto01.proyecto.entity.Personal;
import com.proyecto01.proyecto.repository.PersonalRepository;
@Service
public class PersonalServiceInplements implements PersonalService {
	@Autowired
	PersonalRepository p;
	@Override
	public Personal registrar(Personal a) {
		// TODO Auto-generated method stub
		return p.save(a);
	}

	@Override
	public Personal actualizar(Personal a) {
		// TODO Auto-generated method stub
		return p.save(a);
	}

	@Override
	public void eliminar(Personal a) {
		// TODO Auto-generated method stub
		p.delete(a);
	}

	@Override
	public List<Personal> ver() {
		// TODO Auto-generated method stub
		return p.findAll();
	}

}
