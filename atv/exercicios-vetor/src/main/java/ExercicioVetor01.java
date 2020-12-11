import java.util.Scanner;

public class ExercicioVetor01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] vetorNumeros = new int[7];

        for (int i = 0; i < vetorNumeros.length; i++) {
            System.out.println("Digite um número: ");
            vetorNumeros[i] = scanner.nextInt();
        }

        // Mostrar na ordem de inserção:

        System.out.println("Números: ");
        for (int i = 0; i < vetorNumeros.length; i++) {
            System.out.println(vetorNumeros[i]);
        }

        // Mostrar na ordem "ao contrário"

        System.out.println("Ao contrário: ");
        for (int i = vetorNumeros.length-1; i >= 0; i--) {
            System.out.println(vetorNumeros[i]);
        }

    }

}
