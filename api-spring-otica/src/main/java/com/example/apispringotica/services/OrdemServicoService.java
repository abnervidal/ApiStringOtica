package com.example.apispringotica.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// import com.example.apispringotica.entities.Cliente;
import com.example.apispringotica.entities.OrdemServico;
import com.example.apispringotica.repositories.OrdemServicoRepository;

@Service
public class OrdemServicoService {
    @Autowired
    private OrdemServicoRepository ordemServicoRepository;

    public List<OrdemServico> create(OrdemServico ordemServico) {
        ordemServicoRepository.save(ordemServico);
        return list();
    }

    public List<OrdemServico> list() {
        return ordemServicoRepository.findAll();
    }
    public List<OrdemServico> update(OrdemServico ordemServico) {
        ordemServicoRepository.save(ordemServico);
        return list();
    }
    public List<OrdemServico> delete(Integer idOrdemServico) {
        ordemServicoRepository.deleteById(idOrdemServico);
        return list();
    }
    // public List<OrdemServico> findBygetOrdemCliente(Integer idCliente){
    //     return ordemServicoRepository.findBygetOrdemCliente(idCliente);
    // }
    // // public List<OrdemServico> findBygetOrdemGrau(Integer idGrau){
    // //     return ordemServicoRepository.findBygetOrdemGrauId(idGrau);
    // // }
    // public List<OrdemServico> findBygetOrdemLente(Integer idLente){
    //     return ordemServicoRepository.findBygetOrdemLente(idLente);
    // }
    // public List<OrdemServico> findBygetOrdemArmacao(Integer idArmacao){
    //     return ordemServicoRepository.findBygetOrdemArmacao(idArmacao);
    //}
    // public List<OrdemServico> getOrdemStatus(Integer idStatus){
    //     return ordemServicoRepository.findBygetOrdemStatus(idStatus);
    // }
}
