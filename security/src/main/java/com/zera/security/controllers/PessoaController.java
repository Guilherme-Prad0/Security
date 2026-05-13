package com.zera.security.controllers;

import com.zera.security.models.PessoaModel;
import com.zera.security.services.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/produtos")
public class PessoaController {

    @Autowired
    private PessoaService securityService;

    @GetMapping
    public List<PessoaModel> findAll() {
        return securityService.buscarTodos();
    }

    @PostMapping
    public PessoaModel criarProduto(@RequestBody PessoaModel Model) {
        return securityService.criarProduto(Model);
    }
}
