package com.example.apispringotica.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.apispringotica.entities.Usuario;
import com.example.apispringotica.services.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    List<Usuario> create(@RequestBody Usuario usuario){
        return usuarioService.create(usuario);
    }
    @GetMapping
    List<Usuario> list(){
        return usuarioService.list();
    }
    @PutMapping
    List<Usuario> update(@RequestBody Usuario usuario){
        return usuarioService.update(usuario);
    }
    @DeleteMapping("{id}")
    List<Usuario> delete(@PathVariable("id") Integer id){
        return usuarioService.delete(id);
    }
}