package br.com.banctec.projetoagendador.servicos;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.concurrent.ThreadLocalRandom;

// essa anotação transforma a classe num Service (Serviço) do Spring
/*
Services são classes que só possuem 1 instância em toda a aplicação
Nelas podemos injetar qualquer componente Spring com @Autowired
E elas podem ser injetadas em outras Services e em Controllers com @Autowired
 */
@Service
public class AgendamentosService {

    /*
@Scheduled -> torna um método "agendável". Ou seja, em algum momento ele será executado!
     */
    @Scheduled(fixedRate = 4000) // fixedRate -> frequência em ms com a qual será executado
    public void recitarPoesia() {
        System.out.println("O amor é como fogo que arde sem se ver");
    }

    // initialDelay -> atraso inicial, ou seja, tempo após iniciar a API p/ começar
    // tempo em ms
    @Scheduled(initialDelay = 5000, fixedRate = 7000)
    public void falarPrequicoso() {
        System.out.println("Eaeeeeee, maaannoooo... (ouvindo Reggae)");
    }

    /*
Agendamento de DIFERENTES CLASSES rodam em paralelo entre sí
Um agendamento, por padrão, espera a execução anterior terminar antes de iniciar uma nova
     */
    @Scheduled(fixedRate = 500)
    public void sortearNumero() {
        System.out.print("Iniciando um sorteio... ");
        int quero = 30;
        while (true) {
            int sorteado = ThreadLocalRandom.current().nextInt(0, 90_000_000);
            if (sorteado == quero) {
                System.out.println("Fui sorteado!");
                break;
            }
        }
    }

    /*
    fixedDelay -> Atraso fixo antes de cada execução
    NÃO pode ser usado em conjunto com o fixedRate
    Sua unidade também é em ms
     */
    @Scheduled(fixedDelay = 4000)
    public void recitarMantra() {
        System.out.println("Só colhe quem planta!");
    }

    /*
quando usamos "cron", usamos as Cron Expressions
São 6 valores, todos obrigatórios:
<segundo> <minuto> <hora> <dia-do-mês> <mês> <dia-da-semana>

No exemplo abaixo, o método está agendado para executar:
Todo segundo, de todo minuto, de toda hora, de todos os dias do mês e da semana

* - tudo
, - vários valores (ex: MON, WED, FRI)
- - intervalo (10-12, entre 10 e 12)

Exemplos:
0 5 * * * *
-> todo dia da semana, todos os meses, todos os dias do mês, toda hora, sempre aos 5m e 0s

0 30 21 * * *
-> todo dia da semana, todos os meses, todos os dias do mês, sempre as 21:30:00

0 0 5 1 * *
-> todo dia da semana, todos os meses, todo dia 1 do mês, sempre as 05:00:00

0 0 5 1 12 *
-> todo dia da semana, todos os meses, todo dia 1 de dezembro, sempre as 05:00:00

0 0 2 * * SAT-SUN
-> só aos sábados e domingos, todos os meses, todo dia do mês (sábado e domingo), as 02:00:00

0 0 5 * * MON-FRI
-> de 2ª a 6ª, todos os meses, todo dia do mês (de 2ª a 6ª), as 05:00:00

0 0 22 * * MON,WED,FRI
-> Toda 2ª, 4ª a 6ª, todos os meses, todo dia do mês (2ª, 4ª a 6ª), as 22:00:00
     */
    @Scheduled(cron = "* * * * * *")
    public void baterPonto() {
        System.out.println("Batendo ponto as "+ LocalDateTime.now());
    }


}




