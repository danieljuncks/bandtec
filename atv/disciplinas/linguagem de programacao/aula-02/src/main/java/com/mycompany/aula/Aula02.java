/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author celia.taniwaki
 */
public class Aula02 {

    public static void main(String[] args) {

        // Declarações de variáveis do tipo Integer.
        Integer idade, numero, valorDado, chute, diaSemana, lugar;

        // Declaração de variável do tipo String.
        String nomeFacul;

        // Criando objeto do tipo Random.
        // Usado para gerar números aleatórios.
        Random aleatorio = new Random();

        // Criação do objeto do tipo Scanner.
        Scanner leitor = new Scanner(System.in);

        // Criação de outro objeto Scanner para leitura com nextLine()
        // para evitar erros.
        Scanner leitorS = new Scanner(System.in);

        // Exibindo mensagem ao usuário.
        System.out.println("Digite a sua idade");
        // Atribuindo valor digitado para variável idade.
        idade = leitor.nextInt();

        // Exemplo de if sem else
        if (idade >= 18) {
            System.out.println("Já pode tirar carteira de habilitação");
        }

        // Exibindo mensagem ao usuário
        System.out.println("Digite um número inteiro");
        // Atribuindo valor digitado para variável numero.
        numero = leitor.nextInt();

        // Exemplo de if com else
        if (numero % 2 == 0) {
            System.out.println(numero + " é par");
        } else {
            System.out.println(numero + " é ímpar");
        }

        // Exibindo mensagem ao usuário
        System.out.println("Digite o nome da sua faculdade");
        // Atribuindo valor digitado para variável nomeFacul.
        nomeFacul = leitorS.nextLine();

        // Para comparar Strings utilize sempre ".equals()".
        // Comparação de String
        if (nomeFacul.equals("Bandtec Digital School")) {
            System.out.println("Parabéns! Ótima escolha!!!");
        }

        /*
            Vamos simular que estamos jogando um dado.
            O método ".nextInt()" do objeto Random gera um número inteiro aleatório.
            Para definir um limite, passe como argumento o valor máximo que deseja,
            neste caso 6(número máximo que um dado pode sortear).
        
            Importante ressaltar que ao gerar o número randômico, ele considera
            o número 0, nesse caso como colocamos 6 como limite ele irá gerar números
            de 0 a 5, por isso acrescentamos + 1 (evitar que caia 0 e que seja possível cair 6).
        
            abaixo exemplo de uso:
         */
        valorDado = aleatorio.nextInt(6) + 1;

        // Exibindo mensagem ao usuário.
        System.out.println("Tente acertar o valor do dado");
        // Atribuindo valor digitado para variável chute.
        chute = leitor.nextInt();

        // Validando se o usuário acertou o número sorteado.
        if (valorDado.equals(chute)) {
            System.out.println("Parabéns! Você acertou!");
        } else {
            System.out.println("Não foi dessa vez!");
        }

        //Exibindo mensagem ao usuário.
        System.out.println("O valor do dado é " + valorDado);

        // Vamos pedir para o usuário digitar o dia da semana
        // e o programa exibirá Domingo, ou Segunda-feira, etc, de
        // acordo com o diaSemana digitado
        // Exibe mensagem ao usuário.
        System.out.println("\nDigite um número de 1 a 7");
        // Atribuição do valor digitado para variável diaSemana.
        diaSemana = leitor.nextInt();

        // Validação sem usar switch case
//        if (diaSemana.equals(1)) {
//            System.out.println("Domingo");
//        }
//        else if (diaSemana.equals(2)) {
//            System.out.println("Segunda-feira");
//        }
//        else if (diaSemana.equals(3)) {
//            System.out.println("Terça-feira");
//        }
        // switch case é um modo de realizar validações mais recomendado e elegante,
        // seu uso é indicado na maioria das vezes.
        // Pode ser usado para comparar números inteiros(Integer) e textos(String).
        // Exemplo de Uso do switch case
        switch (diaSemana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Número inválido");
                break;
        }
        
        // O switch case pode ser usado com String.
        // Supondo que diaSemana fosse do tipo String,
        // exemplo:
//        switch (diaSemana) {
//            case "Domingo":
//                System.out.println(1);
//                break;
//            case "segunda-feira":
//                System.out.println(2);
//                break;
//            case "terça-feira":
//                System.out.println(3);
//                break;
//            case "quarta-feira":
//                System.out.println(4);
//                break;
//            case "quinta-feira":
//                System.out.println(5);
//                break;
//            case "sexta-feira":
//                System.out.println(6);
//                break;
//            case "sábado":
//                System.out.println(7);
//                break;
//            default:
//                System.out.println("Número inválido");
//                break;
//        }

        // Exemplo de swich case em que é útil não colocar o break após
        // alguns cases.
        // Exibindo mensagem na tela.
        System.out.println("Digite a posição :"
                + "\n1o lugar: Iphone, Ipad e Ipod"
                + "\n2o lugar: Ipad e Ipod"
                + "\n3o lugar: Ipod");
        // Atribuindo valor digitado para variável lugar.
        lugar = leitor.nextInt();

        // Exibindo mensagem ao usuário.
        System.out.print("Você ganhou");

        // Validando quais prêmios o usuário ganhou usando switch case.
        switch (lugar) {
            case 1:
                System.out.print(" um IPhone,");
            case 2:
                System.out.print(" um Ipad e");
            case 3:
                System.out.println(" um Ipod.");
                break;
            default:
                System.out.println(" nada.");
                break;
        }

    }
}
