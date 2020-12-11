package br.com.banctec.projetoagendador.repositorios;

import br.com.banctec.projetoagendador.entidades.Cliente;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ClienteRepository extends CrudRepository<Cliente, Integer> {

    List<Cliente> findByDiaNascimentoAndMesNascimento(int dia, int mes);
}
