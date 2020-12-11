package br.com.bandtec.projetojpa3.dominios;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CNPJ;
import org.hibernate.validator.constraints.br.CPF;
import org.hibernate.validator.constraints.br.TituloEleitoral;

import javax.validation.constraints.*;
import java.time.LocalDate;

public class Pessoa {

    //@NotNull(message = "Onde já se viu pessoa sem nome?!?!")
    // @NotEmpty
    @NotNull
    @Length(min=2, max=40)
    private String nome;

    // @Pattern(regexp = "(\\(\\d{2}\\)\\s)?(\\d{4,5}\\-\\d{4})")
    // private String telefone;

    @Min(0)
    @Max(25)
    private Integer filhos;

    @Past
    // @Future
    private LocalDate nascimento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getFilhos() {
        return filhos;
    }

    public void setFilhos(Integer filhos) {
        this.filhos = filhos;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }
}
