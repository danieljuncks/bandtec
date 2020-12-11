package br.com.bandtec.projetoac2.visoes;

public class ArtistaSimples {

        private Integer idArtista;
        private String nome;

    public ArtistaSimples(Integer idArtista, String nome) {
        this.idArtista = idArtista;
        this.nome = nome;
    }

    public Integer getIdArtista() {
        return idArtista;
    }

    public String getNome() {
        return nome;
    }
}
