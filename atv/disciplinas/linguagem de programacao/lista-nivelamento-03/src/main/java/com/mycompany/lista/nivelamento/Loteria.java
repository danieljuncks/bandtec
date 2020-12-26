package com.mycompany.lista.nivelamento;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Loteria {

    public static void main(String[] args) {

        Random gerar = new Random();
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número (0 a 10):");
        Integer numero = leitor.nextInt();
        Integer aleatorio;
        Integer contador = 0;

        do {
            aleatorio = gerar.nextInt(11);
            System.out.println(String.format("Número sorteado: %d", aleatorio));
            contador++;
        } while (!numero.equals(aleatorio));

        System.out.println(String.format("A máquina acertou o número %d, foram %d tentativas.\n", numero, contador));
        
        if (contador <= 3) {
            System.out.println("Você é muito sortudo");
        } else if (contador > 3 && contador < 11) {
            System.out.println("Você é sortudo");
        } else {
            System.out.println("É melhor ser trabalhador!");
        }
    }
}
