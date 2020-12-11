import java.util.Scanner;

public class ExercicioVetor04 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int vetor[] = new int[10], numeroDigitado, count;

        for (int i = 0; i < vetor.length; i++){
            System.out.print("Digite um numero: ");
            vetor[i] = in.nextInt();
        }

        while (true){
            count = 0;
            System.out.print("Digite um numero qualquer: ");
            numeroDigitado = in.nextInt();

            for (int item: vetor) {
                if (numeroDigitado == item)
                    count++;
            }

            if(count>0){
                System.out.println(String.format("O numero %d ocorre %d vezes", numeroDigitado, count));
            }else{
                System.out.println(String.format("O numero %d não ocorre nenhuma vez", numeroDigitado));
            }
        }
    }



}
