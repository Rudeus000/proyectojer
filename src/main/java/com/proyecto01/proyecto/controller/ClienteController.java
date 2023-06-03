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

import com.proyecto01.proyecto.entity.Cliente;
import com.proyecto01.proyecto.service.ClienteService;

@RestController
@RequestMapping("/restuarante")
public class ClienteController {
	@Autowired
	ClienteService x;
	
	@PostMapping
	public Cliente guardar (@RequestBody Cliente a) {
		return x.registrar(a);
	}
	@PutMapping
	public Cliente actualizar   (@RequestBody Cliente a) {
		return x.actualizar(a);
}
	@DeleteMapping
	public void eleminar (@RequestBody Cliente a) {
		x.eliminar(a);
	}
	@GetMapping
	public List<Cliente> verc(){
		return x.ver();
	}
}