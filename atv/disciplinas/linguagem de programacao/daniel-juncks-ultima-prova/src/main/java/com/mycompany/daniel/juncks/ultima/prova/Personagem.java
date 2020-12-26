/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.daniel.juncks.ultima.prova;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author usuario
 */
public abstract class Personagem {
    protected String codinome;
    protected String nome;
    protected List<SuperPoder> poderes;

    public Personagem(String codinome, String nome) {
        this.codinome = codinome;
        this.nome = nome;
        poderes = new ArrayList<SuperPoder>();
    }

    public List<SuperPoder> getPoderes() {
        return poderes;
    }
    
    public void adicionaPoder(String nomePoder, Integer categoria){
        poderes.add(new SuperPoder(nomePoder, categoria));
    }
    public abstract Double getForcaTotal();

    public String getCodinome() {
        return codinome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Personagem" + "\ncodinome=" + codinome + "\nnome=" + nome + "\nForça total=" + getForcaTotal() +"\n";
    }
    
    
    
}
