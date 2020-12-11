package br.com.bandtec.projetoac2.controladores;

import br.com.bandtec.projetoac2.dominios.Artista;
import br.com.bandtec.projetoac2.repositorios.ArtistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/artistas")
public class ArtistaController {


    @Autowired
    private ArtistaRepository repository;

    @GetMapping
    public ResponseEntity getArtistas() {
        return ResponseEntity.ok(repository.findAll());
    }

    @GetMapping("/simples")
    public ResponseEntity getArtistasSimples() {
        return ResponseEntity.ok(repository.findAllSimples());
    }

    @PostMapping
    public ResponseEntity criar(@RequestBody Artista criarArtista){
        repository.save(criarArtista);
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
