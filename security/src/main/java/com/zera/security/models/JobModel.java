package com.zera.security.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "TBL_JOB")
@Data
public class JobModel
{

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID uuid;
    private String nome;

    //@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    //private List<PessoaModel> pessoaModelList;


}
