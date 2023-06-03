package com.proyecto01.proyecto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestAttribute;

import org.springframework.web.bind.annotation.RestController;

import com.proyecto01.proyecto.entity.Mesa;
import com.proyecto01.proyecto.service.MesaService;

@RestController


public class MesaController {
@Autowired
MesaService m;
@PostMapping("/mesa")
public Mesa guardar (@RequestAttribute Mesa a) {
	return m.registrar(a);
}
@PutMapping("/mesa")
public Mesa actualizar (@RequestAttribute Mesa a) {
	return m.actualizar(a);
}
@DeleteMapping("/mesa")
public void eleminar (@RequestAttribute Mesa a) {
	 m.eliminar(a);
}
@GetMapping("/mesa")
public List<Mesa>verm() {
	return m.ver();
}
}
