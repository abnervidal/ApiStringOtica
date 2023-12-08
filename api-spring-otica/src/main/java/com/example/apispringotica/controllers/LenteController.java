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

import com.example.apispringotica.entities.Lente;
import com.example.apispringotica.services.LenteService;

@RestController
@RequestMapping("/lentes")
public class LenteController {
    @Autowired
    private LenteService lenteService;

    @PostMapping
    @Secured(value = { "ROLE_ADMIN", "ROLE_VENDEDOR" })
    List<Lente> create(@RequestBody Lente lente){
        return lenteService.create(lente);
    }
    @GetMapping
    @Secured(value = { "ROLE_ADMIN", "ROLE_VENDEDOR" })
    List<Lente> list(){
        return lenteService.list();
    }
    @PutMapping
    @Secured(value = { "ROLE_ADMIN", "ROLE_VENDEDOR" })
    List<Lente> update(@RequestBody Lente lente){
        return lenteService.update(lente);
    }
    @DeleteMapping("{id}")
    @Secured(value = { "ROLE_ADMIN", "ROLE_VENDEDOR" })
    List<Lente> delete(@PathVariable("id") Integer idLente){
        return lenteService.delete(idLente);
    }
}
