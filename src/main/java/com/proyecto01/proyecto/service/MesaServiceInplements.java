package com.proyecto01.proyecto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto01.proyecto.entity.Mesa;
import com.proyecto01.proyecto.repository.MesaRepository;

@Service
public class MesaServiceInplements implements MesaService {
	@Autowired
	MesaRepository m;
	@Override
	public Mesa registrar(Mesa a) {
		// TODO Auto-generated method stub
		return m.save(a);
	}

	@Override
	public Mesa actualizar(Mesa a) {
		// TODO Auto-generated method stub
		return m.save(a);
	}

	@Override
	public void eliminar(Mesa a) {
		// TODO Auto-generated method stub
		m.delete(a);
	}

	@Override
	public List<Mesa> ver() {
		// TODO Auto-generated method stub
		return m.findAll();
	}

}
