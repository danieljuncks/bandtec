
package com.mycompany.projeto.conta.corrente;

import java.util.Random;
import java.util.Scanner;

public class ProgramaContaCorrente {
    
    public static void main(String[] args) {
        
        //Objeto do tipo Scanner
        Scanner leitor = new Scanner(System.in);
        
        // outro exemplo de objeto do tipo Random
        Random gerar = new Random();
        
        ContaCorrente conta01 = new ContaCorrente();
        
        ContaCorrente conta02 = new ContaCorrente();
        
        System.out.println("Configurando conta do Diego...");
        conta01.setUsuario("Diego");
        
        System.out.println("Configurando conta do Rubens...");
        conta02.setUsuario("Rubens");
        
        
        System.out.println("Depositando 50 pilas");
        conta01.depositar50();
        conta01.depositar50();
        
        conta02.depositar50();
        conta02.depositar50();
        conta02.depositar50();
        conta02.depositar50();
        
        conta01.sacar50();
        conta01.sacar50();
        conta01.sacar50();
        
        conta01.imprimirExtrato();
        conta02.imprimirExtrato();
        
        
        
    }
    
}
