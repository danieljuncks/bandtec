package com.mycompany.lista.nivelamento;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Exercicio01 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número:");
        Double num1 = leitor.nextDouble();

        System.out.println("Digite outro número:");
        Double num2 = leitor.nextDouble();

        System.out.println("Resultado da soma: " + (num1 + num2));
        System.out.println("Resultado da subtração: " + (num1 - num2));
        System.out.println("Resultado da multiplicação: " + (num1 * num2));
        System.out.println("Resultado da divisão: " + (num1 / num2));

    }
}
