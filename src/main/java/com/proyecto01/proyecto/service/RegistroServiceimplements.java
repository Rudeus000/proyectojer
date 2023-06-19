package com.proyecto01.proyecto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto01.proyecto.entity.Registro;
import com.proyecto01.proyecto.repository.RegistroRepositry;
@Service
public class RegistroServiceimplements implements RegistroService{
	@Autowired
	RegistroRepositry x;
	@Override
	public Registro actualizar(Registro a) {
		// TODO Auto-generated method stub
		return x.save(a);
	}

	@Override
	public Registro registrar(Registro a) {
		// TODO Auto-generated method stub
		return x.save(a);
	}

	@Override
	public void borrar(Registro a) {
		// TODO Auto-generated method stub
		x.delete(a);
	}

	@Override
	public List<Registro> consultar() {
		// TODO Auto-generated method stub
		return x.findAll();
	}

}
