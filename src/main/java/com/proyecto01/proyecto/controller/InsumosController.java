package com.proyecto01.proyecto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.proyecto01.proyecto.entity.Insumos;
import com.proyecto01.proyecto.service.InsumosService;

public class InsumosController {
@Autowired
InsumosService i;
@PostMapping
public Insumos actualizar(@RequestBody Insumos a) {
	return i.registrar(a);
}
@PutMapping 
public Insumos registrar(@RequestBody Insumos a) {
	return i.actualizar(a);
}
@DeleteMapping
public void eleminar(@RequestBody Insumos a) {
	i.eliminar(a);
}
@GetMapping
public List<Insumos> ver(){
	return i.ver();
}
}
