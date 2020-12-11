package br.com.bandtec.projeto02;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// é Criada apenas 1 (uma) instância da controller pela API (pelo String Boot)
@RestController
@RequestMapping("/conta")  // essa anotação faz com que todos os endpoints daqui comecem sua URI com "/conta"
public class ContaCorrenteController {

    // atributo de instância
    // se 100 clientes acessarem os endpoint, terão acesso ao MESMO valor
    private Double saldo = 0.0;

    private Integer depositos = 0;
    private Integer saques = 0;

    @GetMapping("/saldo") // URI será /conta/saldo (por causa da anotação @RequestMapping("/conta") na classe)
    public Double getSaldo() {
        return saldo;
    }

    @GetMapping("/depositar10") // URI será /conta/depositar10
    public void depositar10() {
        saldo+=10;
        depositos++;
    }

    @GetMapping("/sacar5")
    public void sacar5() {
        saldo-=5;
        saques++;
    }

    @GetMapping("/historico")
    public String historico() {
        return String.format(
                "Foram realizados %d saques e %d depósitos", saques, depositos);
    }

    @GetMapping("/depositar/{valor}") // URI será /conta/depositar/{valor}
    public void depositar(@PathVariable Double valor) {
        if (valor >= 0) {
            saldo += valor;
            depositos++;
        }
    }

    @GetMapping("/sacar/{valor}") // URI será /conta/sacar/{valor}
    public void sacar(@PathVariable Double valor) {
        if (valor >= 0) {
            saldo -= valor;
            saques++;
        }
    }
}
