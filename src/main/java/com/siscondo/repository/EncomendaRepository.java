package com.siscondo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.siscondo.model.Encomenda;

@Repository("encomendaRepository")
public interface EncomendaRepository extends JpaRepository<Encomenda, Long>{

}
