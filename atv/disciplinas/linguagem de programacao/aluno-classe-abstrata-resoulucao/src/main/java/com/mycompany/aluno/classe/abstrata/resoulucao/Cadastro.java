package com.mycompany.aluno.classe.abstrata.resoulucao;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author diego <diego.lima@bandtec.com.br>
 */
public class Cadastro {

    private List<Aluno> alunos;

    public Cadastro() {
        this.alunos = new ArrayList();
    }

    public void adicionaAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void exibeAlunosFundamental() {

        if (!alunos.isEmpty()) {
            for (Aluno aluno : alunos) {
                if (aluno instanceof AlunoFundamental) {
                    System.out.println(aluno+"\n");
                }
            }
        } else {
            System.out.println("A lista de alunos está vazia.");
        }
    }

    public void exibeAlunosGraduacao() {

        if (!alunos.isEmpty()) {
            for (Aluno aluno : alunos) {
                if (aluno instanceof AlunoGraduacao) {
                    System.out.println(aluno+"\n");
                }
            }
        } else {
            System.out.println("A lista de alunos está vazia.");
        }
    }

    public void exibeAlunosPos() {

        if (!alunos.isEmpty()) {
            for (Aluno aluno : alunos) {
                if (aluno instanceof AlunoPos) {
                    System.out.println(aluno+"\n");
                }
            }
        } else {
            System.out.println("A lista de alunos está vazia.");
        }
    }
}
