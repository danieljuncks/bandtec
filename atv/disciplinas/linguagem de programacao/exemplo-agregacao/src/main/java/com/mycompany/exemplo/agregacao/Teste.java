/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exemplo.agregacao;

/**
 *
 * @author celia.taniwaki
 */
public class Teste {
    
    public static void main(String[] args) {
        
        // Cria 2 objetos da classe Contato
        Contato c1 = new Contato("Maria", "5523-1234",false);
        Contato c2 = new Contato("José", "5534-9876", false);
        
        // Exibe os objetos c1 e c2
        // Aqui ocorre a chamada implícita ao método toString() de cada objeto
        // Como implementamos o método toString() lá na classe Contato
        // serão exibidos os valores dos atributos de cada objeto
        System.out.println(c1);
        System.out.println(c2);
        
        // Cria um objeto da classe Grupo chamado zoeira
        Grupo zoeira = new Grupo("Zoeira");
       
        // Adiciona os objetos c1 e c2 ao objeto zoeira
        zoeira.adiciona(c1);
        zoeira.adiciona(c2);
        
        // Exibe a lista de contatos do grupo zoeira
        System.out.println(zoeira.getLista());

        // Bloqueia o contato c1
        c1.bloquear();

        // Exibe novamente a lista de contatos do grupo zoeira
        System.out.println(zoeira.getLista());
      
    }
    
}
