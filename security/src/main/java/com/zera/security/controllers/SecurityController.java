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
@RequestMapping(path = "api/produtos")
public class SecurityController {

    @Autowired
    private SecurityService securityService;

    @GetMapping
    public ResponseEntity<List<SecurityModel>> findAll() {
        List<SecurityModel> request = securityService.buscarTodos();
        return ResponseEntity.ok().body(request);
    }

    @PostMapping
    public ResponseEntity<SecurityModel> criarProduto(@RequestBody SecurityModel Model) {
        SecurityModel request = securityService.criarProduto(Model);
        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{api/produtos}")
                .buildAndExpand(Model.getId())
                .toUri();
        return ResponseEntity.created(uri).body(request);
    }
}
