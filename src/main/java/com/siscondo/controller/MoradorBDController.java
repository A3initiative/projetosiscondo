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

import com.siscondo.model.Morador;
import com.siscondo.service.MoradorService;

@Controller
public class MoradorBDController {
    
    @Autowired
    private MoradorService moradorService;

    @RequestMapping(value = "/insert", method = RequestMethod.GET)

    public ModelAndView insert() {

        return new ModelAndView("insert", "morador", new Morador());

    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)

    public String submitInsert(@Valid @ModelAttribute("morador")Morador morador, BindingResult result, ModelMap model) {

        if (result.hasErrors()) {
            return "error";
        }

        moradorService.insertMorador(morador);

        return "home";

    }

}
