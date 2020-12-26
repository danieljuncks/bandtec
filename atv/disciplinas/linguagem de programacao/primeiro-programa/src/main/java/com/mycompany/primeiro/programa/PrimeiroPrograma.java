// Pacote que que este classe faz parte
package com.mycompany.primeiro.programa;

// Importação da classe Scanner
import java.util.Scanner;

public class PrimeiroPrograma { // Início da classe
    
    // Declaração do método main
    // Atalho para essa intrução: digite psvm e pressione tab.
    public static void main(String[] args) { // Início do método
        
        // Para comentar uma linha utilize "//"
        // O atalho para comentar uma linha é "ctrl+/".
        
        /*
           Outra Maneira de comentar, recomendada para
           longos textos ou comentar em bloco.
        */
        
        // Declaração padrão de variável do tipo String - para armazenar texto.
        String nome, turma;

        // Declarção padrão de variável do tipo Integer - para armazenar números inteiros.
        Integer num1, num2, soma;
        
        /* Declarção padrão de variável do tipo Double - para armazenar 
        números reais (com casas decimais).*/
        Double nota;
        
        /* Variáveis podem ser inicializadas no ato de sua criação ou
        em algum momento diretamente no código.
        No código do programa, devemos digitar com ponto. */
        Double notaContinuada = 7.5;
        
        // Comando para exibir mensagens na tela de saída(console) sem quebra de linha.
        System.out.print("Boa noite!");
        
        // \n é utilizado para quebrar linha.
        System.out.print("Boa noite!\n\n");
        
        // \t faz com que um TAB "seja exibido"
        System.out.println("Tudo \t bem ?");
        
        /* println exibe a mensagem e já posiciona na próxima linha.
        Atalho para esse comando: escreva sout e pressione tab */
        System.out.println("Tudo bem?");
        
        /* Criação do objeto da classe Scanner.
        Utilizamos para fazer leitura do teclado.*/
        Scanner leitor = new Scanner(System.in);
        
        //Solicita o nome do usuário
        System.out.println("Digite o seu nome");
        
        //Leitura do nome digitado e atribuição para variável "nome".
        nome = leitor.nextLine();
        
        // Também posso utilizar o método ".next()", porém ele só irá captar uma única palavra.
        // Exemplo:
        // nome = leitor.nextLine();
        
        // Posso concatenar (unir strings) com o caractere '+'
        System.out.println("Como vai, " + nome + "?");

        //Solicita um número ao usúario.
        System.out.println("Digite um número");
        
        //Leitura do número inteiro digitado e atribuição para variável "num1".
        num1 = leitor.nextInt();
        
        //Solicita outro número ao usúario.
        System.out.println("Digite outro número");
        
        //Leitura do número inteiro digitado e atribuição para variável "num2".
        num2 = leitor.nextInt();
        
        /* Soma dos dois números digitados e o resultado é atribuido para uma 
        variável denominada "soma".*/
        soma = num1 + num2;
        
        // Exibe do resultado da operação.
        System.out.println("A soma é " + soma);
        
        // Caso você não precise reutilizar o valor de uma operação,
        // você pode realizar o cálculo diretamente na saída.
        // Sempre que for fazer dessa forma, envolva o cálculo entre parênteses "()".
        System.out.println("A multiplicação é " + (num1 * num2));
        
        // Solicita um valor para o usúario.
        System.out.println("Digite a sua nota");
        
        // Leitura do número real digitado e atribuição para variável "nota".
        // Se tiver casas decimais, devemos digitar com vírgula no console.
        // No código do programa, devemos digitar com ponto.
        nota = leitor.nextDouble();
        
        // Exibe uma mensagem ao usúario juntamente a nota digitada.
        System.out.println("Sua nota é " + nota);
        
        // Exibe a média das notas sem armazenar o resultado da operação.
        System.out.println("A média é " + (nota + notaContinuada) / 2);
        
        // Solicita a turma do usúario.
        System.out.println("Digite a sua turma");
        
        /* Cuidados com o objeto do tipo Scanner:
        
        Caso você utilize o método nextInt() ou nextDouble() e tente utilizar
        na sequência o nextLine() irá acontecer um erro,
        pois acidentalmente o valor da tecla "enter" é armazenado e impede que
        o usúario e digite conforme solicitado, finalizando o programa ou
        pulando para próxima instrução.*/
        turma = leitor.nextLine();
        
        // Existem duas soluções para esse problema:
        // A primeira é usar o método "next()" porém ele só irá captar uma única palavra.
        // Exemplo:
        // turma = leitor.next();
        
        // Outra solução e a mais recomendada é criar um outro objeto do tipo Scanner
        // somente para leitura de String.
        
        // Exemplo:
        // Scanner leitorString =  new Scanner(System.in);
        // turma = leitorString.nextLine();
        
    }// Fim do método main.

}// Fim da classe.
