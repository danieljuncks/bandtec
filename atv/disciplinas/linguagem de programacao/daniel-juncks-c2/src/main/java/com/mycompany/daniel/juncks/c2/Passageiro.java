/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.daniel.juncks.c2;

/**
 *
 * @author usuario
 */
public class Passageiro {
    private String nome;
    private Integer numeroAssento;
    private String classe;

    public Passageiro(String nome, Integer numeroAssento, String classe) {
        this.nome = nome;
        this.numeroAssento = numeroAssento;
        this.classe = classe;
    }

    public String getNome() {
        return nome;
    }

    public Integer getNumeroAssento() {
        return numeroAssento;
    }

    public String getClasse() {
        return classe;
    }

    @Override
    public String toString() {
        return "\nNome do Passageiro: " + nome + "\nNúmero do Assento: " + numeroAssento + "\nClasse: " + classe + "\n-----------------------------------------";
    }
    
    public void exibeDados(){
    System.out.println(toString());
    }
}
