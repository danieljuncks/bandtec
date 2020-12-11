package br.com.bandtec.projeto02;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/placar")
public class PlacarController {

    private Integer golsTime1 = 0;
    private Integer golsTime2 = 0;

    // valores entre chaves {} são os PATH PARAMS
    // podem existir quantos forem necessários e ter qualquer nome
    // para usar eles, precisamos anotar algum parâmetro do método
    // com a anotação @PathVariable
    // o parâmetro anotado com @PathVariable deve possui o mesmo nome
    // de um path param entre {}
    @GetMapping("/gol/{time}")
    public void registrarGol(@PathVariable int time) {
        if (time==1) {
            golsTime1++;
        } else if (time==2) {
            golsTime2++;
        }
    }

    @GetMapping  // será invocado pela URI "/placar" (ou "/placar/")
    public String placarAtual() {
        return String.format(
                "Placar: Time1 - %d  x  Time2 - %d", golsTime1, golsTime2);
    }
}
