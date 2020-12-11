import java.util.Scanner;

public class ExercicioVetor03 {

    public static void main(String[] args) {
        Integer[] nmrs = new Integer[10];
        Integer total = 0;
        Integer media;
        Scanner scan = new Scanner(System.in);

        for (Integer i=0; i<nmrs.length; i++){
            System.out.println("Digite um número");
            nmrs[i] = scan.nextInt();
            total += nmrs[i];
        }
        media = total/10;
        System.out.println("A média é: "+media);
        System.out.println("Números acima da média");
        for (Integer nmr: nmrs) {
            if(nmr > media){
                System.out.println(nmr);
            }
        }

    }
}
