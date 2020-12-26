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
public class Aluno {
    // Atributos
    private Integer ra;
    private String nome;
    private Double nota1;
    private Double nota2;
    // Atributo de classe
    private static Integer quantAluno = 0;   /* representa quantos objetos Aluno foram criados */
    
    // Construtores
    
    // Construtor vazio
    public Aluno() {
        System.out.println("Criando um objeto Aluno...");
        quantAluno++;       // incrementa quantidade de objetos criados
    }
    
    // Construtos que recebe apenas o valor do ra e inicializa o atributo ra
    public Aluno(Integer ra) {
        this();         // chama o construtor vazio
        this.ra = ra;
    }
    
    // Construtor que recebe apenas o nome e inicializa o atributo nome
    public Aluno(String nome) {
        this();
        this.nome = nome;
    }
    
    // construtor que inicializa todos os atributos
    public Aluno(Integer ra, String nome, Double nota1, Double nota2) {
        this(ra);       // chama o construtor que inicializa o ra
        this.nome = nome;
        this.nota1= nota1;
        this. nota2 = nota2;
    }

    // Construtor que inicializa o ra e o nome
    public Aluno(Integer ra, String nome) {
        this();
        this.ra = ra;
        this.nome = nome;
    }
    
    // Métodos
    
    // Método exibeMedia - calcula e exibe a média do aluno
    public void exibeMedia(){
        Double media = calculaMedia();
        System.out.println("A média do aluno é " + media);
    }
    
    // Método calculaMedia - calcula e retorna a média do aluno
    public Double calculaMedia() {
        return nota1 * 0.4 + nota2 * 0.6;
    }
    
    // Método exibeDados - exibe os dados do aluno
    public void exibeDados() {
        System.out.println("\nDados do aluno");
        System.out.println("RA: " + ra);
        System.out.println("Nome: " + nome);
        System.out.println("Nota1: " + nota1);
        System.out.println("Nota2: " + nota2);
        System.out.println("Média: " + calculaMedia());
    }

    // Getters e Setters
    public Integer getRa() {
        return ra;
    }

    public void setRa(Integer ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public static Integer getQuantAluno() {
        return quantAluno;
    }
    
    
}
