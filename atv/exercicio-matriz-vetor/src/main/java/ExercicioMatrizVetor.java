import java.util.Scanner;

public class ExercicioMatrizVetor {

    public static void main(String[] args) {


        Scanner leitor = new Scanner(System.in);

        int maxMusicas = 10;
        String[] musicas;
        double[][] vendas;
        double[] certificado = new double[2];
        boolean validado = false;


        while (!validado) {
            try {

                System.out.println("Digite a quantidade de musicas (valor entre 5 e 15)");

                maxMusicas= leitor.nextInt();
                if (maxMusicas >= 5 && maxMusicas <= 15) {
                    validado = true;
                } else {

                    throw new Exception("O valor digitado deve estar entre 5 e 15." +
                                        " Digite novamente.");
                }
            } catch (Exception erro) {
                System.out.println(erro);
            }
        }

        musicas = new String[maxMusicas];
        vendas = new double[maxMusicas][2];


        for (int i=0; i < musicas.length; i++) {
            System.out.println("Digite o nome de uma musica");
            musicas[i] = leitor.next();
        }


        for (int linha=0; linha < vendas.length; linha++) {
            for (int coluna=0; coluna < vendas[0].length; coluna++) {
                System.out.println("Digite a nota VENDAS" + (coluna+1)+
                                   " do musicas " + musicas[linha]);
                vendas[linha][coluna]= leitor.nextDouble();
            }
        }


        for (int coluna=0; coluna < vendas[0].length; coluna++) {
            double soma = 0;
            for (int linha=0; linha < vendas.length; linha++) {
                soma += vendas[linha][coluna];
            }
            certificado[coluna]= soma / maxMusicas;
        }


        System.out.printf("%-15s%10s%10s\n", "NOME DO MUSICAS",
                          "VENDAS 1", "VENDAS 2");
        for (int linha=0; linha < musicas.length; linha++) {
            System.out.printf("%-15s",musicas[linha]);
            for (int coluna=0; coluna < vendas[0].length; coluna++) {
                System.out.printf("%10.2f",vendas[linha][coluna]);
            }
            System.out.println();
        }

        System.out.println();
        System.out.printf("%-15s", "CERTIFICADO:");
        for (int i=0; i < certificado.length; i++) {
            System.out.printf("%10.2f",certificado[i]);
        }

        for (int i = 0; i < vendas.length; i++) {
            System.out.printf(
                    "%-15s%10s%10s\n",
                    musicas[i],
                    vendas[i][0],
                    vendas[i][i],
                    vendas[i][0] + vendas[i][1],
                    vendas[i][0] - vendas[i][1],
                    vendas[i][0] + vendas[i][1]
            );
        }

    }

}
