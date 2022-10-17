package com.siscondo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siscondo.model.Pessoa;
import com.siscondo.repository.PessoaRepository;

@Service("pessoaService")
public class PessoaServiceImpl implements PessoaService {
    
    @Autowired
    PessoaRepository pessoaRepository;

    @Override
    public Optional<Pessoa> getPessoaById(Long id) {
        return pessoaRepository.findById(id);
    }

    @Override
    public List<Pessoa> getAllPessoas() {
        return pessoaRepository.findAll();
    }

    @Override
    public void deleteAllPessoa() {
        // TODO Auto-generated method stub        
    }

    @Override
    public void deletePessoaById(Long id) {
        pessoaRepository.deleteById(id);        
    }

    @Override
    public void updatePessoaById(Long id, Pessoa pessoa) {
        Optional<Pessoa> getPessoa = getPessoaById(id);
        getPessoa.get().setNome(pessoa.getNome());
        getPessoa.get().setEmail(pessoa.getEmail());
        pessoaRepository.save(pessoa);        
    }

    @Override
    public void updatePessoa(Pessoa pessoa) {
        pessoaRepository.save(pessoa);        
    }

    @Override
    public void insertPessoa(Pessoa pessoa) {
        pessoaRepository.save(pessoa);        
    }

}
