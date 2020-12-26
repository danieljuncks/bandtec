/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exemplo.heranca;

/**
 *
 * @author celia.taniwaki
 */
public class Aluno {
    
    // Atributos
    private Integer ra;         // ra do aluno
    protected String nome;      // nome do aluno - este atributo foi declarado como
                                // protected para ser acessado diretamente pela 
                                // classe herdeira
    
    // Construtores
    
    // Construtor vazio
    public Aluno() {
        
    }

    // Construtor que inicializa os atributos
    public Aluno(Integer ra, String nome) {
        this.ra = ra;
        this.nome = nome;
    }
    
    
    // Métodos

    public Integer getRa() {
        return ra;
    }

    public void setRa(Integer ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Aluno{" + "ra=" + ra + ", nome=" + nome + '}';
    }
    
    
    
}
