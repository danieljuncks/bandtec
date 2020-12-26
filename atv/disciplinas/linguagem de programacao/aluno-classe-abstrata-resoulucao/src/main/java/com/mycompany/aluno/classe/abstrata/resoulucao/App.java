package com.mycompany.aluno.classe.abstrata.resoulucao;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author diego <diego.lima@bandtec.com.br>
 */
public class App {

    public static void main(String[] args) {
        
        //Criando objeto do tipo Cadastro
        Cadastro cadastro = new Cadastro();

        //Criando listas para facilitar na hora de cadastrar
        List<AlunoFundamental> alunosFundamental = Arrays.asList(
                new AlunoFundamental(10.0, 8.7, 7.4, 4.6, "José", 5000),
                new AlunoFundamental(9.8, 5.0, 6.7, 8.0, "Diego", 5001),
                new AlunoFundamental(10.0, 10.0, 10.0, 9.5, "Célia", 5002)
        );

        List<AlunoGraduacao> alunosGraduacao = Arrays.asList(
                new AlunoGraduacao(8.5, 7.0, "Paulo", 5100),
                new AlunoGraduacao(8.5, 7.0, "Vitor", 5101),
                new AlunoGraduacao(8.5, 7.0, "Jéssica", 5102)
        );

        List<AlunoPos> alunosPos = Arrays.asList(
                new AlunoPos(8.9, 5.4, 7.9, "Gerson", 5500),
                new AlunoPos(10.0, 9.5, 10.0, "Vera", 5501),
                new AlunoPos(8.0, 6.0, 8.0, "Kaline", 5502)
        );

        System.out.println("Exibindo dados fundamental...");
        
        for (AlunoFundamental aluno : alunosFundamental) {
            System.out.println(aluno + "\n");
            cadastro.adicionaAluno(aluno);
        }
        
        System.out.println("Exibindo dados graduação...");
        
        for (AlunoGraduacao aluno : alunosGraduacao) {
            System.out.println(aluno + "\n");
            cadastro.adicionaAluno(aluno);
        }
        
        System.out.println("Exibindo dados pós...");
        
        for (AlunoPos aluno : alunosPos) {
            System.out.println(aluno + "\n");
            cadastro.adicionaAluno(aluno);
        }
        
        System.out.println("\n=========Manipulando cadastro============");
        
        System.out.println("\n===Exibindo somente alunos fundamental cadastrados===\n");
        cadastro.exibeAlunosFundamental();
        
        System.out.println("\n===Exibindo somente alunos graduação cadastrados===\n");
        cadastro.exibeAlunosGraduacao();
        
        System.out.println("\n===Exibindo somente alunos pós cadastrados===\n");
        cadastro.exibeAlunosPos();
        
    }
}
