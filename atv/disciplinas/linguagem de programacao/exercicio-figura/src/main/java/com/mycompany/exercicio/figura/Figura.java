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
public abstract class Figura {
    private String cor;
    private Integer espessura;

    public Figura(String cor, Integer espessura) {
        this.cor = cor;
        this.espessura = espessura;
    }
    
    public abstract Double calculaArea();

    @Override
    public String toString() {
        return "Figura{" + "cor=" + cor + ", espessura=" + espessura + ", area=" + calculaArea() + '}';
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getEspessura() {
        return espessura;
    }

    public void setEspessura(Integer espessura) {
        this.espessura = espessura;
    }
    
    
    
}
