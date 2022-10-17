package com.siscondo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.siscondo.repository.PessoaRepository;

@Controller
public class Principal {
    
    @Autowired
    private PessoaRepository pessoaRepository;
	
	@RequestMapping("/projetosiscondo/home")
	public String home(){
		return "home";
	}
    
    @GetMapping(value="/projetosiscondo/index")
    public String index(){
        return "index";
    }
	
	@RequestMapping(value="/projetosiscondo/login")
	public String login(){
		return "login";
	}
	
	//ENCOMENDA
    
    @RequestMapping(value="/projetosiscondo/consultar_encomenda")
    public String consultarEncomenda(){
        return "consultar_encomenda";
    }
    
    @RequestMapping(value="/projetosiscondo/alterar_encomenda")
    public String alterarEncomenda(){
        return "alterar_encomenda";
    }
	
	@RequestMapping(value="/projetosiscondo/registrar_encomenda")
	public String registrarEncomenda(){
		return "registrar_encomenda";
	}
    
	//USUÁRIO
	
    @RequestMapping(value="/projetosiscondo/consultar_usuario")
    public String consultarUsuario(){
        return "consultar_usuario";
    }
    
    @RequestMapping(value="/projetosiscondo/alterar_usuario")
    public String alterarUsuario(){
        return "alterar_usuario";
    }
	
	@RequestMapping(value="/projetosiscondo/registrar_usuario")
	public String registrarUsuario(){
		return "registrar_usuario";
	}
	 
	 @GetMapping("/projetosiscondo/emitir_relatorio")
     public String listaPessoas(Model model) {
         model.addAttribute("listaPessoas", pessoaRepository.findAll());
         return "emitir_relatorio";
     }
}
