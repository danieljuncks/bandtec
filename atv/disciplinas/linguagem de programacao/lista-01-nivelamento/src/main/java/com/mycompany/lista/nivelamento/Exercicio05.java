package com.mycompany.lista.nivelamento;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Exercicio05 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor do seu salário:");
        Double salario = leitor.nextDouble();

        System.out.println("Digite a porcentagem de imposto a ser pago:");
        Double imposto = leitor.nextDouble();
        
        Double salarioLiquido = salario - (salario * (imposto/100));

        System.out.println("Salário líquido: " + salarioLiquido);

    }
}
