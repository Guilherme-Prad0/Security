package com.zera.security.services;

import com.zera.security.models.SecurityModel;
import com.zera.security.repositories.SecurityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SecurityService {

    @Autowired
    private SecurityRepository securityRepository;

    public List<SecurityModel> buscarTodos (){
        return securityRepository.findAll();
    }

    public SecurityModel criarProduto(SecurityModel securityModel) {
        return securityRepository.save(securityModel);
    }

}
