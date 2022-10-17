package com.siscondo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.siscondo.model.Pessoa;
import com.siscondo.service.PessoaService;

@RestController
public class PessoaRestController {
    
    @Autowired
    private PessoaService pessoaService;
    
    @RequestMapping(value = "/rest/insert", method = RequestMethod.POST)

    public void insertPessoa(@RequestBody Pessoa pessoa) {

        pessoaService.insertPessoa(pessoa);

    }

}
