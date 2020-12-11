package br.com.bandtec.projetoac2.dominios;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Arquivo {
    public static void gravaLista(ListaObj<Musica> lista, String nomeDoArquivo) {
        FileWriter arquivo = null;
        Formatter saida = null;
        String nomeDoArquivoDefault = "musica.csv";
        boolean crashed = false;

        if (nomeDoArquivo == null)
            nomeDoArquivo = nomeDoArquivoDefault;
        if (!nomeDoArquivo.endsWith(".csv"))
            nomeDoArquivo += ".csv";

        try {
            arquivo = new FileWriter(nomeDoArquivo, true);
            saida = new Formatter(arquivo);
        } catch (IOException erro) {
            System.err.println("Erro ao abrir arquivo");
            System.exit(1);
        }

        try {
            for (int i = 0; i < lista.getTamanho(); i++) {
                Musica musicas = lista.getElemento(i);
                saida.format("%05d;%-40s;%-20s;%-20s;%-40s%n",
                        musicas.getId(),
                        musicas.getNome(),
                        musicas.getGenero(),
                        musicas.getCertificacao(),
                        musicas.getArtista()
                );
            }
        } catch (FormatterClosedException erro) {
            System.err.println("Erro ao gravar no arquivo");
            crashed = true;
        } finally {
            saida.close();
            try {
                arquivo.close();
            } catch (IOException erro) {
                System.err.println("Erro ao fechar arquivo.");
                crashed = true;
            }
            if (crashed)
                System.exit(1);
        }
    }

    public static void leExibeArquivo(String nomeDoArquivo) {
        FileReader arquivo = null;
        Scanner entrada = null;
        boolean crashed = false;

        try {
            arquivo = new FileReader(nomeDoArquivo);
            entrada = new Scanner(arquivo).useDelimiter(";|\\n|\\r\\n");
        } catch (FileNotFoundException erro) {
            System.err.println("Arquivo não encontrado");
            System.exit(1);
        }

        try {
            System.out.printf("%-10s%-40s%-20s%-20s%-40s\n","ID MUSICA","NOME","GÊNERO", "CERTIFICAÇÃO", "ARTISTA");
            while (entrada.hasNext()) {
                Integer id = entrada.nextInt();
                String nome = entrada.next();
                String genero = entrada.next();
                String certificacao = entrada.next();
                String artista = entrada.next();

                System.out.printf("%04d;%-20s;%04d;%4.2f;%4.2f;%4.2f%\n",id,nome,genero, certificacao, artista);
            }
        } catch (NoSuchElementException erro) {
            System.err.println("Arquivo com problemas.");
            crashed = true;
        } catch (IllegalStateException erro) {
            System.err.println("Erro na leitura do arquivo.");
            crashed = true;
        } finally {
            entrada.close();
            try {
                arquivo.close();
            } catch (IOException erro) {
                System.err.println("Erro ao fechar arquivo.");
                crashed = true;
            }
            if (crashed)
                System.exit(1);
        }
    }
}
