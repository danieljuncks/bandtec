package com.mycompany.figura.classe.abstrata.resolucao;

/**
 *
 * @author diego <diego.lima@bandtec.com.br>
 */
public abstract class Figura {

    private String cor;
    private Integer espessura;

    public Figura(String cor, Integer espessura) {
        this.cor = cor;
        this.espessura = espessura;
    }

    public abstract Double calculaArea();

    public String getCor() {
        return cor;
    }

    public Integer getEspessura() {
        return espessura;
    }

    @Override
    public String toString() {
        return String.format("\ncor: %s \nespessura: %d \nárea: %.2f",
                cor, espessura, this.calculaArea());
    }
}
