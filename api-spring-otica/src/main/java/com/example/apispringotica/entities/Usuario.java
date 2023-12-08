package com.example.apispringotica.entities;



import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import lombok.Getter;
import lombok.Setter;

@NamedQuery(name = "Usuario.getUsuarioPorLogin", query = "SELECT u FROM Usuario u WHERE u.login=:login")

@Entity
@Table(name = "usuario")
@Getter @Setter
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String nome;    
    
    @Column(nullable = false)
    private String login;

    @Column(nullable = false, updatable = false)
    private String senha;

    @Column(nullable = false)
    private String cargo;

    @Column(nullable = true)
    private String crm;
}
