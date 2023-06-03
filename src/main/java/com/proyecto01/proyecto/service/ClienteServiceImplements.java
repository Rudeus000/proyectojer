package com.proyecto01.proyecto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto01.proyecto.entity.Cliente;
import com.proyecto01.proyecto.repository.ClienteRepository;

@Service
public class ClienteServiceImplements implements ClienteService {
	@Autowired
	ClienteRepository ClienteRepository;

	@Override
	public Cliente registrar(Cliente a) {
		// TODO Auto-generated method stub
		return ClienteRepository.save(a);
	}

	@Override
	public Cliente actualizar(Cliente a) {
		// TODO Auto-generated method stub
		return ClienteRepository.save(a);
	}

	@Override
	public void eliminar(Cliente a) {
		// TODO Auto-generated method stub
		ClienteRepository.delete(a);
	}

	@Override
	public List<Cliente> ver() {
		// TODO Auto-generated method stub
		return ClienteRepository.findAll();
	}

}
