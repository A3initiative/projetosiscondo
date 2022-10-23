package com.siscondo.service;

import java.util.List;
import java.util.Optional;

import com.siscondo.model.Encomenda;

public interface EncomendaService { 
    Optional<Encomenda> getEncomendaById(Long id);
    List<Encomenda> getAllEncomendas();
    void deleteAllEncomenda();
    void deleteEncomendaById(Long id);
    void updateEncomendaById(Long id, Encomenda Encomenda);
    void updateEncomenda(Encomenda encomenda);
    void insertEncomenda(Encomenda encomenda);

}
