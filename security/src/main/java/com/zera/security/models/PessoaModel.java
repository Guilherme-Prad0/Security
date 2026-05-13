package com.zera.security.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "TBL_")
@Data
public class  PessoaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;



}
