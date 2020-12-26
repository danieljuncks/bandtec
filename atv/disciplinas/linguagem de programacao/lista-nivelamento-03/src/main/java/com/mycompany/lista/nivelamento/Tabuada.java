package com.mycompany.lista.nivelamento;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Tabuada {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número:");
        Integer numero = leitor.nextInt();

        for (Integer i = 0; i <= 10; i++) {
            System.out.println(String.format("%d X %d = %d", numero, i, numero * i));
        }

    }
}
