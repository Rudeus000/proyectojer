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

import com.proyecto01.proyecto.entity.Descripcion;
import com.proyecto01.proyecto.service.DescripcionService;
@RestController
@RequestMapping("/descrpicion")
public class DescrpcionController {
	
	@Autowired
	DescripcionService de;
	@PostMapping
	public Descripcion guardar(@RequestBody Descripcion a) {
		return de.registrar(a);
	}
	@PutMapping
	public Descripcion actalizar(@RequestBody Descripcion a) {
		return de.actualizar(a);
	}
	@DeleteMapping
	public void eleminar(@RequestBody Descripcion a) {
		de.eliminar(a);
	}
	@GetMapping
	public List<Descripcion> veras(){
		return de.ver();
	}
	}


