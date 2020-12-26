/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio.aluno;

/**
 *
 * @author usuario
 */
public class App {
    public static void main(String[] args) {
        AlunoFundamental af = new AlunoFundamental("Enzo", 12, 8.3, 9.7, 10.0, 7.5);
        AlunoGraduacao ag = new AlunoGraduacao("Gabriel", 1190, 9.2, 7.1);
        AlunoPos ap = new AlunoPos("José", 900, 7.5, 8.5, 9.0);
        
        System.out.println(af);
        System.out.println(ag);
        System.out.println(ap);
        
        Cadastro c = new Cadastro();
        c.adicionaAluno(af);
        c.adicionaAluno(ag);
        c.adicionaAluno(ap);
        
        c.exibeAlunosFundamental();
        c.exibeAlunosGraduacao();
        c.exibeAlunosPos();
    }
}
