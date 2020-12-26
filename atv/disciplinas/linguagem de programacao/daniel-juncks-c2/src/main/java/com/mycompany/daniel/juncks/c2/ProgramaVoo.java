/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.daniel.juncks.c2;

/**
 *
 * @author usuario
 */
public class ProgramaVoo {
    public static void main(String[] args) {
        Passageiro passageiro1 = new Passageiro("João", 3, "Econômica");
        Passageiro passageiro2 = new Passageiro("Maria", 5, "Executivo");
        Passageiro passageiro3 = new Passageiro("Diego", 8, "Primeira Classe");
        Passageiro passageiro4 = new Passageiro("Enzo", 1, "Primeira Classe");
        
        Voo voo1 = new Voo("Los Angeles", 100);
        Voo voo2 = new Voo("Pyongyang", 10);
        Voo voo3 = new Voo("Rio Branco", 0);
        
        passageiro1.exibeDados();
        passageiro2.exibeDados();
        passageiro3.exibeDados();
        
        voo1.cadastrarPassageiro(passageiro1);
        voo1.cadastrarPassageiro(passageiro2);
        voo1.cadastrarPassageiro(passageiro3);
        voo3.cadastrarPassageiro(passageiro4);
        
        voo1.exibeDadosVoo();
        voo2.exibeDadosVoo();
        voo3.exibeDadosVoo();
        
        voo1.exibeAssentosDisponiveis();
        voo2.exibeAssentosDisponiveis();
        voo3.exibeAssentosDisponiveis();
    }
}
