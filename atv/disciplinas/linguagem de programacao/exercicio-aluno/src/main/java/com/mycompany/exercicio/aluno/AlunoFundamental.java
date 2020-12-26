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
public class AlunoFundamental extends Aluno {
    private Double nota1;
    private Double nota2;
    private Double nota3;
    private Double nota4;

    public AlunoFundamental(String nome, Integer ra, Double nota1, Double nota2, Double nota3, Double nota4) {
        super(nome, ra);
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }
    
    @Override
    public Double calculaMedia() {
        return (nota1 + nota2 + nota3 + nota4)/4;
    }

    @Override
    public String toString() {
        return "AlunoFundamental{" + super.toString() + "nota1=" + nota1 + ", nota2=" + nota2 + ", nota3=" + nota3 + ", nota4=" + nota4 + ", nota4=" + calculaMedia() + '}';
    }

    public Double getNota1() {
        return nota1;
    }

    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }

    public Double getNota2() {
        return nota2;
    }

    public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }

    public Double getNota3() {
        return nota3;
    }

    public void setNota3(Double nota3) {
        this.nota3 = nota3;
    }

    public Double getNota4() {
        return nota4;
    }

    public void setNota4(Double nota4) {
        this.nota4 = nota4;
    }
    
}
