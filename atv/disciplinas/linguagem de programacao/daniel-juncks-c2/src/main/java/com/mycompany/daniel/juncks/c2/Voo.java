/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.daniel.juncks.c2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author usuario
 */
public class Voo {
    private String destino;
    private Integer assentosDisponiveis;
    private List<Passageiro> listaDePassageiros;

    public String getDestino() {
        return destino;
    }

    public Integer getAssentosDisponiveis() {
        return assentosDisponiveis;
    }

    public Voo(String destino, Integer assentosDisponiveis) {
        this.destino = destino;
        this.assentosDisponiveis = assentosDisponiveis;
        listaDePassageiros = new ArrayList<Passageiro>();
    }
    
    @Override
    public String toString() {
        return "Voo{" + "destino=" + destino + ", assentosDisponiveis=" + assentosDisponiveis + ", listaDePassageiros=" + listaDePassageiros + '}';
    }
    
    
   public void cadastrarPassageiro(Passageiro passageiro){
        if (this.assentosDisponiveis > 0) {
            listaDePassageiros.add(passageiro);
    } else {
            System.out.println("Cadastro do Passageiro:\n" + "O voo com destino " + destino + " não possuí assentos disponíveis" + "\n-----------------------------------------");
        }
    }
   public void exibeDadosVoo() {
         if (listaDePassageiros.size() > 0) {
             for (Object nome :listaDePassageiros) {
            System.out.println(nome);
    } 
         } else {
            System.out.println("Dados do Voo:\n" + "\nO voo com destino " + destino + " não possuí passageiros cadastrados" + "\n-----------------------------------------");
        }
   }
      
   public void exibeAssentosDisponiveis() {
       System.out.println("Assentos Disponiveis:\n" + "\nO voo com destino " + destino + " possuí " + assentosDisponiveis + " disponíveis." + "\n-----------------------------------------");
   }
}
