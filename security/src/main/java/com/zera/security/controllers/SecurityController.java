package com.zera.security.controllers;

import com.zera.security.models.SecurityModel;
import com.zera.security.services.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(path = "/produtos")
public class SecurityController {

    @Autowired
    private SecurityService securityService;

    @GetMapping
    public List<SecurityModel> findAll() {
        return securityService.buscarTodos();
    }

    @PostMapping
    public SecurityModel criarProduto(@RequestBody SecurityModel Model) {
        return securityService.criarProduto(Model);
    }
}
