
package com.mycompany.exemplo.estrutura.repeticao;

import java.util.Scanner;

/**
 *
 * @author celia.taniwaki
 */
public class ExemploEstruturaRepeticao {
    
    public static void main(String[] args) {
        
        //Criação do objeto Scanner
        Scanner leitor = new Scanner(System.in);
        //Criação de variáveis do tipo Integer
        Integer numero, soma;
        
        // Exemplo de while
        // Aqui, se cont for inicializado com o valor 7, o loop não é executado
        // nenhuma vez
        Integer cont = 1;
        while (cont <= 6) {
            System.out.println("Boa noite! cont=" + cont);
            cont++;
        }
        // Exibe valor de cont, após sair do loop
        System.out.println("cont=" + cont);
        
        // Exemplo de for
        for (Integer i = 1; i <= 6 ; i++) {
            System.out.println("i=" + i);
        }
        
        // Exemplo de do-while
        // Diferença entre do-while e while: 
        // o while compara antes, então se a condição for falsa,
        // ele não executa o loop
        // o do-while compara somente depois, então mesmo que a condição 
        // seja falsa logo de cara, ele executa o loop pelo menos uma vez
        // No exemplo abaixo, se cont for inicializado com -1, o loop
        // será executado uma vez
        
        cont= 5;
        do {
            System.out.println("cont=" + cont);
            cont--;
        } while (cont >= 0);
        
        
        // Exemplo de validação usando do-while
        do {
            System.out.println("Digite um número positivo");
            numero = leitor.nextInt();
        } while (numero < 0);
        
        // Exemplo de validação usando while
        System.out.println("Digite um número positivo");
        numero = leitor.nextInt();
        while (numero < 0) {
            System.out.println("Número inválido! Digite novamente");
            numero = leitor.nextInt();
        }
        
        // Exemplo de validação usando while, mas sem ler o número antes
        numero = -1;  // Inicializamos numero com um valor negativo
                      // para forçar entrar no loop e pedir para digitar um número
        while (numero < 0) {
            System.out.println("Digite um número positivo");
            numero = leitor.nextInt();
        }
        
        // Solicitar que o usuário digite 5 números, ler os números
        // e depois exibir a soma dos valores digitados
        soma = 0;
        for (Integer i = 1; i <= 5; i++) {
            System.out.println("Digite um número");
            numero = leitor.nextInt();
            soma += numero;
        }
        System.out.println("A soma dos números digitados é "+ soma);
    }
}