/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exemplo.lista;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author celia.taniwaki
 */
public class ExemploListaString {
    
    public static void main(String[] args) {
        // Cria uma lista de String (essa lista não aceitará elementos de outros tipos)
        List<String> lista = new ArrayList<String>();
        
        // Adiciona elementos à lista
        lista.add("Boa noite");
        lista.add("oi");
        lista.add("Tudo bem?");
        lista.add("Tchau");
        
        // Exibe o conteúdo da lista
        System.out.println(lista);
        
        // Percorrendo a lista usando um for tradicional
        System.out.println("\nExibindo a lista com o for tradicional");
        for (int i=0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        
        // Percorrendo a lista usando o for enhanced ou for aprimorado
        System.out.println("\nExibindo a lista com o for enhanced");
        for (String s : lista) {
            System.out.println(s);
        }
        
        System.out.println("Removendo todos da lista, um de cada vez");
        while (!lista.isEmpty()) {    // enquanto a lista não está vazia
            lista.remove(0);                // remove o primeiro elemento
            System.out.println(lista);      // e exibe a lista
        }
    }
    
}
