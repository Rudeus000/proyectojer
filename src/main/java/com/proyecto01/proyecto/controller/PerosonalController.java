package com.proyecto01.proyecto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto01.proyecto.entity.Personal;
import com.proyecto01.proyecto.service.PersonalService;

@RestController

public class PerosonalController {
	  @Autowired
	    PersonalService personalService;

	    @PutMapping("/personal")
	    public Personal actualizar(@RequestBody Personal personal) {
	        return personalService.actualizar(personal);
	    }

	    @PostMapping("/personal")
	    public Personal registrar(@RequestBody Personal personal) {
	        return personalService.registrar(personal);
	    }

	    @DeleteMapping("/personal")
	    public void eliminar(@RequestBody Personal personal) {
	        personalService.eliminar(personal);
	    }

	    @GetMapping("/personal")
	    public List<Personal> verPersonal() {
	        return personalService.ver();
	    }
	}
