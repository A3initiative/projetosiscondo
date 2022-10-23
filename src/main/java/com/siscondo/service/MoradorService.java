package com.siscondo.service;

import java.util.Optional;

import java.util.List;

import com.siscondo.model.Morador;

public interface MoradorService {    
    Optional<Morador> getMoradorById(Long id);
    List<Morador> getAllMoradores();
    void deleteAllMorador();
    void deleteMoradorById(Long id);
    void updateMoradorById(Long id, Morador morador);
    void updateMorador(Morador morador);
    void insertMorador(Morador morador);

}
