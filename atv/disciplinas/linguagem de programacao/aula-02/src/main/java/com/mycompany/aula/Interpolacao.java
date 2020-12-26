
package com.mycompany.aula;

public class Interpolacao {
    
    public static void main(String[] args) {
        
        // Criação de variáveis do tipo String.
        String nome = "Diego Brito";
        String facul = "Bandtec";
        String comando = "println";
        
        // Criação de variável do tipo Integer.
        Integer numeroInteiro = 44 ;
        
        //Criação de variável do tipo Double.
        Double outroNumero = 44.6768686968;
        
        /*
            Para utilzar a interpolação de string, devemos usar o método 
            .format() da classe String.
            Com ele você deve passar a frase ou texto que deseja com "marcadores" 
            como argumento seguido da variáveis que ocuparão os lugares que foram marcados.
            Os marcadores ou chaves para utilizar na interpolação:
                - %s para texto(String).
                - %d para números inteiros(Integer).
                - %f para números com casas decimais.
            No caso de números com casas decimais é possível definir quantas casas
            devem aparecer na exibição(formatação), exemplo:
                - %.2f onde ".2" define que serão exibidas somente duas casas após a vírgula.
            Se você utilizar somente o %f será exibido máximo de 6 casas decimais.
        */
        
        // Exemplo de uso - String.
        String texto = String.format("meu nome é %s e trabalho na %s", nome, facul);
        
        // Exibindo variável texto criada acima.
        System.out.println(texto);
        
        // É possível fazer a interpolação diretamente dentro do System.out.println(),
        // exemplo:
        System.out.println(String.format("Testando via %s", comando));
        
        // Exemplo de uso utilizando número inteiro -  Integer.
        System.out.println(String.format("Um número inteiro %d ", numeroInteiro));
        
        // Exemplo de uso de números com casas decimais - Double
        System.out.println(String.format("Com casas decimais %f", outroNumero));
        
        // Exemplo de uso de números com casas decimais usando a formatação - Double
        System.out.println(String.format("Com duas casas decimais %.2f", outroNumero));
        
        // É possível misturar os diferentes tipos, exemplo:
        System.out.println(String.format("Meu nome: %s e um número aleátorio: %d", nome, numeroInteiro));
        
        // Não há limitações de uso, importante ressaltar que ele troca as "chaves" 
        // pelo valor das variáveis passadas após, exatamente na ordem. 
    }
    
}
