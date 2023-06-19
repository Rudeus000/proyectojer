package com.proyecto01.proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto01.proyecto.entity.Personal;

public interface PersonalRepository extends JpaRepository<Personal, String> {

}
