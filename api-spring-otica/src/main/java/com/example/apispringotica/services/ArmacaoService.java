package com.example.apispringotica.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.apispringotica.entities.Armacao;
import com.example.apispringotica.repositories.ArmacaoRepository;

@Service
public class ArmacaoService {
    @Autowired
    private ArmacaoRepository armacaoRepository;

    public List<Armacao> create(Armacao armacao) {
        armacaoRepository.save(armacao);
        return list();
    }

    public List<Armacao> list() {
        return armacaoRepository.findAll();
    }
    public List<Armacao> update(Armacao armacao) {
        armacaoRepository.save(armacao);
        return list();
    }
    public List<Armacao> delete(Integer idArmacao) {
        armacaoRepository.deleteById(idArmacao);
        return list();
    }
}
