package com.example.apispringotica.entities;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

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
