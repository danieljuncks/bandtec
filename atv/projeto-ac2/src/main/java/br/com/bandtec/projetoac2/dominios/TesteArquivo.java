package br.com.bandtec.projetoac2.dominios;

import java.util.Scanner;

public class TesteArquivo {

    static Scanner leitorString = new Scanner(System.in);
    static Scanner leitorNumber = new Scanner(System.in);

    private static void reiniciaLeitores() {
        leitorNumber = new Scanner(System.in);
        leitorString = new Scanner(System.in);
    }

    public static void main(String[] args) {
        boolean fim = false;

        Integer id;
        String nome;
        String genero;
        String certificacao;
        String artista;

        ListaObj<Musica> musicas = new ListaObj<Musica>(10);

        while(!fim){
            System.out.println(
                    "\n" +
                            "1.\tAdicionar uma música\n" +
                            "2.\tExibir a lista\n" +
                            "3.\tGravar a lista em arquivo CSV\n" +
                            "4.\tLer e exibir um arquivo CSV\n" +
                            "5.\tSair\n"
            );

            try {
                 int opcao = leitorNumber.nextInt();
                 switch (opcao){
                     case 1:
                         reiniciaLeitores();
                         System.out.print("Digite o ID da música: ");
                         id= leitorNumber.nextInt();
                         System.out.println("Digite o NOME da música:");
                         nome = leitorString.nextLine();
                         System.out.println("Digite o GÊNERO da música: ");
                         genero = leitorString.nextLine();
                         System.out.println("Digite a CERTIFICAÇÃO da música: ");
                         certificacao = leitorString.nextLine();
                         System.out.println("Digite o ARTISTA da música: ");
                         artista = leitorString.next();
                         musicas.adiciona(new Musica(id, nome, genero, certificacao, artista ));
                         System.out.println("\n Música cadastrada");
                         break;

                     case 2:
                         musicas.exibe();
                         break;

                     case 3:
                         if (musicas.getTamanho() == 0)
                             System.out.println("\nLista vazia, não há nada para gravar");
                         else {
                             Arquivo.gravaLista(musicas, null);
                             musicas.limpa();
                             System.out.println("\nArquivo gravado com sucesso");
                         }
                         break;

                     case 4:
                         reiniciaLeitores();
                         System.out.print("\nDigite o nome do arquivo a ser lido: ");
                         String nomeDoArquivo = leitorString.next();
                         Arquivo.leExibeArquivo(nomeDoArquivo);
                         break;

                     case 5:
                         System.out.println("\nPrograma encerrado");
                         fim = true;
                         break;
                     default:
                         System.out.println("Opção inválida!");
                         break;

                 }
            }catch (Exception ex) {
                System.out.println("\nErro - " + ex.toString() + ": " + ex.getMessage());
                leitorString = new Scanner(System.in);
                leitorNumber = new Scanner(System.in);
            }
        }



    }
}
