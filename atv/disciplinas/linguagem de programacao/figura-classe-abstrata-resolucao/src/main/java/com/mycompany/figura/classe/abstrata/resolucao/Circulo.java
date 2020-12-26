package com.mycompany.figura.classe.abstrata.resolucao;

/**
 *
 * @author diego <diego.lima@bandtec.com.br>
 */
public class Circulo extends Figura {

    private Double raio;

    public Circulo(Double raio, String cor, Integer espessura) {
        super(cor, espessura);
        this.raio = raio;
    }

    @Override
    public Double calculaArea() {
        return Math.PI * (Math.pow(raio, 2));
    }

    public Double getRaio() {
        return raio;
    }

    @Override
    public String toString() {
        return "Círculo\n"
                + "\nraio: " + raio
                + super.toString();
    }
}
