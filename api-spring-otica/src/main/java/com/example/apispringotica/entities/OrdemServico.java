package com.example.apispringotica.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

// namedQuerry

@Entity
@Table(name = "ordem_servico")
@Getter @Setter
public class OrdemServico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column()
    private String valor;

    @OneToOne
    @JoinColumn(nullable = false, updatable = false)
    private Lente lente;

    @ManyToOne
    @JoinColumn(nullable = false, updatable = false)
    private Cliente cliente;
    
    @OneToOne
    @JoinColumn(nullable = false, updatable = false)
    private Armacao armacao;

    // @OneToOne
    // @JoinColumn(nullable = false, updatable = false)
    // private Grau grau;

    // @OneToOne
    // @JoinColumn(nullable = false, updatable = false)
    // private Status status;
}
