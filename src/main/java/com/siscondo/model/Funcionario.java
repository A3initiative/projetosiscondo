package com.siscondo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="funcionario")
public class Funcionario {
    
        private long id;
        private int matricula;
        private int codCargo;
        
        public Funcionario() {
            
        }
     
        public Funcionario(int matricula, int codCargo) {
             this.matricula = matricula;
             this.codCargo = codCargo;
        }
        
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public int getMatricula() {
            return matricula;
        }

        public void setMatricula(int matricula) {
            this.matricula = matricula;
        }

        public int getCodCargo() {
            return codCargo;
        }

        public void setCodCargo(int codCargo) {
            this.codCargo = codCargo;
        }

}
