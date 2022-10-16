package com.siscondo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pessoa")
public class Pessoa{	
	
	private long id;
    private String nome;
    private String email;
    private String telefone;
    private String senha;
    
    public Pessoa() {
    	  
    }
 
    public Pessoa(String nome, String email, String telefone, String senha) {
         this.nome = nome;
         this.email = email;
         this.telefone = telefone;
         this.senha = senha;
    } 
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    } 
    
    @Column(name = "nome", nullable = false)
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    } 
    
    @Column(name = "email", nullable = false)
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    } 
    
    @Column(name = "telefone", nullable = false)
    public String getTelefone() {
        return telefone;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    } 
    
    @Column(name = "senha", nullable = false)
    public String getSenha() {
        return senha;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        //return "Pessoa [id=" + id + ", Nome=" + nome + ", E-mail=" + email + ", Telefone=" + telefone + ", Senha=" + senha + "]";
        return "Nome: " + nome + " - E-mail: " + email + " - Telefone: " + telefone;
    }

}
