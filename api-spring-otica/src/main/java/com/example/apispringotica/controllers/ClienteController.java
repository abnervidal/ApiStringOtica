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

import com.example.apispringotica.entities.Cliente;
import com.example.apispringotica.services.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    
    @Autowired
    private ClienteService clienteService;

    @PostMapping
    @Secured(value = { "ROLE_ADMIN" })
    List<Cliente> create(@RequestBody Cliente cliente){
        return clienteService.create(cliente);
    }
    @GetMapping
    @Secured(value = { "ROLE_ADMIN", "ROLE_MEDICO", "ROLE_VENDEDOR" })
    List<Cliente> list(){
        return clienteService.list();
    }
    @PutMapping
    @Secured(value = { "ROLE_ADMIN", "ROLE_MEDICO", "ROLE_VENDEDOR" })
    List<Cliente> update(@RequestBody Cliente cliente){
        return clienteService.update(cliente);
    }
    @DeleteMapping("{id}")
    @Secured(value = { "ROLE_ADMIN" })
    List<Cliente> delete(@PathVariable("id") Integer idCliente){
        return clienteService.delete(idCliente);
    }
}
