package com.example.apispringotica.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.apispringotica.entities.Grau;
// import com.example.apispringotica.entities.OrdemServico;
import com.example.apispringotica.repositories.GrauRepository;

@Service
public class GrauService {
    @Autowired
    private GrauRepository grauRepository;

    public List<Grau> create(Grau grau) {
        grauRepository.save(grau);
        return list();
    }

    public List<Grau> list() {
        return grauRepository.findAll();
    }
    public List<Grau> update(Grau grau) {
        grauRepository.save(grau);
        return list();
    }
    public List<Grau> delete(Integer idGrau) {
        grauRepository.deleteById(idGrau);
        return list();
    }
    public List<Grau> getGrauDaOrdem(Integer idOrdemServico){
        return grauRepository.findByOrdemServicoId(idOrdemServico);
    }
}
