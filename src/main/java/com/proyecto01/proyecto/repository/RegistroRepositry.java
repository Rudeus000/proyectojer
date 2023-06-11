package com.proyecto01.proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto01.proyecto.entity.Registro;

public interface RegistroRepositry extends JpaRepository<Registro, String> {

}
