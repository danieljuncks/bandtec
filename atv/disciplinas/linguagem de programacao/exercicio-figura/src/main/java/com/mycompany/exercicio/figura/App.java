/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio.figura;

/**
 *
 * @author usuario
 */
public class App {
    public static void main(String[] args) {
        Quadrado q = new Quadrado("Amarelo", 5, 2.0);
        Retangulo r = new Retangulo ("Vermelho", 6, 12.5, 5.0);
        Triangulo t = new Triangulo ("Verde", 8, 11.5, 8.5);
        Circulo c = new Circulo ("Preto", 7, 14.5);
        
        System.out.println(q);
        System.out.println(r);
        System.out.println(t);
        System.out.println(c);
        
        Imagem bandeira = new Imagem();
        
        bandeira.adicionaFigura(q);
        bandeira.adicionaFigura(r);
        bandeira.adicionaFigura(t);
        bandeira.adicionaFigura(c);
        
        bandeira.exibeFiguras();
        bandeira.exibeSomaArea();
        bandeira.exibeFiguraAreaMaior20();
        bandeira.exibeQuadrado();
    }
}
