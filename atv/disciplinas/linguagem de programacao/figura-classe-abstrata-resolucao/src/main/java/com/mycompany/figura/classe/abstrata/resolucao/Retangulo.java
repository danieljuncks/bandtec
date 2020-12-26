package com.mycompany.figura.classe.abstrata.resolucao;

/**
 *
 * @author diego <diego.lima@bandtec.com.br>
 */
public class Retangulo extends Figura {

    private Double base;
    private Double altura;

    public Retangulo(Double base, Double altura, String cor, Integer espessura) {
        super(cor, espessura);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public Double calculaArea() {
        return this.base * this.altura;
    }

    public Double getBase() {
        return base;
    }

    public Double getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return "Retangulo\n"
                + "\naltura: " + altura
                + "\nbase: " + base
                + super.toString();

    }
}
