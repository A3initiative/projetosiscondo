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

import com.siscondo.model.Pessoa;
import com.siscondo.service.PessoaService;

@Controller
public class PessoaBDController{
    
    @Autowired
    private PessoaService pessoaService;

    @RequestMapping(value = "/registrar_usuario", method = RequestMethod.GET)

    public ModelAndView insert() {

        return new ModelAndView("insert", "pessoa", new Pessoa());

    }

    @RequestMapping(value = "/registrar_usuario", method = RequestMethod.POST)

    public String submitInsert(@Valid @ModelAttribute("pessoa")Pessoa pessoa, BindingResult result, ModelMap model) {

        if (result.hasErrors()) {
            return "error";
        }

        pessoaService.insertPessoa(pessoa);
        
        EmailController email = new EmailController();
        email.enviaEmail(pessoa.getEmail(), pessoa.getNome(), pessoa.getSenha(), pessoa.getPerfil()); 

        return "home";

    }
}
