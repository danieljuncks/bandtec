package br.com.bandtec.projeto.swing.encapsulamento;

public class ContaCorrente {

    // o private torna o atributo "privado" ou "particular"
    // ou seja, somente cada instância ou objeto
    // do tipo ContaCorrente sabe e pode alterar seu "saldo"
    private Double saldo = 0.0;

    private Integer operacoes = 0;

    // o "public" indica que o método pode ser invocado
    // por qualquer outro objeto
    public void depositar50() {
        saldo += 50;
        operacoes++;
    }

    public void sacar50() {

        if (saldo >= 50) {
            saldo -= 50;
            operacoes++;
        }

    }

    /*
        Este método RETORNA (ou seja, entrega) um valor Double
        Isso é indicado antes do nome do método
        Dentro dele temos um "return saldo", o que indica que
        o valor que ele vai entregar é o "saldo" da ContaCorrente
     */
    public Double getSaldo() {
        return saldo;
    }

    public Integer getOperacoes() {
        return operacoes;
    }

}
