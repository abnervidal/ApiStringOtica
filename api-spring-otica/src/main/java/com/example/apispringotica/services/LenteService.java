package com.example.apispringotica.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.apispringotica.entities.Lente;
import com.example.apispringotica.repositories.LenteRepository;

@Service
public class LenteService {
    @Autowired
    private LenteRepository lenteRepository;

    public List<Lente> create(Lente lente) {
        lenteRepository.save(lente);
        return list();
    }

    public List<Lente> list() {
        return lenteRepository.findAll();
    }
    public List<Lente> update(Lente lente) {
        lenteRepository.save(lente);
        return list();
    }
    public List<Lente> delete(Integer idLente) {
        lenteRepository.deleteById(idLente);
        return list();
    }
}
