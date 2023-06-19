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

import com.proyecto01.proyecto.entity.Reseña;
import com.proyecto01.proyecto.service.ResenaService;
@RestController
@RequestMapping("/Reseña")
public class ResenaController {
	@Autowired
	ResenaService x;
	
	@PostMapping
	public Reseña guardar (@RequestBody Reseña a) {
		return x.registrar(a);
	}
	@PutMapping
	public Reseña actualizar   (@RequestBody Reseña a) {
		return x.actualizar(a);
}
	@DeleteMapping
	public void eleminar (@RequestBody Reseña a) {
		x.borrar(a);;
	}
	@GetMapping
	public List<Reseña> verc(){
		return x.consultar();
	}
}
