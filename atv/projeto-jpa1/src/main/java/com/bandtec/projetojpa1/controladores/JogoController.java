package com.bandtec.projetojpa1.controladores;

import com.bandtec.projetojpa1.dominios.Jogo;
import com.bandtec.projetojpa1.repositorios.JogoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/jogos")
public class JogoController {

    private JogoRepository repository;

    @GetMapping
    public ResponseEntity getTodos() {
        return ResponseEntity.ok(repository.findAll());
    }

    @PostMapping
    public ResponseEntity criar(@RequestBody Jogo novoJogo) {
        repository.save(novoJogo);
        return ResponseEntity.created(null).build();
    }


}
