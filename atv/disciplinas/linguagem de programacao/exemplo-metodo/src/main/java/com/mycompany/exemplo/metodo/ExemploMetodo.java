/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exemplo.metodo;

/**
 *
 * @author celia.taniwaki
 */
public class ExemploMetodo {
    
    /* Método exibeAsterisco - exibe uma linha de asterisco */
    public static void exibeAsterisco() {
        System.out.println("******************************************");
    }

    /* Método exibeQuadro - recebe uma frase como argumento
       e exibe um quadro de asteriscos com a frase no meio do quadro
    */
    public static void exibeQuadro(String frase) {
        exibeAsterisco(); 
        System.out.println("***             " + frase + "              ***");
        exibeAsterisco();
    }
   
    /* Método exibeQuadro - recebe 2 frases e exibe um quadro de astericos
       com as 2 frases no meio do quadro
    */
    public static void exibeQuadro(String frase1, String frase2) {
        exibeAsterisco(); 
        System.out.println("***             " + frase1 + "              ***");
        System.out.println("***             " + frase2 + "              ***");
        exibeAsterisco();
    }
    
    /* Método soma - recebe 2 números inteiros e retorna a soma desses 2 números */
    public static Integer soma(Integer a, Integer b) {
        Integer resultado;
        resultado = a + b;
        return resultado;
    } 
    
    /* Método main */
    public static void main(String[] args) {
        /* Exibe "Boa noite" e o nome passado como argumento para o main
           que pode ser configurado em Propriedades > run > arguments
        */
        System.out.println("Boa noite, " + args[0] + "!");
        
        /* chamada do método exibeAsterisco */
        exibeAsterisco();

        System.out.println();
        
        /* chama o método exibeQuadro com a mensagem "Boa noite!" */
        exibeQuadro("Boa noite!");
        System.out.println("");
        
        /* chama o método exibeQuadro que recebe 2 frases */
        exibeQuadro("2ADSA  ", "Tudo bem?");
        
        soma(3,2);  /* forma errada de chamar um método não void */
        
        /* uma das formas corretas de chamar um método não void é assim */
        System.out.println("A soma de 3 e 2 é " + soma(3, 2));
        
        Integer num1 = 10;
        Integer num2 = 20;
        Integer resultado;
        
        /* outra forma de chamar um método não void é assim */
        resultado = soma(num1, num2);
        System.out.println("A soma de " + num1 + " e " + num2 + " é: " +
                            resultado);
        
    }
    
}
