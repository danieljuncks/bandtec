package inteiros;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Diego Brito <diego.lima@bandtec.com.br>
 */
public class ProgramaListaInteiros {

    public static void main(String[] args) {
        
        //Criando Scanner
        Scanner leitor = new Scanner(System.in);

        //Criando Lista
        List<Integer> lista = new ArrayList<>();
        
        //Variável de controle
        Integer numeroDigitado = 0;

        //Poderia ser usado qualquer estrutura de repetição
        do {

            System.out.println("Digite um número para ser adicionado na lista:");
            System.out.println("Para encerrar digite 0");
            numeroDigitado = leitor.nextInt();

            //Impossibilitando o uso do 0
            if (numeroDigitado != 0) {
                lista.add(numeroDigitado);
            }

            //Condição de parada
        } while (numeroDigitado != 0);

        //Exibindo somente os pares da lista
        System.out.println("\nExibindo somente os pares:");
        for (Integer integer : lista) {

            if (integer % 2 == 0) {
                System.out.println(integer);
            }
        }

        //Exibindo somente os ímpares da lista
        System.out.println("\nExibindo somente os ímpares:");
        for (Integer integer : lista) {

            if (integer % 2 != 0) {
                System.out.println(integer);
            }
        }

        //Exibindo a soma dos números da lista
        System.out.println("\nExibindo a soma dos números:");
        Integer resultado = 0;
        for (int i = 0; i < lista.size(); i++) {
            resultado += lista.get(i);
        }
        
        System.out.println(String.format("Resultado da soma: %d", resultado));

        //Encontrando o maior número da lista
        System.out.println("\nBuscando o maior número digitado:");
        Integer maior = lista.get(0);
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) > maior) {
                maior = lista.get(i);
            }
        }
        
        System.out.println(String.format("O maior número da lista é %d", maior));
        
        //Encontrando o menor número da lista
        System.out.println("\nBuscando o menor número digitado:");
        Integer menor = maior;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) < menor) {
                menor = lista.get(i);
            }
        }
        System.out.println(String.format("O menor número da lista é %d", menor));
    }
}
