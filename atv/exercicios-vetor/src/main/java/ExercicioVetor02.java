import java.util.Scanner;

public class ExercicioVetor02 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String[] nomes = new String[10];
        boolean achou = false;

        // Solicita para o usuário digitar os valores
        // para preencher o vetor nomes
        for(int i=0 ; i < 10; i++){
            System.out.println(
                    String.format(
                            "Digite o %d º nome:", i+1
                    )
            );

            nomes[i] = in.next();
        }

        // Solicita que o usuário digite o nome a ser pesquisado no vetor
        System.out.println("\nDiga-me, quem você procura?");
        String busca = in.next();

        // Percorre o vetor nomes, verificando se o nome a ser pesquisado
        // está no vetor
        for(int i=0; i<10 && !achou; i++){
            if(nomes[i].equals(busca)){     // encontrou o nome pesquisado
                System.out.println(String.format("Nome encontrado no indice %d", i));
                achou= true;                // sinaliza que achou
            }
        }

        // Se percorreu todo o vetor e não encontrou o nome pesquisado
        // então exibe a mensagem de "Nome não encontrado"
        if (!achou) {
            System.out.println("Nome não encontrado");
        }

    }
}
