package com.siscondo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="morador")
public class Morador {
    
    private long id;
    private String bloco;
    private String andar;
    private String unidade;
    private int moradorresponsavel;
    private int idmorador;
    
    public Morador() {
        
    }
 
    public Morador(String bloco, String andar, String unidade, int moradorresponsavel, int idmorador) {
         this.bloco = bloco;
         this.andar = andar;
         this.unidade = unidade;
         this.moradorresponsavel = moradorresponsavel;
         this.idmorador = idmorador;
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    @Column(name = "bloco", nullable = false)
    public String getBloco() {
        return bloco;
    }

    public void setBloco(String bloco) {
        this.bloco = bloco;
    }
    
    @Column(name = "andar", nullable = false)
    public String getAndar() {
        return andar;
    }

    public void setAndar(String andar) {
        this.andar = andar;
    }
    
    @Column(name = "unidade", nullable = false)
    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }
    
    @Column(name = "moradorresponsavel", nullable = true)
    public int getMoradorresponsavel() {
        return moradorresponsavel;
    }

    public void setMoradorresponsavel(int moradorresponsavel) {
        this.moradorresponsavel = moradorresponsavel;
    }
    
    @Column(name = "idmorador", nullable = true)
    public int getIdmorador() {
        return idmorador;
    }

    public void setIdmorador(int idmorador) {
        this.idmorador = idmorador;
    }

}
