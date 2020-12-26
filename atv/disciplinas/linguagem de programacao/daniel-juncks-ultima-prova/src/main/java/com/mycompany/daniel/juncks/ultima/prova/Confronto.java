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
public class Confronto {
    public static void lutar(Heroi heroi, Vilao vilao) {
    if(heroi.getForcaTotal() > vilao.getForcaTotal()) {
        System.out.println("O " + heroi.nome + " venceu a batalha! Fomos salvos!\n\n");
    } else {
        System.out.println("O " + vilao.nome + " venceu a batalha! Infelimente...\n\n");
    }
    if (heroi.getForcaTotal() == vilao.getForcaTotal()) {
        System.out.println("Sem vencedores na batalha do " + heroi.nome + " e " + vilao.nome + "\n\n");
    }
    }
}
