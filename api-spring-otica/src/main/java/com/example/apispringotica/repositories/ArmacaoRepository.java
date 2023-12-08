package com.example.apispringotica.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.apispringotica.entities.Armacao;

public interface ArmacaoRepository extends JpaRepository<Armacao, Integer> {
    
}
