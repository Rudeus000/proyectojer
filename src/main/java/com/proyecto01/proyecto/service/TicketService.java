package com.proyecto01.proyecto.service;

import java.util.List;

import com.proyecto01.proyecto.entity.Ticket;

public interface TicketService {
	public Ticket registrar(Ticket  a);
	public Ticket actualizar(Ticket a);
	public void eliminar(Ticket a);
	public List<Ticket> ver();
}
