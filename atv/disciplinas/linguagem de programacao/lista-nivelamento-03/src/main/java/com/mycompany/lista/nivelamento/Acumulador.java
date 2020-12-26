package com.mycompany.lista.nivelamento;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Acumulador {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Integer valorDigitado, total = 0;

        do {

            System.out.println("Digite um número:");

            valorDigitado = leitor.nextInt();

            total += valorDigitado;

        } while (!(valorDigitado.equals(0)));

        System.out.println(String.format("Total acumulado: %d", total));
    }
}
