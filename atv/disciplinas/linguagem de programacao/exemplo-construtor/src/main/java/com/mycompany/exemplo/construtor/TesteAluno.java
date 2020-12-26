/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exemplo.construtor;

/**
 *
 * @author celia.taniwaki
 */
public class TesteAluno {
    
    public static void main(String[] args) {

        // Criação do objeto a1 da classe Aluno, usando o construtor vazio
        Aluno a1 = new Aluno();
        // Atribuição de valores aos atributos de a1
        a1.setRa(50000);
        a1.setNome("Mickey");
        a1.setNota1(7.0);
        a1.setNota2(9.0);
        
        // exibe a média de a1
        a1.exibeMedia();
        
        // chama o método calculaMedia de a1 e atribui a média retornada para a variável media1
        Double media1 = a1.calculaMedia();
        System.out.println("A média retornada do aluno " +
                            a1.getNome() + " é " + media1);
        // Exibe os dados de a1
        a1.exibeDados();
        // Exibe a quantidade de objetos criados
        // método getQuantAluno é static, então preciso passar o nome da classe antes do pontinho
        System.out.println("Número de alunos: " + Aluno.getQuantAluno());
        
        // Exemplo de erro que acontece, quando eu crio um objeto sem inicializar os valores e chamo
        // o método exibeDados em seguida
        // Aluno a2 = new Aluno();
        // a2.exibeDados();
        
        // Criação do objeto a2, utilizando o construtor que inicializa todos os atributos
        Aluno a2 = new Aluno(50001,"Pateta", 8.5, 7.0);
        // Exibe os dados de a2
        a2.exibeDados();
        // Exibe a quantidade de objetos criados
        System.out.println("Número de alunos: " + Aluno.getQuantAluno());
 
        // Criação do objeto a3, utilizando o construtor que inicializa apenas o ra
        Aluno a3 = new Aluno(50002);
        // Configura demais atributos
        a3.setNome("Fulano");
        a3.setNota1(6.0);
        a3.setNota2(5.0);
        // Exibe os dados de a3
        a3.exibeDados();
        // Exibe a quantidade de objetos criados
        System.out.println("Número de alunos: " + Aluno.getQuantAluno());
        
        // Criação do objeto a4, utilizando o construtor que inicializa apenas o nome
        Aluno a4 = new Aluno("Minnie");
    }
    
}
