package br.com.bandtec.projetoac2.dominios;


import javax.persistence.*;

@Entity
public class Musica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;

    private String genero;

    private String certificacao;

    @ManyToOne
    private Artista artista;

    public Musica(Integer id, String nome, String genero, String certificacao, Artista artista) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
        this.certificacao = certificacao;
        this.artista = artista;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCertificacao() {
        return certificacao;
    }

    public void setCertificacao(String certificacao) {
        this.certificacao = certificacao;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    @Override
    public String toString() {
        return String.format("%04d %-30s %-20s %-40s", id, genero, certificacao, artista);
        /*
        return String.format(
                "Musica:" +
                "\nID: %d" +
                "\nGênero: %s" +
                "\nCertificação: %s" +
                "\nArtista: %s",
                id, genero, certificacao, artista
        );
        */
    }


}
