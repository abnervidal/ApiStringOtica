package com.example.apispringotica.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.apispringotica.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
    
}
