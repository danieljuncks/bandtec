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
public class Retangulo extends Figura{
    private Double base;
    private Double altura;

    public Retangulo(String cor, Integer espessura, Double base, Double altura) {
        super(cor, espessura);
        this.base = base;
        this.altura = altura;
    }

    
    
    public Double calculaArea() {
        return base * altura;
    }

    @Override
    public String toString() {
        return "Retangulo{" + super.toString() + "base=" + base + ", altura=" + altura + ", area=" + calculaArea() + '}';
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
    
    
    
}
