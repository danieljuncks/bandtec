package br.com.bandtec.projetoac2.repositorios;

import br.com.bandtec.projetoac2.dominios.Artista;
import br.com.bandtec.projetoac2.visoes.ArtistaSimples;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ArtistaRepository extends CrudRepository<Artista, Integer> {

    @Query("select new br.com.bandtec.projetoac2.visoes.MusicaSimples(a.id,a.nome) from Artista a")
    List<ArtistaSimples> findAllSimples();
}
