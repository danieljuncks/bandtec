package com.mycompany.desafio.conta.corrente;

/**
 *
 * @author Diego Brito <diego.lima@bandtec.com.br>
 */
public class Historico {
    
    //Atributos
    private Integer dia;
    private Integer mes;
    private Integer ano;
    private Double valor;
    private String tipo;

    //Construtor
    public Historico(Integer dia, Integer mes, Integer ano, Double valor, String tipo) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.valor = valor;
        this.tipo = tipo;
    }

    //Getters and Setters
    
    public Integer getDia() {
        return dia;
    }

    public Integer getMes() {
        return mes;
    }

    public Integer getAno() {
        return ano;
    }

    public Double getValor() {
        return valor;
    }

    public String getTipo() {
        return tipo;
    }

    //Método toString(), caso o usuário queira ver os dados do objeto.
    @Override
    public String toString() {
        return "Historico{" + "dia=" + dia + ", mes=" + mes + ", ano=" + ano + ", valor=" + valor + ", tipo=" + tipo + '}';
    }

}
