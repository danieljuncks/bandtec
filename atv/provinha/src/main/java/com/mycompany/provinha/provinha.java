/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.provinha;

import java.util.Scanner;


 public class provinha {
    public static void main(String[] args) {
        String nome;
        Integer minutos, resultado = 0, contador = 0;
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("Qual o nome do mergulhador?");
        nome = leitor.next();
        
        System.out.println("Quantos minutos passou mergulhando em uma profundidade maior do que 30m?");
        minutos = leitor.nextInt();
        while( minutos > 0 && minutos <= 100) {
                resultado += minutos;
                System.out.println(String.format("\n%s agora tem um total de %d minutos de mergulho em profundidades acima de 30m", nome, resultado));
                System.out.println("Quantos minutos passou mergulhando em uma profundidade maior do que 30m?");
                minutos = leitor.nextInt();
                contador++;
         while (minutos == 0 || minutos > 100) {
            System.out.println("\nQuantidade inválida! Não será considerada!");
            System.out.println("Quantos minutos passou mergulhando em uma profundidade maior do que 30m?");
            minutos = leitor.nextInt();
        }
        if (minutos < 0) {
            System.out.println(String.format("\n%s se aposentou após fazer %d mergulhos acumulando %d minutos", nome, contador, resultado));
        }
}
}
 }
