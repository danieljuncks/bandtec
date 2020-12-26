/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio.aluno;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author usuario
 */
public class Cadastro {
    private List<Aluno> lista;
    
    public void adicionaAluno(Aluno a) {
        lista.add(a);
    }
    
    public Cadastro() {
        lista = new ArrayList<Aluno>();
    }
    public void exibeAlunosFundamental() {
        System.out.println("\nLista de todos alunos do fundamental:");
        for (Aluno a : lista){
            if (a instanceof AlunoFundamental)
            System.out.println(a);
        }
    }
    
    public void exibeAlunosGraduacao() {
        System.out.println("\nLista de todos alunos da graduação:");
        for (Aluno a : lista){
            if (a instanceof AlunoGraduacao)
            System.out.println(a);
        }
    }
    
    public void exibeAlunosPos() {
        System.out.println("\nLista de todos alunos da pós-graduação:");
        for (Aluno a : lista){
            if (a instanceof AlunoPos)
            System.out.println(a);
        }
    }
    
}
