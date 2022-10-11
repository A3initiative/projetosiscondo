package com.siscondo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Principal {
	
	@RequestMapping(value="/projetosiscondo/index")
	public String index(){
		return "index";
	}
	
	@RequestMapping(value="/projetosiscondo/login")
	public String login(){
		return "login";
	}
	
	@RequestMapping(value="/projetosiscondo/registrar_encomenda")
	public String registrarEncomenda(){
		return "registrar_encomenda";
	}
	
	@RequestMapping(value="/projetosiscondo/registrar_usuario")
	public String registrarUsuario(){
		return "registrar_usuario";
	}

}
