package com.proyecto01.proyecto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto01.proyecto.entity.Ticket;
import com.proyecto01.proyecto.service.TicketService;

@RestController
@RequestMapping("/ticket")

public class TicketController {
@Autowired
TicketService t;
@PutMapping
public Ticket aactualizar  (@RequestBody Ticket a) {
	return t.actualizar(a);
}
@PostMapping
public Ticket desc  (@RequestBody Ticket a) {
	return t.registrar(a);
	
}
@DeleteMapping
public void eleknar (@RequestBody Ticket a) {
	 t.eliminar(a);
}
@GetMapping
public List<Ticket> vert() {
	return t.ver();
}
}
