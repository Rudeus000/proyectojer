package com.proyecto01.proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.proyecto01.proyecto.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, String>{

}
