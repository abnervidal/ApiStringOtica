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

import com.example.apispringotica.entities.Grau;
// import com.example.apispringotica.entities.OrdemServico;
import com.example.apispringotica.services.GrauService;

@RestController
@RequestMapping("/grau")
public class GrauController {
    @Autowired
    private GrauService grauService;

    @PostMapping
    @Secured(value = { "ROLE_ADMIN", "ROLE_MEDICO" })
    List<Grau> create(@RequestBody Grau grau){
        return grauService.create(grau);
    }
    @GetMapping
    @Secured(value = { "ROLE_ADMIN", "ROLE_MEDICO" })
    List<Grau> list(){
        return grauService.list();
    }
    @PutMapping
    @Secured(value = { "ROLE_ADMIN", "ROLE_MEDICO" })
    List<Grau> update(@RequestBody Grau grau){
        return grauService.update(grau);
    }
    @DeleteMapping("{idGrau}")
    @Secured(value = { "ROLE_ADMIN", "ROLE_MEDICO" })
    List<Grau> delete(@PathVariable("idGrau") Integer idGrau){
        return grauService.delete(idGrau);
    }
    @GetMapping("/ordemservicos/{idOrdemServico}")
    @Secured(value = { "ROLE_ADMIN", "ROLE_MEDICO" })
    public List<Grau> getGrauDaOrdem(@PathVariable Integer idOrdemServico) {
        List<Grau> grau = grauService.getGrauDaOrdem(idOrdemServico);
        return grau;
    }
}
