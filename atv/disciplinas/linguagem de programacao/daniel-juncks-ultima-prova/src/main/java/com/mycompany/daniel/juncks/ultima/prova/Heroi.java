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
public class Heroi extends Personagem {

    public Heroi(String codinome, String nome) {
        super(codinome, nome);
    }
    
    @Override
    public Double getForcaTotal(){
        Double podertotal = 0.0;
        for(SuperPoder sp : poderes) {
            podertotal+= sp.categoria;
            } return podertotal * 1.15;
        }
}

