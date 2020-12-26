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
public class ExemploLista {
    
    public static void main(String[] args) {
        // Lista é um conceito semelhante a Vetor
        // Mas é um conceito dinâmico, enqto o Vetor é um conceito estático
        
        // List é o nome de uma interface do Java
        // ArrayList é uma classe que implementa a interface List
        // Existem outras classes do Java que tb implementam a interface List

        // A interface nunca pode ser instanciada
        // Após o new eu devo colocar o nome de uma classe que implementa a 
        // interface List, no caso a classe ArrayList
        List listaLoka = new ArrayList<>();
        
        // Adiciona elementos a essa listaLoka
        // Como definimos a listaLoka sem especificar o tipo do elemento
        // Então a listaLoka aceita qq tipo de elemento
        listaLoka.add(50000);
        listaLoka.add("Boa noite");
        listaLoka.add(90.50);
        listaLoka.add(false);
        
        // Exibe o conteúdo dad lista
        System.out.println("listaLoka: " + listaLoka);
        
        // Exibe o tamanho da lista
        System.out.println("O tamanho da listaLoka é: " + listaLoka.size());
        
        // Exibe o índice do elemento 90.5
        System.out.println("Índice de 90.5: " + listaLoka.indexOf(90.5));
        
        // Exibe o elemento do índice 3 e o elemento do índice zero
        System.out.println("Elemento do índice 3: " + listaLoka.get(3));
        System.out.println("Elemento do índice 0: " + listaLoka.get(0));
        
        // Exibe se a lista está vazia ou não
        System.out.println("listaLoka está vazia? " + listaLoka.isEmpty());
        
        // Remove o elemento "Boa noite", exibe o tamanho da lista e a lista
        System.out.println("Removendo o elemento Boa noite");
        listaLoka.remove("Boa noite");
        System.out.println("O tamanho da listaLoka é: " + listaLoka.size());
        System.out.println("listaLoka: " + listaLoka);        
        
        // Remove o elemento do índice 1, exibe o tamanho da lista e a lista
        System.out.println("Removendo o elemento que está no índice 1");
        listaLoka.remove(1);
        System.out.println("O tamanho da listaLoka é: " + listaLoka.size());
        System.out.println("listaLoka: " + listaLoka);

        // Adiciona o elemento 1
        listaLoka.add(1);
        System.out.println("listaLoka: " + listaLoka);
        
        // Remove o elemento que está no índice 1
        System.out.println("Removendo o elemento que está no índice 1");
        listaLoka.remove(1);
        System.out.println("O tamanho da listaLoka é: " + listaLoka.size());
        System.out.println("listaLoka: " + listaLoka);
        
        // Adiciona mais 3 elementos
        listaLoka.add("oi");
        listaLoka.add("teste");
        listaLoka.add("oi");
        System.out.println("listaLoka: " + listaLoka);

        // Remove o elemento "oi" (tem 2 "oi", mas esse método remove apenas a 1a ocorrência
        System.out.println("Removendo o elemento oi");
        listaLoka.remove("oi");
        System.out.println("O tamanho da listaLoka é: " + listaLoka.size());
        System.out.println("listaLoka: " + listaLoka);

        // uso do método contains - retorna true ou false se contém ou não um determinado elemento
        System.out.println("Lista contém oi? " + listaLoka.contains("oi"));

        // Usando o for enhanced para exibir os elementos da listaLoka
        for (Object o : listaLoka) {
            System.out.println(o);
        }
        
        // uso do método clear() para limpar a lista
        listaLoka.clear();
        System.out.println("listaLoka está vazia? " + listaLoka.isEmpty());
    }
    
}
