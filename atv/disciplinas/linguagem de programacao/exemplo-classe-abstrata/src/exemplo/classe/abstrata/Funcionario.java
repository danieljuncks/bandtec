/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo.classe.abstrata;

/**
 * Classe abstrata Funcionário
 * Servirá de base para criar as classes herdeiras Vendedor e Horista
 * 
 * @author celia.taniwaki
 */
public abstract class Funcionario {
    
    // Atributos
    // Aqui poderiam ser colocados todos os atributos comuns a todos os
    // funcionários da empresa
    private String cpf;     // cpf do funcionário
    private String nome;    // nome do funcionário
    
    // Construtor
    public Funcionario(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }
    
    // Métodos
    
    /* Método abstrato calcSalario() */
    // As classes herdeiras concretas serão obrigadas a implementarem esse método
    public abstract Double calcSalario();
    
    /* toString() */
    @Override
    public String toString() {
        return "Funcionario{" + "cpf=" + cpf + ", nome=" + nome + '}';
    }
    
    // getters

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }
    
    
}
