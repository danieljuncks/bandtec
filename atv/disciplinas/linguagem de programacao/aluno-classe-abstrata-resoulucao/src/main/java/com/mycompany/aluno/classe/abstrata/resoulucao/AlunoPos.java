package com.mycompany.aluno.classe.abstrata.resoulucao;

/**
 *
 * @author diego <diego.lima@bandtec.com.br>
 */
public class AlunoPos extends Aluno {

    private Double nota1;
    private Double nota2;
    private Double notaMonografia;

    public AlunoPos(Double nota1, Double nota2, Double notaMonografia, String nome, Integer ra) {
        super(nome, ra);
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.notaMonografia = notaMonografia;
    }

    @Override
    public Double calculaMedia() {
        return (this.nota1 + this.nota2 + this.notaMonografia) / 3;
    }

    public Double getNota1() {
        return nota1;
    }

    public Double getNota2() {
        return nota2;
    }

    public Double getNotaMonografia() {
        return notaMonografia;
    }

    @Override
    public String toString() {
        return "Aluno Graduacao\n"
                + super.toString()
                + "\nnota 1: " + nota1
                + "\nnota 2: " + nota2
                + "\nnota Monografia: " + notaMonografia;
    }
}
