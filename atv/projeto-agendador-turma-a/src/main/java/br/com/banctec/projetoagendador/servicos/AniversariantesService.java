package br.com.banctec.projetoagendador.servicos;

import br.com.banctec.projetoagendador.entidades.Cliente;
import br.com.banctec.projetoagendador.repositorios.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class AniversariantesService {

    @Autowired
    private ClienteRepository repository;

    @Scheduled(fixedRate = 24*60*60*1000)
    // @Scheduled(cron = "0 0 3 * * *") // todo dia, 03:00:00
    public void enviarEmailAniversariantes() {

        List<Cliente> clientes = repository.findByDiaNascimentoAndMesNascimento(
                LocalDate.now().getDayOfMonth(), LocalDate.now().getMonthValue());

        System.out.println(clientes.size()+" aniversariantes encontrados");

        clientes.forEach(cliente -> System.out.println("Enviando email p/ "+cliente.getNome()));
    }
}
