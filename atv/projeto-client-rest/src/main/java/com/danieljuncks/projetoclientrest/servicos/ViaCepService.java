package com.danieljuncks.projetoclientrest.servicos;

import com.danieljuncks.projetoclientrest.modelos.RespostaCep;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "viacep", url = "https://viacep.com.br/")
public interface ViaCepService {

    @GetMapping("/ws{cep}/json")
    RespostaCep getCep(@PathVariable String cep);

}
