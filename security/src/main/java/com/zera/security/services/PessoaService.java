package com.zera.security.services;

import com.zera.security.models.PessoaModel;
import com.zera.security.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository securityRepository;

    public List<PessoaModel> buscarTodos (){
        return securityRepository.findAll();
    }

    public PessoaModel criarProduto(PessoaModel securityModel) {
        return securityRepository.save(securityModel);
    }

}
