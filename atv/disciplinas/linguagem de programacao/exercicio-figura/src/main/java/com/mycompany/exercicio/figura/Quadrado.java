/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio.figura;

/**
 *
 * @author usuario
 */
public class Quadrado extends Figura{

    private Double lado;

    public Quadrado(String cor, Integer espessura, Double lado) {
        super(cor, espessura);
        this.lado = lado;
    }
    
    
    
    public Double calculaArea() {
        return this.lado * this.lado;
    }

    @Override
    public String toString() {
        return "Quadrado{" + super.toString() + "lado=" + lado + ", area=" + calculaArea() + '}';
    }

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }
    
    
    
}
