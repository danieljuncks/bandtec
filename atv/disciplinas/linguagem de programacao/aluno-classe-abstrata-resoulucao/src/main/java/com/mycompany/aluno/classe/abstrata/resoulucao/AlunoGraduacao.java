package com.mycompany.aluno.classe.abstrata.resoulucao;

/**
 *
 * @author diego <diego.lima@bandtec.com.br>
 */
public class AlunoGraduacao extends Aluno {

    private Double nota1;
    private Double nota2;

    public AlunoGraduacao(Double nota1, Double nota2, String nome, Integer ra) {
        super(nome, ra);
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    @Override
    public Double calculaMedia() {
        return (this.nota1 * 0.4) + (this.nota2 * 0.6);
    }

    public Double getNota1() {
        return nota1;
    }

    public Double getNota2() {
        return nota2;
    }

    @Override
    public String toString() {
        return "Aluno Graduacao\n"
                + super.toString()
                + "\nnota 1: " + nota1
                + "\nnota 2: " + nota2;
    }
}
