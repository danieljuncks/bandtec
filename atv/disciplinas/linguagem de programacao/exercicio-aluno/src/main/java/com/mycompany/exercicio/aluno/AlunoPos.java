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
public class AlunoPos extends Aluno{
    private Double nota1;
    private Double nota2;
    private Double notaMonografia;

    public AlunoPos(String nome, Integer ra, Double nota1, Double nota2, Double notaMonografia) {
        super(nome, ra);
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.notaMonografia = notaMonografia;
    }

    @Override
    public Double calculaMedia() {
        return (nota1 + nota2 + notaMonografia)/3;
    }

    @Override
    public String toString() {
        return "AlunoPos{" + super.toString() + "nota1=" + nota1 + ", nota2=" + nota2 + ", notaMonografia=" + notaMonografia +", media=" + calculaMedia() + '}';
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

    public Double getNotaMonografia() {
        return notaMonografia;
    }

    public void setNotaMonografia(Double notaMonografia) {
        this.notaMonografia = notaMonografia;
    }
    
    
}
