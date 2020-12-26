/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio.aluno;

/**
 *
 * @author usuario
 */
public abstract class Aluno {
    private String nome;
    private Integer ra;

    public Aluno(String nome, Integer ra) {
        this.nome = nome;
        this.ra = ra;
    }
    
    public abstract Double calculaMedia();

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", ra=" + ra + ", media=" + calculaMedia() + '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getRa() {
        return ra;
    }

    public void setRa(Integer ra) {
        this.ra = ra;
    }
    
}
