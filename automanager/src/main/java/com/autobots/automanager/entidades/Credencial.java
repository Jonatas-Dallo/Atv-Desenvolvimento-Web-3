package com.autobots.automanager.entidades;


import javax.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "credencial")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Credencial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Date criacao;

    @Column
    private Date ultimoAcesso;

    @Column(nullable = false)
    private boolean inativo;
}