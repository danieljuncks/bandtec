/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.daniel.juncks.c3;

/**
 *
 * @author usuario
 */
public class VeterinarioCirurgiao extends Veterinario{
    private Integer cirurgias;
    private Double valorCirurgia;

    public VeterinarioCirurgiao(Integer codigo, String nome, Integer cirurgias, Double valorCirurgia) {
        super(codigo, nome);
        this.cirurgias = cirurgias;
        this.valorCirurgia = valorCirurgia;
    }
    
    @Override
    public Double calculaSalario(){
        return cirurgias * valorCirurgia;
    }

    @Override
    public String toString() {
        return "VeterinarioCirurgiao{" + super.toString() + ", cirurgias=" + cirurgias + ", valorCirurgia=" + valorCirurgia + '}';
    }

    public Integer getCirurgias() {
        return cirurgias;
    }

    public void setCirurgias(Integer cirurgias) {
        this.cirurgias = cirurgias;
    }

    public Double getValorCirurgia() {
        return valorCirurgia;
    }

    public void setValorCirurgia(Double valorCirurgia) {
        this.valorCirurgia = valorCirurgia;
    }
        
}
