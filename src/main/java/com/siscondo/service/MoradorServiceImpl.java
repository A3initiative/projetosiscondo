package com.siscondo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siscondo.model.Morador;
import com.siscondo.repository.MoradorRepository;

@Service("moradorService")
public class MoradorServiceImpl implements MoradorService {
    
    @Autowired
    MoradorRepository moradorRepository;

    @Override
    public Optional<Morador> getMoradorById(Long id) {
        return moradorRepository.findById(id);
    }

    @Override
    public List<Morador> getAllMoradores() {
        return moradorRepository.findAll();
    }

    @Override
    public void deleteAllMorador() {
        // TODO Auto-generated method stub        
    }

    @Override
    public void deleteMoradorById(Long id) {
        moradorRepository.deleteById(id);        
    }

    @Override
    public void updateMoradorById(Long id, Morador morador) {
        Optional<Morador> getMorador = getMoradorById(id);
        getMorador.get().setBloco(morador.getBloco());
        getMorador.get().setAndar(morador.getAndar());
        getMorador.get().setUnidade(morador.getUnidade());
        getMorador.get().setMoradorresponsavel(morador.getMoradorresponsavel()); 
        getMorador.get().setIdmorador(morador.getIdmorador());  
        moradorRepository.save(morador);        
    }

    @Override
    public void updateMorador(Morador morador) {
        moradorRepository.save(morador);        
    }

    @Override
    public void insertMorador(Morador morador) {
        moradorRepository.save(morador);        
    }

}
