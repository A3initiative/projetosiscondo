package com.siscondo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="encomenda")
public class Encomenda {
    
    private long id;
    private String bloco;
    private String andar;
    private String unidade;
    private String nomeMorador;
    private int volumeGrande;
    private String nomeImagemEtiqueta;
    private byte[] imagemEtiqueta;
    private int estado = 1;

    public Encomenda() {
          
    }
 
    public Encomenda(String bloco, String andar, String unidade, String nomeMorador, int volumeGrande, String nomeImagemEtiqueta, byte[] imagemEtiqueta, int estado) {
         this.bloco = bloco;
         this.andar = andar;
         this.unidade = unidade;
         this.nomeMorador = nomeMorador;
         this.volumeGrande = volumeGrande;
         this.nomeImagemEtiqueta = nomeImagemEtiqueta;
         this.imagemEtiqueta = imagemEtiqueta;
         this.estado = estado;
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
    
    @Column(name = "nome_morador", nullable = false)
    public String getNomeMorador() {
        return nomeMorador;
    }

    public void setNomeMorador(String nomeMorador) {
        this.nomeMorador = nomeMorador;
    }
    
    @Column(name = "volume_grande", nullable = false)
    public int getVolumeGrande() {
        return volumeGrande;
    }

    public void setVolumeGrande(int volumeGrande) {
        this.volumeGrande = volumeGrande;
    }  
    
    @Column(name = "nome_imagem_etiqueta", nullable = true)
    public String getNomeImagemEtiqueta() {
        return nomeImagemEtiqueta;
    }

    public void setNomeImagemEtiqueta(String nomeImagemEtiqueta) {
        this.nomeImagemEtiqueta = nomeImagemEtiqueta;
    } 
    
    @Lob
    @Column(name="imagem_etiqueta", nullable = true)
    private byte[] image;
    public byte[] getImagemEtiqueta() {
        return imagemEtiqueta;
    }

    public void setImagemEtiqueta(byte[] imagemEtiqueta) {
        this.imagemEtiqueta = imagemEtiqueta;
    }      

    @Column(name = "estado", nullable = true)
    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    @Override
    public String toString() {
        
        return "Estado: " + estado;
    }

}
