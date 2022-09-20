/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author taniabasso
 */
@Entity
@Table (name = "ProfHib")
public class Professor {
    
    @Id
    @Column
    private int matricula;
    
    @Column
    private String nome;
    
    @OneToMany
    @JoinColumn (name="ProfResponsavel")
    private List<Disciplina> listaDisc;

    public Professor(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Disciplina> getListaDisc() {
        return listaDisc;
    }

    public void setListaDisc(List<Disciplina> listaDisc) {
        this.listaDisc = listaDisc;
    }
    
    
    
}
