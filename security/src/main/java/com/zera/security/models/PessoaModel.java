package com.zera.security.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "TBL_PESSOAS")
@Data
public class  PessoaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String nome;

    @OneToMany
    private List<JobModel> jobModelList;


}
