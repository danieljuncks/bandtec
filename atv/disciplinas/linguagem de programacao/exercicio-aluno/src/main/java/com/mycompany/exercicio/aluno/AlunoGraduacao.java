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
public class AlunoGraduacao extends Aluno{
    private Double nota1;
    private Double nota2;

    public AlunoGraduacao(String nome, Integer ra, Double nota1, Double nota2) {
        super(nome, ra);
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    
    @Override
    public Double calculaMedia(){
        return (nota1 * 0.4)+(nota2 * 0.6);
    }

    @Override
    public String toString() {
        return "AlunoGraduacao{" + super.toString() + "nota1=" + nota1 + ", nota2=" + nota2 + ", nota2=" + calculaMedia() + '}';
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
    
    
    
}
