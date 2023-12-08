package com.example.apispringotica.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.apispringotica.entities.Grau;

public interface GrauRepository extends JpaRepository<Grau, Integer> {
    List<Grau> findByOrdemServicoId(Integer idOrdemServico);
    // List<Grau> getGrauDaOrdem(Integer id);
    
}
