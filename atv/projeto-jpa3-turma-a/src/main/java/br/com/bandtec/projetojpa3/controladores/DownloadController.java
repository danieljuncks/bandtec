package br.com.bandtec.projetojpa3.controladores;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/download")
public class DownloadController {

    @GetMapping("/1")
    public ResponseEntity get1() {
        return ResponseEntity.ok(1);
    }

/*
Lista de Mime-types: https://developer.mozilla.org/pt-BR/docs/Web/HTTP/Basico_sobre_HTTP/MIME_types/Complete_list_of_MIME_types

No atributo "produces" indicamos qual o mime-type que será enviado no header "Content-type" de resposta.
Só que isso só funciona se usarmos a anotação @ResponseBody sobre o método do EndPoint
 */
    @GetMapping(value = "/pdf-loko", produces={"application/pdf"})
    @ResponseBody
    public ResponseEntity getPdf() {
        return ResponseEntity.ok("Só que não");
    }




















    @GetMapping(value = "/zip-loko", produces={"application/x-7z-compressed"})
    @ResponseBody
    public ResponseEntity getZip() {

        // é possível definir headers (cabeçalhos) criando um HttpHeaders
        HttpHeaders headers = new HttpHeaders();

        // no objeto do tipo HttpHeaders, adicione um header com o método .add("nome", "valor")
        headers.add("Content-Disposition", "attachment; filename=lokao.zip");

        // para usar os headers criados, criamos uma ResponseEntity como abaixo:
        // (corpo, headers, status de resposta)
        return new ResponseEntity("Conteúdo Zip fake", headers, HttpStatus.OK);
    }

}
