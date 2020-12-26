package aluno;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diego Brito <diego.lima@bandtec.com.br>
 */
public class Aluno {

    //Atributos
    private String nome;
    private Integer ra;
    private List<Disciplina> listaDisciplina;
    
    //Construtor
    public Aluno(String nome, Integer ra) {
        this.nome = nome;
        this.ra = ra;
        this.listaDisciplina = new ArrayList<>();
    }

    //Método que adiciona um novo objeto do tipo Disciplina a lista
    public void adicionarDisciplina(String nome, Double notaContinuada, Double notaIntegrada, Integer qtdFaltas) {
        listaDisciplina.add(new Disciplina(nome, notaContinuada, notaIntegrada, qtdFaltas));
    }
    
    //Imprime a situação geral do aluno
    public void exibirBoletim() {

        System.out.println("------SITUAÇÃO DO ALUNO-----\n");
        System.out.println(String.format("Nome do aluno: %s", this.getNome()));
        System.out.println(String.format("RA: %s\n", this.getRa()));

        for (Disciplina disciplina : listaDisciplina) {

            System.out.println(String.format("Nome da disciplina: %s", disciplina.getNome()));
            System.out.println(String.format("Nota continuada: %.2f", disciplina.getNotaContinuada()));
            System.out.println(String.format("Nota integrada: %.2f", disciplina.getNotaIntegrada()));
            System.out.println(String.format("Quantidade de faltas: %d", disciplina.getQtdFaltas()));
            System.out.println(String.format("Média final: %.2f", disciplina.getMedia()));
            System.out.println(String.format("Situação: %s\n", disciplina.getAprovado() ? "Aprovado!" : "Reprovado!"));
        }
        System.out.println("------SITUAÇÃO DO ALUNO-----\n");
    }

    //Getters
    public String getNome() {
        return nome;
    }

    public Integer getRa() {
        return ra;
    }
    
    public List<Disciplina> getListaDisciplina() {
        return listaDisciplina;
    }

    //Método para exibir o conteúdo do objeto caso seja necessário
    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", listaDisciplina=" + listaDisciplina + '}';
    }
}
