package com.siscondo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.siscondo.model.Morador;
import com.siscondo.service.MoradorService;

@RestController
public class MoradorRestController {
    
    @Autowired
    private MoradorService moradorService;
    
    @RequestMapping(value = "/rest/insertmorador", method = RequestMethod.POST)

    public void insertMorador(@RequestBody Morador morador) {

        moradorService.insertMorador(morador);

    }

}
