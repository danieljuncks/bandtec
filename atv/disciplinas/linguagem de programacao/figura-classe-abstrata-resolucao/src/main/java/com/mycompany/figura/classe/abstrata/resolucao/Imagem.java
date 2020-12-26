package com.mycompany.figura.classe.abstrata.resolucao;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author diego <diego.lima@bandtec.com.br>
 */
public class Imagem {

    private List<Figura> figuras;

    public Imagem() {
        this.figuras = new ArrayList();
    }

    public void adiciona(Figura figura) {
        figuras.add(figura);
    }

    public void exibeFiguras() {

        if (!figuras.isEmpty()) {
            for (Figura figura : figuras) {
                System.out.println(figura + "\n");
            }
        } else {
            System.out.println("Não existem figuras nessa imagem.");
        }
    }

    public void exibeSomaArea() {

        Double acumulador = 0.0;

        if (!figuras.isEmpty()) {
            for (Figura figura : figuras) {
                acumulador += figura.calculaArea();
            }
        } else {
            System.out.println("Não existem figuras nessa imagem.");
        }

        System.out.println(String.format("Total: %.2f", acumulador));
    }

    public void exibeFiguraMaior20() {

        if (!figuras.isEmpty()) {
            for (Figura figura : figuras) {
                if (figura.calculaArea() > 20.0) {
                    System.out.println(figura + "\n");
                }
            }
        } else {
            System.out.println("Não existem figuras nessa imagem.");
        }
    }

    public void exibeQuadrados() {

        if (!figuras.isEmpty()) {
            for (Figura figura : figuras) {
                if (figura instanceof Quadrado) {
                    System.out.println(figura + "\n");
                }
            }
        } else {
            System.out.println("Não existem figuras nessa imagem.");
        }
    }
}
