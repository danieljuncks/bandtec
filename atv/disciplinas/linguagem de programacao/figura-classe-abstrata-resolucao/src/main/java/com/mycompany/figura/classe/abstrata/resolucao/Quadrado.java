package com.mycompany.figura.classe.abstrata.resolucao;

/**
 *
 * @author diego <diego.lima@bandtec.com.br>
 */
public class Quadrado extends Figura {

    private Double lado;

    public Quadrado(Double lado, String cor, Integer espessura) {
        super(cor, espessura);
        this.lado = lado;
    }

    @Override
    public Double calculaArea() {
        return Math.pow(lado, 2);
    }

    public Double getLado() {
        return lado;
    }

    @Override
    public String toString() {
        return "Quadrado\n"
                + "\nlado: " + lado
                + super.toString();

    }

}
