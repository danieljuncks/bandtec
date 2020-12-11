package br.com.bandtec.projetojpa1.controladores;

import br.com.bandtec.projetojpa1.dominios.Jogo;
import br.com.bandtec.projetojpa1.repositorios.JogoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/jogos")
public class JogoController {

    /*
@Autowired -> Injeta um objeto gerenciado pelo Spring
              Todos os "Repository" são gerenciados pelo Spring, podendo ser injetados nas Controllers
     */
    @Autowired
    private JogoRepository repository;

    @GetMapping
    public ResponseEntity pesquisar(
            @RequestParam(required = false) Double precoMinimo
    ) {
        if (precoMinimo==null) { // se não tiver parâmetro, traz todos
            if (repository.count() > 0) {
                return ResponseEntity.ok(repository.findAll());
            } else {
                return ResponseEntity.noContent().build();
            }
        } else {
            return ResponseEntity.ok(repository.findByPrecoGreaterThan(precoMinimo));
        }
    }

    @PostMapping
    public ResponseEntity criar(@RequestBody Jogo novoJogo) {
        repository.save(novoJogo);
        return ResponseEntity.created(null).build();
    }

    @GetMapping("/{id}")
    public ResponseEntity getUm(@PathVariable int id) {
        // o findById() retorna um Optional e não um objeto da classe da Entidade diretamente
        Optional<Jogo> jogoOptional = repository.findById(id);

        // caso você queira saber se o Optional está vazio:
        if (jogoOptional.isPresent()) {
            System.out.println("Achei um Jogo com o id!");
            // para recuperar o objeto do Optional:
            System.out.println("É esse aqui: "+jogoOptional.get());
        } else {
            System.out.println("Não tinha o jogo com o id :(");
        }

        // ResponseEntity.of() -> recebe um Optional.
        // Se o Optional estiver vazio, cria uma resposta com status 404 e sem corpo
        // Caso contrário, cria uma resposta com status 200 e o JSON a partir do objeto
        return ResponseEntity.of(jogoOptional);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity excluirUm(@PathVariable int id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity atualizar(@PathVariable int id, @RequestBody Jogo jogoAtualizado) {

        if (repository.existsById(id)) {
            jogoAtualizado.setId(id);
            repository.save(jogoAtualizado);

            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }




}
