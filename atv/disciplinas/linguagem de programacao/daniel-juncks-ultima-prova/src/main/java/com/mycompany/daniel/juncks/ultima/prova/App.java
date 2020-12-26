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
public class App {
    public static void main(String[] args) {
        Heroi heroi1 = new Heroi("Et","Lionel Messi");
        Heroi heroi2 = new Heroi("Robozao","Cristiano Ronaldo");
        Heroi heroi3 = new Heroi("Cone","Fred");
        
        Vilao vilao1 = new Vilao("Chorao", "Thiago Silva");
        Vilao vilao2 = new Vilao("Avenida Alba", "Jordi Alba");
        Vilao vilao3 = new Vilao("Monstro", "Neuer");
        
        heroi1.adicionaPoder("Chutar", 10);
        heroi1.adicionaPoder("Cruzar", 8);
        vilao1.adicionaPoder("Chorar", 4);
        
        heroi2.adicionaPoder("Cabecear", 10);
        vilao2.adicionaPoder("Carrinho",7);
        
        heroi3.adicionaPoder("Estatua", 2);
        vilao3.adicionaPoder("7 a 1", 5);
        
        System.out.println(heroi1);
        System.out.println(vilao1);
        Confronto.lutar(heroi1, vilao1);
        
        System.out.println(heroi2);
        System.out.println(vilao2);
        Confronto.lutar(heroi2, vilao2);
        
        System.out.println(heroi3);
        System.out.println(vilao3);
        Confronto.lutar(heroi3, vilao3);
        
}

}