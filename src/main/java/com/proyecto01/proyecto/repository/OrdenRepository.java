package com.proyecto01.proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto01.proyecto.entity.Orden;

public interface OrdenRepository extends JpaRepository<Orden, String> {

}
