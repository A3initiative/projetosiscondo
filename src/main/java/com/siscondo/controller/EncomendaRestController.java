package com.siscondo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.siscondo.model.Encomenda;
import com.siscondo.service.EncomendaService;

@RestController
public class EncomendaRestController {
    
    @Autowired(required = false)
    private EncomendaService encomendaService;
    
    @RequestMapping(value = "/rest/insertencomenda", method = RequestMethod.POST)

    public void insertEncomenda(@RequestBody Encomenda encomenda) {

        encomendaService.insertEncomenda(encomenda);

    }

}
