package com.proyecto01.proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.proyecto01.proyecto.entity.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, String> {

}
