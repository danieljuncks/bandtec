package br.com.bandtec.projeto02;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/compras")
public class ComprasController {

    private List<ItemCompra> itens = new ArrayList<>();

    @GetMapping("/comprar/{item}/{valor}/{quantidade}")
    public void registrarCompra(
            @PathVariable String item, @PathVariable Double valor, @PathVariable Integer quantidade) {
        ItemCompra novoItem = new ItemCompra(item, valor, quantidade);
        itens.add(novoItem);
    }

    @GetMapping // URI será "/compras" por causa da anotação @RequestMapping("/compras") na classe
    public List<ItemCompra> getItens() {
        return itens;
    }
}
