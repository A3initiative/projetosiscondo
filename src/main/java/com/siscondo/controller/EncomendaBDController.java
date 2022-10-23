package com.siscondo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.siscondo.model.Encomenda;
import com.siscondo.service.EncomendaService;

@Controller
public class EncomendaBDController {
    
    @Autowired(required = false)
    private EncomendaService encomendaService;
    
    @RequestMapping(value = "/registrar_encomenda", method = RequestMethod.GET)

    public ModelAndView insert() {

        return new ModelAndView("insertencomenda", "encomenda", new Encomenda());

    }

    @RequestMapping(value = "/registrar_encomenda", method = RequestMethod.POST)

    public String submitInsert(@Valid @ModelAttribute("encomenda")Encomenda encomenda, BindingResult result, ModelMap model) {

        if (result.hasErrors()) {
            return "error";
        }

        encomendaService.insertEncomenda(encomenda);

        return "home";

    }
    
}
