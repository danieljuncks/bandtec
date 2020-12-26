package com.mycompany.figura.classe.abstrata.resolucao;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author diego <diego.lima@bandtec.com.br>
 */
public class App {

    public static void main(String[] args) {

        Imagem img = new Imagem();

        List<Quadrado> quadrados = Arrays.asList(
                new Quadrado(10.0, "Amarelo", 3),
                new Quadrado(16.0, "Verde", 2),
                new Quadrado(1.4, "Vermelho", 6)
        );

        List<Retangulo> retangulos = Arrays.asList(
                new Retangulo(12.0, 8.0, "Roxo", 5),
                new Retangulo(1.2, 2.4, "Azul", 2),
                new Retangulo(6.0, 10.0, "Rosa", 1)
        );

        List<Triangulo> triangulos = Arrays.asList(
                new Triangulo(10.0, 20.0, "Preto", 5),
                new Triangulo(8.0, 12.0, "Ciano", 4),
                new Triangulo(2.0, 8.0, "Marrom", 1)
        );

        List<Circulo> circulos = Arrays.asList(
                new Circulo(6.0, "Cinza", 2),
                new Circulo(6.0, "Branco", 1)
        );

        System.out.println("\nExibindo e inserindo quadrados na imagem\n");
        
        for (Quadrado quadrado : quadrados) {
            System.out.println(quadrado + "\n");
            img.adiciona(quadrado);
        }

        System.out.println("\nExibindo e inserindo retângulos na imagem\n");
        
        for (Retangulo retangulo : retangulos) {
            System.out.println(retangulo + "\n");
            img.adiciona(retangulo);
        }

        System.out.println("\nExibindo e inserindo triângulos na imagem\n");
        
        for (Triangulo triangulo : triangulos) {
            System.out.println(triangulo + "\n");
            img.adiciona(triangulo);
        }

        System.out.println("\nExibindo e inserindo círculos na imagem\n");
        
        for (Circulo circulo : circulos) {
            System.out.println(circulo + "\n");
            img.adiciona(circulo);
        }
        
        System.out.println("======Manipulando a imagem======");
        
        System.out.println("\nExibindo todas as figuras\n");
        img.exibeFiguras();
        
        System.out.println("\nExibindo a soma da área das figuras\n");
        img.exibeSomaArea();
        
        System.out.println("\nExibindo todas as figuras que possuem área maior que 20\n");
        img.exibeFiguraMaior20();
        
        System.out.println("\nExibindo somente quadrados\n");
        img.exibeQuadrados();
    }
}
