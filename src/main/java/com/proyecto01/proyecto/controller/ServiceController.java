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

import com.proyecto01.proyecto.entity.Servicio;
import com.proyecto01.proyecto.service.ServicioService;

@RestController
@RequestMapping("/servicio")
public class ServiceController {
	@Autowired
	ServicioService x;
	
	@PostMapping
	public Servicio guardar (@RequestBody Servicio a) {
		return x.registrar(a);
	}
	@PutMapping
	public Servicio actualizar   (@RequestBody Servicio a) {
		return x.actualizar(a);
}
	@DeleteMapping
	public void eleminar (@RequestBody Servicio a) {
		x.borrar(a);;
	}
	@GetMapping
	public List<Servicio> verc(){
		return x.consultar();
	}
}
