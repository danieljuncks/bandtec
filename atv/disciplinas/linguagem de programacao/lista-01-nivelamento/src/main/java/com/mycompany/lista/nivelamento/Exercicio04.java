package com.mycompany.lista.nivelamento;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Exercicio04 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor unitário do produto:");
        Double valorProduto = leitor.nextDouble();

        System.out.println("Digite a quantidade vendida:");
        Integer quantidade = leitor.nextInt();

        System.out.println("Qual o valor pago pelo cliente?");
        Double valorPago = leitor.nextDouble();

        System.out.println("O troco será de: " + (valorPago - (valorProduto * quantidade)) + " reais.");
    }
}
