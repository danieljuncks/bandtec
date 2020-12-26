/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exemplo.agregacao;

/**
 *
 * @author celia.taniwaki
 */
public class Contato {
    
    // Atributos
    private String nome;        // nome do contato
    private String telefone;    // telefone do contato
    private Boolean bloqueado;  // indica se contato está bloqueado ou não

    // Construtor
    public Contato(String nome, String telefone, Boolean bloqueado) {
        this.nome = nome;
        this.telefone = telefone;
        this.bloqueado = bloqueado;
    }
    
    // Métodos
    
    // Método bloquear: seta bloqueado com true
    public void bloquear() {
        this.bloqueado = true;
    }
    
    // Método desbloquear: seta bloqueado com false 
    public void desbloquear() {
        this.bloqueado = false;
    }


    // Método toString() - gerado pela IDE: AltInsert > toString() > seleciona todos os atributos e Generate
    // Este método retorna uma String contendo os dados dos atributos do objeto
    // Ele é chamado implicitamente quando fazemos um println(objeto)
    // O println espera receber uma String e como o objeto não é uma String, ele chama o toString()
    // para converter o objeto para String
    @Override
    public String toString() {
        return "Contato{" + "nome=" + nome + ", telefone=" + telefone + ", bloqueado=" + bloqueado + '}';
    }

    
    
    
}
