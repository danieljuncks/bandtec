package com.mycompany.projeto.conta.corrente;

//PascalCase
public class ContaCorrente {

    //Atributos
    private Double saldo = 0.0;
    private String usuario = "";

    //não retorna valor
    public void sacar50() {
        if (this.saldo >= 50) {
            this.saldo -= 50;
        }
    }

    //não retorna valor
    public void depositar50() {
        this.saldo += 50;
    }

    public void imprimirExtrato(){
        System.out.println("---------------------------------------");
        System.out.println(String.format("Usuário: %s", this.usuario));
        System.out.println(String.format("Saldo atual é de : %.2f", this.saldo));
        System.out.println("---------------------------------------");
    }
    
    //Exemplo de "GETTER"
    //Esse método retorno um valor do tipo Double.
    public Double getSaldo() {    
        return this.saldo;
    }
   
    //Exemplo de "SETTER"
    //Ele nao devolve informação porém, ele espera um novo nome como
    //argumento.
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getUsuario() {
        return usuario;
    } 
}
