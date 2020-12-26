package com.mycompany.aluno.classe.abstrata.resoulucao;

/**
 *
 * @author diego <diego.lima@bandtec.com.br>
 */
public abstract class Aluno {

    private String nome;
    private Integer ra;

    public Aluno(String nome, Integer ra) {
        this.nome = nome;
        this.ra = ra;
    }

    public abstract Double calculaMedia();

    public String getNome() {
        return nome;
    }

    public Integer getRa() {
        return ra;
    }

    @Override
    public String toString() {

        return String.format("nome: %s \nra: %d\nmédia: %.2f",
                this.nome, this.ra, this.calculaMedia());
    }
}
