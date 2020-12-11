package br.com.banctec.projetoupload;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
@RequestMapping("/arquivos")
public class ArquivosController {

    /*
Técnica 1 de upload de arquivos: Enviando um Array (vetor) de bytes
QUALQUER arquivo é um vetor de bytes

Usamos essa técnica quando nos interessa SOMENTE o conteúdo do arquivo
     */
    @PostMapping("/simples")
    public ResponseEntity enviar(@RequestBody byte[] conteudoArquivo) throws IOException {
        // exemplo de uso: criar um novo arquivo com o conteudo que chegou

        // as 2 linhas a seguir, apenas criam um arquivo com o conteúdo que chegou no "conteudoArquivo"
        Path path = Paths.get("nova-leitura.txt");
        Files.write(path, conteudoArquivo);

        // outro exemplo de uso:
        Cliente cliente = new Cliente();
        cliente.setFoto(conteudoArquivo);

        return ResponseEntity.created(null).build();
    }

    /*
Técnica 2: Upload usando MultipartFile. Características:
1 - Recebe arquivo vindo de uma tag <input type="file"> numa <form> em um HTML
2 - Conseguimos obter o tipo de arquivo (content type)
3 - Conseguimos recuperar o nome original do arquivo

Usamos essa técnica quando queremos obter não só o conteúdo, mas alguns detalhes do arquivo
     */
    @PostMapping("/completo")
    public ResponseEntity enviar(@RequestParam("arquivo") MultipartFile arquivo) throws IOException {

        // verificando se o arquivo foi enviado mesmo
        if (arquivo.isEmpty()) {
            return ResponseEntity.badRequest().body("Arquivo não enviado!");
        }

        // obtendo o tipo do arquivo
        System.out.println("Recebendo um arquivo do tipo: " + arquivo.getContentType());

        // obtendo o conteúdo do arquivo
        byte[] conteudo = arquivo.getBytes();

        // obtendo o nome original do arquivo para criar uma cópia dele
        Path path = Paths.get(arquivo.getOriginalFilename());
        Files.write(path, conteudo);

        return ResponseEntity.created(null).build();
    }

}














