import java.util.Scanner;

public class ExercicioVetor05 {

    public static void main(String[] args) {
        String[] marcaCarro = new String[5];
        int[] consumoCarro = new int[5];
        int indiceCarro = 0;
        int consumoAtual = 0;
        Scanner leitor = new Scanner(System.in);
        Scanner leitordonumero = new Scanner(System.in);
        for (int i = 0; i < marcaCarro.length; i++){
            System.out.println("Digite a marca do carro: ");
            marcaCarro[i] = leitor.nextLine();

            System.out.println("Digite o consumo do carro "+marcaCarro[i]);
            consumoCarro[i] = leitordonumero.nextInt();

            if (consumoCarro[i] > consumoAtual){
                indiceCarro = i;
                consumoAtual = consumoCarro[i];
            }
        }

        System.out.println("O carro com melhor aproveitamento de gasolina" +
                " é o "+marcaCarro[indiceCarro]
                + " com " + consumoCarro[indiceCarro] + " por litro");
        // Procura qual a marca de carro que tem a menor quilometragem por litro
        int menorKm= consumoCarro[0], indiceMenor=0;
        for (int i=1; i < consumoCarro.length; i++) {
            if (consumoCarro[i] < menorKm) {
                menorKm = consumoCarro[i];
                indiceMenor= i;
            }
        }
        System.out.println("O carro com pior aproveitamento de gasolina" +
                " é o "+marcaCarro[indiceMenor]
                + " com " + consumoCarro[indiceMenor] + " por litro");
        for (String marca:marcaCarro) {
            System.out.print(marca + "\t");
        }
        System.out.println();
        for (int consumo:consumoCarro) {
            System.out.print(consumo + "\t");
        }
        System.out.println();
    }
}
