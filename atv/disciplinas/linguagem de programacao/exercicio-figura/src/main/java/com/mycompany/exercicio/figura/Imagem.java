/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio.figura;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author usuario
 */
public class Imagem {
     private List<Figura> lista;

    public Imagem() {
        lista = new ArrayList<Figura>();
    }
     
     public void adicionaFigura(Figura f){
        lista.add(f);
    }
     
    public void exibeFiguras() {
        System.out.println("\nLista de todas as figuras:");
        for (Figura f : lista) {
            System.out.println(f);
        }
    }
    
    public void exibeSomaArea() {
          Double total = 0.0;
        for (Figura f : lista) {
            total += f.calculaArea();
        }
        System.out.println("\nTotal da Área: " + total);
    }
    
    public void exibeFiguraAreaMaior20() {
         System.out.println("\nLista de areas maiores que 20:");
         Double area = 0.0;
        for (Figura f : lista) {
            area = f.calculaArea();
            if (area>20) {
                System.out.println(f);
            }
    }
    }
    
    public void exibeQuadrado(){
         System.out.println("\nLista dos quadrados:");
        for (Figura f : lista) {
            if (f instanceof Quadrado) {
                System.out.println(f);
            }
        }
    }
}
