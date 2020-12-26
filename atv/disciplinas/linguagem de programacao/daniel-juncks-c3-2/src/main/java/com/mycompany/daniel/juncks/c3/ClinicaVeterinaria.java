/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.daniel.juncks.c3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author usuario
 */
public class ClinicaVeterinaria {
    private String nome;
    private List<Veterinario> lista;

    public ClinicaVeterinaria(String nome) {
        this.nome = nome;
        lista = new ArrayList<Veterinario>();
    }
    
    public void contrataVeterinario(Veterinario veterinario){
        lista.add(veterinario);
    }
    
    public void exibeClinicos() {
        System.out.println("\nLista dos Veterinários Clínicos:");
        for(Veterinario veterinario : lista) {
            if (veterinario instanceof VeterinarioClinico) {
                System.out.println(veterinario);
            }
        }
    }
    
    public void exibeCirurgioes() {
        System.out.println("\nLista dos Veterinários Cirurgiões:");
        for(Veterinario veterinario : lista) {
            if (veterinario instanceof VeterinarioCirurgiao) {
                System.out.println(veterinario);
            }
        }
    }
   
   public void exibeFolhaDePagamento() {
       Double pagtotal = 0.0;
       System.out.println("\nLista de toda folha salarial:");
        for (Veterinario veterinario : lista) {
            System.out.println("nome=" + veterinario.getNome() + ", salário=" + veterinario.calculaSalario() + '}');
            pagtotal += veterinario.calculaSalario();
        }
        System.out.println("Valor total para pagamentos: " + pagtotal);
   }

    @Override
    public String toString() {
        return "ClinicaVeterinaria{" + "nome=" + nome + ", lista=" + lista + '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Veterinario> getLista() {
        return lista;
    }

    public void setLista(List<Veterinario> lista) {
        this.lista = lista;
    }
    
    
    
}
