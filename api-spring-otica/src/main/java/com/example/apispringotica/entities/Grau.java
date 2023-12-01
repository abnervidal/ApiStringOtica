package com.example.apispringotica.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Grau {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column()
    private String od_esf;

    @Column()
    private String od_cil;

    @Column()
    private String od_eixo;

    @Column()
    private String od_dnp;

    @Column()
    private String od_alt;

    @Column()
    private String oe_esf;

    @Column()
    private String oe_cil;

    @Column()
    private String oe_eixo;

    @Column()
    private String oe_dnp;

    @Column()
    private String oe_alt;  
    
    @Column()
    private String adicao;
}
