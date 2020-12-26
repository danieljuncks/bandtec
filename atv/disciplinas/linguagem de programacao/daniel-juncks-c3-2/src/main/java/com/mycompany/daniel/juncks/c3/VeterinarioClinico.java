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
public class VeterinarioClinico extends Veterinario{
    private Integer consultas;
    private Double valorConsulta;

    public VeterinarioClinico( Integer codigo, String nome, Integer consultas, Double valorConsulta) {
        super(codigo, nome);
        this.consultas = consultas;
        this.valorConsulta = valorConsulta;
    }
    
    @Override
    public Double calculaSalario(){
        return consultas * valorConsulta;
    }

    @Override
    public String toString() {
        return "VeterinarioClinico{" + super.toString() + ", consultas=" + consultas + ", valorConsulta=" + valorConsulta + '}';
    }

    public Integer getConsultas() {
        return consultas;
    }

    public void setConsultas(Integer consultas) {
        this.consultas = consultas;
    }

    public Double getValorConsulta() {
        return valorConsulta;
    }

    public void setValorConsulta(Double valorConsulta) {
        this.valorConsulta = valorConsulta;
    }
    
    
    
    
}
