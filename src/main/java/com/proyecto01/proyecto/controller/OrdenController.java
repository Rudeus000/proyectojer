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

import com.proyecto01.proyecto.entity.Orden;
import com.proyecto01.proyecto.service.OrdenService;
@RestController
@RequestMapping("/orden")
public class OrdenController {
	@Autowired
	OrdenService x;
	
	@PostMapping
	public Orden guardar (@RequestBody Orden a) {
		return x.registrar(a);
	}
	@PutMapping
	public Orden actualizar   (@RequestBody Orden a) {
		return x.actualizar(a);
}
	@DeleteMapping
	public void eleminar (@RequestBody Orden a) {
		x.borrar(a);;
	}
	@GetMapping
	public List<Orden> verc(){
		return x.consultar();
	}
}
