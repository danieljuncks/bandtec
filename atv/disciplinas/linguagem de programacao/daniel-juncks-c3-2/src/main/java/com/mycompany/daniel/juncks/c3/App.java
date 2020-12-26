/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.daniel.juncks.c3;

/**
 *
 * @author usuario
 */
public class App {
    public static void main(String[] args) {
        VeterinarioClinico clinico1 = new VeterinarioClinico(5, "Henrique", 10, 110.50);
        VeterinarioClinico clinico2 = new VeterinarioClinico(6, "Braian", 8, 99.90);
        
        VeterinarioCirurgiao cirurgiao1 = new VeterinarioCirurgiao (80, "Gabriel", 5, 300.00);
        VeterinarioCirurgiao cirurgiao2 = new VeterinarioCirurgiao (90, "Matheus", 6, 400.00);

        ClinicaVeterinaria clinica = new ClinicaVeterinaria("Jau");
        
        clinica.contrataVeterinario(clinico1);
        clinica.contrataVeterinario(clinico2);
        clinica.contrataVeterinario(cirurgiao1);
        clinica.contrataVeterinario(cirurgiao2);
        
        clinica.exibeClinicos();
        clinica.exibeCirurgioes();
        clinica.exibeFolhaDePagamento();
    }
}
