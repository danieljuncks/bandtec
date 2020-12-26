package com.mycompany.projeto.cofrinho;

//CLASSE
//Classes devem seguir o padrão "PascalCase"

//É UMA REPRESENTAÇÃO(UM TIPO DE ABSTRAÇÃO) DE OBJETOS, QUASE QUE UMA DESCRIÇÃO(UMA ESPÉCIE DE FORMA).
//GERALMENTE POSSUEM CARACTERISTICAS(ATRIBUTOS)
//E COMPORTAMENTOS(MÉTODOS).
//CADA OBJETO CRIADO A PARTIR DESSA ABSTRAÇÃO, NASCE COM ESSAS CARACTERISTICAS E 
//COMPORTAMENTOS EMBUTIDOS.

//Declaração padrão de uma classe
public class Cofrinho {

    //ATRIBUTOS
    //atributos devem seguir o padrão "camelCase"
    
    //Uma classe pode ter 0 ou N atributos
    //Os atributos podem ter diversos tipos
    //Neste caso estamos usando o tipo Integer
    Integer saldo = 0;
    
    //MÉTODOS 
    //Métodos devem seguir o padrão "camelCase"
    //Uma classe pode ter 0 ou N métodos
    //Declaração padrão para métodos sem "retorno"(void)
    void sacar() {

        if ((saldo - 50) >= 0) {
            saldo -= 50;
        }
    }

    //Declaração padrão para métodos sem "retorno"(void)
    void depositar() {
        saldo += 50;
    }

    //Declaração padrão para métodos sem "retorno"(void)
    void quebrarCofrinho() {
        saldo = 0;
    }
}
