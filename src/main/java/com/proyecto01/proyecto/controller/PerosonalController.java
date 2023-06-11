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

import com.proyecto01.proyecto.entity.Personal;
import com.proyecto01.proyecto.service.PersonalService;

@RestController
@RequestMapping("/personal")
public class PerosonalController {
	  @Autowired
	    PersonalService personalService;

	    @PutMapping
	    public Personal actualizar(@RequestBody Personal personal) {
	        return personalService.actualizar(personal);
	    }

	    @PostMapping
	    public Personal registrar(@RequestBody Personal personal) {
	        return personalService.registrar(personal);
	    }

	    @DeleteMapping
	    public void eliminar(@RequestBody Personal personal) {
	        personalService.eliminar(personal);
	    }

	    @GetMapping
	    public List<Personal> verPersonal() {
	        return personalService.ver();
	    }
	}
