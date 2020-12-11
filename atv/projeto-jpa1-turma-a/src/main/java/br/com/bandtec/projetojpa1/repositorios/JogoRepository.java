package br.com.bandtec.projetojpa1.repositorios;

import br.com.bandtec.projetojpa1.dominios.Jogo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/*
Repository -> Padrão de Projeto no qual criamos uma classe para cada entidade.
              Essa classe contém os métodos com operação junto ao BD.
 */
/*
CrudRepository<1, 2>
 1 -> Classe de Entidade
 2 -> Classe do tipo da PK (Chave primária)
 */
/*
CRUD -> Create, Retrieve (recuperar), Update (atualizar) e Delete
A CrudRepository possui métodos para as principais operações junto a um BD
 */
public interface JogoRepository extends CrudRepository<Jogo, Integer> {

    // consulta por nome igual a
    List<Jogo> findByNome(String nome);

    // consulta por preco maior que
    List<Jogo> findByPrecoGreaterThan(Double precoMinimo);

}
