package com.example.apispringotica.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "ordem_servico")
@Getter @Setter
public class OrdemServico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column()
    private String armacao;
    
    @Column()
    private String valor;

    @Column()
    private Integer lenteId;

    @Column()
    private Integer grauId;

    @Column()
    private Integer statusId;
}
