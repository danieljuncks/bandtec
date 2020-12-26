package com.mycompany.lista.nivelamento;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Login {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        String senha = "admin";
        String usuario = "bandtec";

        System.out.println("Digite o usuário:");
        String usuarioDigitado = leitor.nextLine();

        System.out.println("Digite a senha:");
        String senhaDigitada = leitor.nextLine();

        while (!(usuario.equals(usuarioDigitado)) || !(senha.equals(senhaDigitada))) {
            System.out.println("\nUsuário e/ou Senha incorretos.");
            System.out.println("Tente novamente.\n");

            System.out.println("Digite o usuário:");
            usuarioDigitado = leitor.nextLine();
            
            System.out.println("Digite a senha:");
            senhaDigitada = leitor.nextLine();
        }
        
        System.out.println("Login realizado com sucesso!");
    }
}
