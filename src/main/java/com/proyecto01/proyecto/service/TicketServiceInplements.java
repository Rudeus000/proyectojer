package com.proyecto01.proyecto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto01.proyecto.entity.Ticket;
import com.proyecto01.proyecto.repository.TicketRepository;

@Service
public class TicketServiceInplements implements TicketService{
	@Autowired
	TicketRepository t;
	@Override
	public Ticket registrar(Ticket a) {
		// TODO Auto-generated method stub
		return t.save(a);
	}

	@Override
	public Ticket actualizar(Ticket a) {
		// TODO Auto-generated method stub
		return t.save(a);
	}

	@Override
	public void eliminar(Ticket a) {
		// TODO Auto-generated method stub
		t.delete(a);
	}

	@Override
	public List<Ticket> ver() {
		// TODO Auto-generated method stub
		return t.findAll();
	}

}
