package com.mycompany.lista.nivelamento;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Exercicio03 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o limite de peso do elevador:");
        Double limitePeso = leitor.nextDouble();

        System.out.println("Digite o limite de pessoas do elevador:");
        Integer limitePessoas = leitor.nextInt();

        System.out.println("Digite o peso da primeira pessoa:");
        Double pesoTotal = leitor.nextDouble();

        System.out.println("Digite o peso da segunda pessoa:");
        pesoTotal += leitor.nextDouble();

        System.out.println("Digite o peso da terceira pessoa:");
        pesoTotal += leitor.nextDouble();

        System.out.println("Entraram 3 pessoas no elevador, no qual cabem " + limitePessoas + " pessoas.");
        System.out.println("O peso total no elevador é de " + pesoTotal + ", sendo que ele suporta " + limitePeso + ".");

    }
}
