package br.com.bandtec.projeto03;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cachorros")
public class CachorroController {

    private List<Cachorro> cachorros = new ArrayList<>();

    // endPoints para cadastrar, recuperar um, recuperar todos, alterar um e excluir um

    /*
       @GetMapping tem esse nome porque indica que o Endpoint é acessível
       pelo método HTTP "GET"
     */
    @GetMapping("/listar")
    public List<Cachorro> getCachorros() {
        return cachorros;
    }

    /*
    Método HTTP para cadastro (ou criação) de coisas é o POST
    Portanto, para que um Endpoint responda no POST, usamos a anotação...
    @PostMapping.
    A anotação @RequestBody indica qual classe será usada para converter o JSON da requisição
    No caso, estamos dizendo pro Spring Boot que quam chamar este Endpoint
    Vai enviar um JSON compatível com a classe "Cachorro"
     */
    @PostMapping("/cadastrar")
    public void cadastrarCachorro(@RequestBody Cachorro cachorro) {
        cachorros.add(cachorro);
    }

    @GetMapping("/recuperar/{id}")
    public Cachorro getCachorro(@PathVariable int id) {
        return cachorros.get(id-1);
        // -1 porque se passarem "/1" quero o 1º (que é o item na posição 0 da lista)
    }

    @DeleteMapping("/excluir/{id}")
    public void excluirCachorro(@PathVariable int id) {
        cachorros.remove(id-1);
        // -1 porque se passarem "/1" quero o 1º (que é o item na posição 0 da lista)
    }

    @PutMapping("/alterar/{id}")
    public void alterarCachorro(@PathVariable int id, @RequestBody Cachorro cachorro) {
        cachorros.remove(id-1);
        cachorros.add(id-1, cachorro);
    }
}
