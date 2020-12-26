package com.mycompany.lista.nivelamento;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Sorteio {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Random gerador = new Random();

        System.out.println("Digite um número (entre 1 à 100):");
        Integer numeroDigitado = leitor.nextInt();
        Integer numeroGerado;
        Integer rodada = 0, pares = 0, impares = 0;
        Boolean encontrou = false;

        for (Integer i = 1; i <= 200; i++) {
            numeroGerado = gerador.nextInt(100) + 1;

            if (i % 2 == 0) {
                pares++;
            } else {
                impares++;
            }

            if (numeroGerado.equals(numeroDigitado)) {
                rodada = i;
                encontrou = true;
                break;
            }

        }

        System.out.println(String.format("O número foi encontrado? %s \npares: %d \nimpares: %d \n"
                + "rodada: %d", encontrou, pares, impares, rodada));

    }
}
