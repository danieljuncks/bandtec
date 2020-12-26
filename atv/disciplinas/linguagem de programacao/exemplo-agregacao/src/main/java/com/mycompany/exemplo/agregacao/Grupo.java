/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exemplo.agregacao;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta classe tem um relacionamento de agregação com a classe Contato
 * Um objeto Grupo contém um ou mais objetos Contato
 * Por isso esta classe tem como atributo, um List de Contato
 * 
 * @author celia.taniwaki
 */
public class Grupo {
    
    // Atributos
    private String nome;            // nome do grupo
    private List<Contato> lista;    // lista de contatos

    // Construtor que recebe o nome do grupo
    public Grupo(String nome) {
        this.nome = nome;
        lista = new ArrayList<Contato>();   // instancia a lista
    }
    
    // Métodos
    
    // Método adiciona - Recebe um objeto Contato e adiciona esse contato à lista
    public void adiciona(Contato c) {
        lista.add(c);
    }
    
    // Método remove - Recebe um objeto Contato e remove esse contato da lista 
    public void remove(Contato c) {
        lista.remove(c);
    }

    // Getter do atributo lista
    public List<Contato> getLista() {
        return lista;
    }
    
    
}
