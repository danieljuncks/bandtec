/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exemplo.heranca;

/**
 *
 * @author celia.taniwaki
 */
public class Teste {

    public static void main(String[] args) {
        
// Cria objeto da classe herdeira
        AlunoGraduacao a1 = new AlunoGraduacao(10000,"Maria",7.0,8.0);
        
        // Exibe o nome do aluno e a nota continuada do objeto a1
        System.out.println("O aluno " + a1.getNome() + " tem nota continuada = "
                            + a1.getNotaContinuada());
        
        // Exibe os dados do aluno a1
        System.out.println("");
        a1.exibeDados();
        
        // Exibe os dados do alunos a1, usando toString()
        System.out.println("");
        System.out.println(a1);
        
        
    }
    
}
