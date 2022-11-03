package com.siscondo.service;

import java.util.Optional;
import java.util.List;

import com.siscondo.model.Pessoa;

public interface PessoaService {
    Optional<Pessoa> getPessoaById(Long id);
    List<Pessoa> getAllPessoas();
    List<Pessoa> findAll();
    void deleteAllPessoa();
    void deletePessoaById(Long id);
    void updatePessoaById(Long id, Pessoa pessoa);
    void updatePessoa(Pessoa pessoa);
    void insertPessoa(Pessoa pessoa);

}
