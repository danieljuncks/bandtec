import java.util.Scanner;

public class ExemploVetor {

    public static void exibeVetor(int[] v) {
        System.out.println("Elementos do vetor:");
        for (int i = 0; i < v.length; i++) {
            System.out.print("v[" + i + "]= " + v[i] + "\t");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Declarando um vetor de 5 elementos
        int[] vetor = new int[5];

        // Declarando um segundo vetor, já inicializado com valores
        int[] vet2 = {100, 200, 300, 400, 500, 600, 700};

        // Declarando um terceiro vetor, de String, de 4 elementos
        String[] vet3 = new String[4];

        // Declarando um quarto vetor, de String, com os nomes dos dias da semana
        String[] vet4 = {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta",
                         "Sábado"};

        // Declarando um quinto vetor, de int, cujo tamanho será digitado pelo usuário
        int[] vet5;

        int escolha;
        int soma = 0;
        int contaPar = 0;
        int tamanho;


        // Preenchendo valores dos elementos do vetor
        for (int i = 0; i < vetor.length; i++ ) {
            vetor[i] = i * 10;
        }

        // Exibe os elementos do vetor
        exibeVetor(vetor);

        // Preenchendo valores dos elementos do vetor
        // com valores digitados pelo usuário
        for (int i = 0; i < vetor.length; i++ ) {
            System.out.println("Digite o valor de vetor[" + i + "]");
            vetor[i] = leitor.nextInt();
        }

        // Exibe os elementos do vetor
        exibeVetor(vetor);

        // Exibe os elementos do vet2
        exibeVetor(vet2);

        // Preenchendo o vet3 com valores digitados pelo usuário
        for(int i = 0; i < vet3.length; i++) {
            System.out.println("Digite o valor de vet3[" + i + "]");
            vet3[i] = leitor.next();
        }

        // Exibe o vetor vet3 com o for aprimorado
        for (String s : vet3) {
            System.out.print(s + "\t");
        }
        System.out.println();

        // Criar um vetor de Strings, já inicializado com os nomes dos dias da semana
        // (a partir de Domingo)
        // Solicitar para o usuário digitar um número, sendo que 1 é Domingo,
        // 2 é Segunda, etc.
        // Ficar num loop até que o usuário digite um valor válido (1 a 7)
        // Exibir o dia da semana correspondente ao número digitado pelo usuário
        do {
            System.out.println("Digite um número de 1 a 7");
            escolha = leitor.nextInt();
        } while (escolha < 1 || escolha > 7);
        // Exibindo o dia da semana correspondente
        System.out.println("O dia da semana correspondente é " + vet4[escolha-1]);

        // Exibir a soma dos elementos do vetor
        for (int v : vetor) {
            soma += v;
        }
        System.out.println("A soma dos elementos do vetor é " + soma);

        // Exibir a quantidade de elementos pares do vetor
        for (int v : vetor) {
            if (v % 2 == 0) {
                contaPar++;
            }
        }
        System.out.println("A quantidade de elementos pares do vetor é " + contaPar);

        // Pedir para o usuário digitar o tamanho de vet5
        System.out.println("Digite o tamanho do vetor vet5 (maior do que dois)");
        tamanho = leitor.nextInt();
        while (tamanho <= 2) {
            System.out.println("Tamanho inválido. Digite novamente:");
            tamanho = leitor.nextInt();
        }

        // Criar o vetor vet5 com o tamanho digitado
        vet5 = new int[tamanho];

        // Preenchendo valores dos elementos do vet5
        // com valores digitados pelo usuário
        for (int i = 0; i < vet5.length; i++ ) {
            System.out.println("Digite o valor de vet5[" + i + "]");
            vet5[i] = leitor.nextInt();
        }

        // Exibe os elementos do vetor
        exibeVetor(vet5);
    }
}
