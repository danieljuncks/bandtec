package com.mycompany.lista.nivelamento;

/**
 *
 * @author diego
 */
public class ContadorVariado {

    public static void main(String[] args) {

        for (Double i = 0.0; i < 5; i += 0.15) {
            System.out.println(String.format("-> %.2f", i));
        }

    }
}
