package com.danieljuncks.projetoclientrest.controladores;


import com.danieljuncks.projetoclientrest.modelos.RespostaCep;
import com.danieljuncks.projetoclientrest.servicos.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consultas")
public class ConsultasController {
    @Autowired
    private ViaCepService service;

    @GetMapping("/cep/{cep}")
    public ResponseEntity getCep(@PathVariable String cep) {
        RespostaCep respostaCep = service.getCep(cep);

        return ResponseEntity.ok(respostaCep);
    }


}
