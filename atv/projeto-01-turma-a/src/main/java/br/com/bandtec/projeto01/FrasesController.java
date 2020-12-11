package br.com.bandtec.projeto01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
@RestController -> é uma ANOTAÇÃO (Annotation)
É uma forma de metaprogramação.
No caso, estamos configurando a classe para que
ser possível configurar ENDPOINTS de REST nela
 */
/*
O nome da classe NÃO precisa terminar com "Controller".
É só uma convenção.
 */
@RestController
public class FrasesController {

    /*
    @GetMapping -> Outra anotação
    No caso, estamos configurando o método para ser um ENDPOINT
    Este ENDPOINT estará disponível em "/frase1"
    Ou seja a URI desse ENDPOINT é "/frase1"
     */
    @GetMapping
    public String getFrase() {
        return "Minha primeira API! @@";
    }

    /*
    Outro ENDPOINT
    Este ENDPOINT estará disponível em "/frase2"
    Ou seja a URI desse ENDPOINT é "/frase2"
     */
    @GetMapping("/frase2")
    public String getFrase2() {
        return "Minha API é mó dahora!";
    }

    @GetMapping("/numero")
    public Integer getAnoNascimento() {
        return 1981;
    }

    @GetMapping("/verdade")
    public Boolean getVerdade() {
        return true;
    }

}
