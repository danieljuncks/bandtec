package br.com.bandtec.projetoac2.repositorios;

import br.com.bandtec.projetoac2.dominios.Musica;
import br.com.bandtec.projetoac2.visoes.MusicaSimples;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MusicaRepository extends CrudRepository<Musica, Integer> {

    @Query("select m from Musica m")
    List<MusicaSimples> findAllSimples();
}
