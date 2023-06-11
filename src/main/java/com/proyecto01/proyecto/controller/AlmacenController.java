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

import com.proyecto01.proyecto.entity.Almacen;
import com.proyecto01.proyecto.service.AlmacenService;

@RestController
@RequestMapping("/almacen")
public class AlmacenController {
	@Autowired
	AlmacenService x;
	
	@PostMapping
	public Almacen guardar (@RequestBody Almacen a) {
		return x.registrar(a);
	}
	@PutMapping
	public Almacen actualizar   (@RequestBody Almacen a) {
		return x.actualizar(a);
}
	@DeleteMapping
	public void eleminar (@RequestBody Almacen a) {
		x.borrar(a);;
	}
	@GetMapping
	public List<Almacen> verc(){
		return x.consultar();
	}
}
