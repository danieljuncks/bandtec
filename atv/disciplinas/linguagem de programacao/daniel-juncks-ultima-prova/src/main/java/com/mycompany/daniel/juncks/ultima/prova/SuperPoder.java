/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.daniel.juncks.ultima.prova;

/**
 *
 * @author usuario
 */
public class SuperPoder {
    protected String nomePoder;
    protected Integer categoria;

    public SuperPoder(String nomePoder, Integer categoria) {
        this.nomePoder = nomePoder;
        this.categoria = categoria;
    }
    
    public String getNomePoder() {
        return nomePoder;
    }

    public Integer getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return "SuperPoder{" + "nome=" + nomePoder + ", categoria=" + categoria + '}';
    }
    
    
}
