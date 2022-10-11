package com.siscondo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.siscondo.exception.ResourceNotFoundException;
import com.siscondo.model.Pessoa;
import com.siscondo.repository.PessoaRepository;

@RestController
@RequestMapping("/projetosiscondo/index")
public class PessoaController {
	
	 @Autowired
	 private PessoaRepository pessoaRepository;

	    // get pessoas	    
	 	
	    @GetMapping("/pessoa")
	    public List<Pessoa> getAllPessoas() {
	        return pessoaRepository.findAll();
	    }

	    // get pessoa by Id
	    
	    @GetMapping("/pessoa/{id}")
	    public ResponseEntity<Pessoa> getPessoaById(@PathVariable(value = "id") Long pessoaId)
	        throws ResourceNotFoundException {
	        Pessoa pessoa = pessoaRepository.findById(pessoaId)
	          .orElseThrow(() -> new ResourceNotFoundException("Pessoa not found for this id :: " + pessoaId));
	        return ResponseEntity.ok().body(pessoa);
	    }
	    
	    // save pessoa
	    
	    @PostMapping("/pessoa")
	    public Pessoa createPessoa(@Valid @RequestBody Pessoa pessoa) {
	        return pessoaRepository.save(pessoa);
	    }

	    // update pessoa
	    
	    @PutMapping("/pessoa/{id}")
	    public ResponseEntity<Pessoa> updatePessoa(@PathVariable(value = "id") Long pessoaId,
	         @Valid @RequestBody Pessoa pessoaDetails) throws ResourceNotFoundException {
	    	
	        Pessoa pessoa = pessoaRepository.findById(pessoaId)
	        .orElseThrow(() -> new ResourceNotFoundException("Pessoa not found for this id :: " + pessoaId));
	        
	        pessoa.setSenha(pessoaDetails.getSenha());
	        pessoa.setTelefone(pessoaDetails.getTelefone());
	        pessoa.setEmail(pessoaDetails.getEmail());
	        pessoa.setNome(pessoaDetails.getNome());
	        
	        final Pessoa updatedPessoa = pessoaRepository.save(pessoa);
	        return ResponseEntity.ok(updatedPessoa);
	    }

	    // delete pessoa
	    
	    @DeleteMapping("/pessoa/{id}")
	    public Map<String, Boolean> deletePessoa(@PathVariable(value = "id") Long pessoaId)
	         throws ResourceNotFoundException {
	        Pessoa pessoa = pessoaRepository.findById(pessoaId)
	       .orElseThrow(() -> new ResourceNotFoundException("Pessoa not found for this id :: " + pessoaId));

	        pessoaRepository.delete(pessoa);
	        Map<String, Boolean> response = new HashMap<>();
	        response.put("deleted", Boolean.TRUE);
	        return response;
	    }

}
