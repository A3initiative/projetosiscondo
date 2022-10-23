package com.siscondo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.siscondo.model.Morador;

@Repository
public interface MoradorRepository extends JpaRepository<Morador, Long>{

}

