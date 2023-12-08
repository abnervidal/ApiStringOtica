package com.example.apispringotica.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.apispringotica.entities.Armacao;
import com.example.apispringotica.services.ArmacaoService;

@RestController
@RequestMapping("/armacoes")
public class ArmacaoController {
    @Autowired
    private ArmacaoService armacaoService;

    @PostMapping
    @Secured(value = { "ROLE_ADMIN", "ROLE_VENDEDOR" })
    List<Armacao> create(@RequestBody Armacao armacao){
        return armacaoService.create(armacao);
    }
    @GetMapping
    @Secured(value = { "ROLE_ADMIN", "ROLE_VENDEDOR" })
    List<Armacao> list(){
        return armacaoService.list();
    }
    @PutMapping
    @Secured(value = { "ROLE_ADMIN", "ROLE_VENDEDOR" })
    List<Armacao> update(@RequestBody Armacao armacao){
        return armacaoService.update(armacao);
    }
    @DeleteMapping("{id}")
    @Secured(value = { "ROLE_ADMIN", "ROLE_VENDEDOR" })
    List<Armacao> delete(@PathVariable("id") Integer idArmacao){
        return armacaoService.delete(idArmacao);
    }
}
