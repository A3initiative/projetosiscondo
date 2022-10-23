package com.siscondo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siscondo.model.Encomenda;
import com.siscondo.repository.EncomendaRepository;

@Service("encomendaService")
public class EncomendaServiceImpl implements EncomendaService {
    
    @Autowired
    EncomendaRepository encomendaRepository;

    @Override
    public Optional<Encomenda> getEncomendaById(Long id) {
        return encomendaRepository.findById(id);
    }

    @Override
    public List<Encomenda> getAllEncomendas() {
        return encomendaRepository.findAll();
    }

    @Override
    public void deleteAllEncomenda() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteEncomendaById(Long id) {
        encomendaRepository.deleteById(id); 
        
    }

    @Override
    public void updateEncomendaById(Long id, Encomenda Encomenda) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void updateEncomenda(Encomenda encomenda) {
        encomendaRepository.save(encomenda); 
        
    }

    @Override
    public void insertEncomenda(Encomenda encomenda) {
        encomendaRepository.save(encomenda);          
    }

}
