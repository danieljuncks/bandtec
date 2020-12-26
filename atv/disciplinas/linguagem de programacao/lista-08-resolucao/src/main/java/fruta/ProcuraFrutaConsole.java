package fruta;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Diego Brito <diego.lima@bandtec.com.br>
 */
public class ProcuraFrutaConsole {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        //Essa técnica permite criar uma lista já preenchida.
        //Seria o equivalente a fazer varios .add("fruta");
        List<String> listaDeFrutas = Arrays.asList("banana", "maçã", "melancia");
        
        //Solicitando ao usuário um nome de uma fruta
        System.out.println("Digite uma fruta para pesquisarmos na lista:");
        String frutaParaProcurar = leitor.nextLine().toLowerCase();
        
        //Verificando se há a fruta digitada na lista
        if (listaDeFrutas.contains(frutaParaProcurar)) {
            System.out.println(String.format("A fruta %s existe na lista",
                    frutaParaProcurar));
        } else {
            System.out.println(String.format("A fruta %s não existe na lista",
                    frutaParaProcurar));
        }
    }
}
