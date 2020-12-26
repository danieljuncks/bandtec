package com.mycompany.lista.nivelamento;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Exercicio02 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = leitor.nextLine();

        System.out.println("Olá " + nome + ", qual o ano de seu nascimento?");
        Integer ano = leitor.nextInt();

        System.out.println("Em 2030 você terá: " + (2030 - ano) + " anos.");
    }
}
