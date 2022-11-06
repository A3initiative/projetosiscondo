package com.siscondo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.siscondo.repository.PessoaRepository;
import com.siscondo.repository.EncomendaRepository;

@Controller
public class Principal {
    
    @Autowired
    private PessoaRepository pessoaRepository;
    
    @Autowired
    private EncomendaRepository encomendaRepository;
    	
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
	
	@GetMapping("/projetosiscondo/home")
    public String qtdUsuarios(Model model) {
        model.addAttribute("qtdUsuarios", pessoaRepository.count());
        model.addAttribute("qtdEncomendas", encomendaRepository.count());
        return "home";
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
    
    @GetMapping("/projetosiscondo/registrar_encomenda")
    public String registrarEncomenda(Model model) {
        model.addAttribute("listaMoradores", pessoaRepository.findAll());
        return "registrar_encomenda";
    }
    
    @GetMapping("/projetosiscondo/consultar_encomenda")
    public String consultarEncomenda(Model model) {
        model.addAttribute("buscaNomePessoa", pessoaRepository.findById((long) 77).orElse(null));
        model.addAttribute("buscaVolumeGrande", encomendaRepository.findById((long) 2).orElse(null));
        model.addAttribute("listaEncomendas", encomendaRepository.findAll());
        model.addAttribute("qtdEncomendas", encomendaRepository.count());
        return "consultar_encomenda";
    }
    
    @GetMapping("/projetosiscondo/alterar_encomenda")
    public String alterarEncomenda(Model model) {
        model.addAttribute("listaEncomendasRegistradas", encomendaRepository.findAll());
        return "alterar_encomenda";
    }
    
	//USUÁRIO
	
    @RequestMapping(value="/projetosiscondo/consultar_usuario")
    public String consultarUsuario(Model model){
        model.addAttribute("listaMoradores", pessoaRepository.findAll());
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
     public String emitirRelatorio(Model model) {
         model.addAttribute("listaPessoas", pessoaRepository.findAll());
         model.addAttribute("listaEncomendasRegistradas", encomendaRepository.findAll());
         return "emitir_relatorio";
     }
}
