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
public class Circulo extends Figura{
    private Double raio;

    public Circulo(String cor, Integer espessura, Double raio) {
        super(cor, espessura);
        this.raio = raio;
    }

   
    
    public Double calculaArea() {
        return 3.14159265359 * raio * raio;
    }

    @Override
    public String toString() {
        return "Circulo{" + super.toString() + "raio=" + raio + ", area=" + calculaArea() + '}';
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }
    
    
    
}
