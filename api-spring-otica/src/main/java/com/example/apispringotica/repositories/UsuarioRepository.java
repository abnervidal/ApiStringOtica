package com.example.apispringotica.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.apispringotica.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer > {
    Usuario getUsuarioPorLogin(String login);
}
