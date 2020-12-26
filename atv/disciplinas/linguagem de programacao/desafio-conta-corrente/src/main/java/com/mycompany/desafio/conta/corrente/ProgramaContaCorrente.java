
package com.mycompany.desafio.conta.corrente;

/**
 *
 * @author Diego Brito <diego.lima@bandtec.com.br>
 */
public class ProgramaContaCorrente {
    
    public static void main(String[] args) {
        
        //Nome do titular
        String nome = "Diego Brito";
        
        //Criação da conta c1
        System.out.println(String.format("Criando conta para Sr(a) %s", nome));
        ContaCorrente c1 = new ContaCorrente(nome);
        
        //Realização de depósitos
        System.out.println("Realizando depósitos...");
        c1.depositar(10.00, 16, 04, 2020);
        c1.depositar(10.00, 20, 04, 2020);
        
        //Realização de saques
        System.out.println("Realizando saques...");
        c1.sacar(10.00, 22, 04, 2020);
        
        //Usando o método toString() para verificar dados do objeto.
        System.out.println("\nSituação objeto c1:");
        System.out.println(c1.toString()+"\n");
        
        //Exibindo o extrato da conta
        c1.exibirExtrato();
        
    }
    
}
