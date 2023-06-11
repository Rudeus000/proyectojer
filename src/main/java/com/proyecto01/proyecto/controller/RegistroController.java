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

import com.proyecto01.proyecto.entity.Registro;
import com.proyecto01.proyecto.service.RegistroService;

@RestController
@RequestMapping("/registro")
public class RegistroController {
	@Autowired
	RegistroService x;
	
	@PostMapping
	public Registro guardar (@RequestBody Registro a) {
		return x.registrar(a);
	}
	@PutMapping
	public Registro actualizar   (@RequestBody Registro a) {
		return x.actualizar(a);
}
	@DeleteMapping
	public void eleminar (@RequestBody Registro a) {
		x.borrar(a);;
	}
	@GetMapping
	public List<Registro> verc(){
		return x.consultar();
	}
}
