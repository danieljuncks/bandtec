package com.mycompany.lista.nivelamento;

/**
 *
 * @author diego
 */
public class NumeroPares {

    public static void main(String[] args) {

        for (Integer i = 0; i <= 40; i++) {

            if (i % 2 == 0) {
                System.out.println(String.format("-> %d", i));
            }

        }
        
        //outra solução
        //for (Integer i = 0; i < 10; i+=2) {
            //System.out.println(String.format("-> %d", i));
        //}

    }
}
