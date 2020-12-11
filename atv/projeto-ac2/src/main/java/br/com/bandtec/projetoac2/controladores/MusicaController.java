package br.com.bandtec.projetoac2.controladores;

import br.com.bandtec.projetoac2.dominios.Musica;
import br.com.bandtec.projetoac2.repositorios.MusicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/musicas")
public class MusicaController {

    @Autowired
    private MusicaRepository repository;

    @GetMapping
    public ResponseEntity getMusicas() {
        return ResponseEntity.ok(repository.findAll());
    }

    @GetMapping("/simples")
    public ResponseEntity getMusicasSimples() {
        return ResponseEntity.ok(repository.findAllSimples());
    }

    @PostMapping
    public ResponseEntity criar(@RequestBody Musica criarMusica){
        repository.save(criarMusica);
        return ResponseEntity.created(null).build();
    }

    @DeleteMapping("{id}")
    public ResponseEntity excluirUm(@PathVariable Integer id){
        if (repository.existsById(id)){
            repository.deleteById(id);
            return ResponseEntity.ok().build();
        }else{
            return ResponseEntity.notFound().build();
        }
    }

}
