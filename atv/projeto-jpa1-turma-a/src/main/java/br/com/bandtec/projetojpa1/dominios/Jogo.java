package br.com.bandtec.projetojpa1.dominios;

import javax.persistence.Entity;
import javax.persistence.Id;

/*
@Entity mapeia a classe para uma tabela no banco de dados
Assim, dizemos que esta classe é um Entidade.

Ao mapearmos (ou "espelharmos") tabelas em classes, estamos fazendo
ORM - Object Relational Mapping (Mapeamento Objeto Relacional)
 */

/*
Por padrão, o nome da classe é o "mesmo" da tabela, mudando-se apenas PascalCase para snake_case
PascalCase -> classes
snake_case > tabelas
 */
@Entity
public class Jogo {

    /*
    @Id -> indica a PK (Chave primária)
     */
    @Id
    private Integer id;

    private String nome;

    private Double preco;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
