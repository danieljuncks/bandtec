package aluno;

/**
 *
 * @author Diego Brito <diego.lima@bandtec.com.br>
 */
public class Disciplina {
    
    //Atributos
    private String nome;
    private Double notaContinuada;
    private Double notaIntegrada;
    private Integer qtdFaltas;
    private Double media;
    private Boolean aprovado;

    //Construtor
    public Disciplina(String nome, Double notaContinuada, Double notaIntegrada, Integer qtdFaltas) {
        this.nome = nome;
        this.notaContinuada = notaContinuada;
        this.notaIntegrada = notaIntegrada;
        this.qtdFaltas = qtdFaltas;
        
        //Criei dois métodos para automatizar, opcional, poderia ser feito diretamente aqui.
        this.media = this.calculaMedia();
        this.aprovado = this.verificaAprovacao();
    }

    //Método que calcula e retorna média
    private Double calculaMedia() {
        return (this.getNotaContinuada() * 0.4) + (this.getNotaIntegrada() * 0.6);
    }

    //Método que verifica aprovação e retorna um booleano
    private Boolean verificaAprovacao() {
        return this.media >= 6 && this.qtdFaltas <= 15;
    }

    //Setter
    //Caso o usuário queira modificar as faltas
    public void setQtdFaltas(Integer qtdFaltas) {
        this.qtdFaltas = qtdFaltas;
    }

    //Getters
    public String getNome() {
        return nome;
    }

    public Double getNotaContinuada() {
        return notaContinuada;
    }

    public Double getNotaIntegrada() {
        return notaIntegrada;
    }

    public Integer getQtdFaltas() {
        return qtdFaltas;
    }

    public Double getMedia() {
        return media;
    }

    public Boolean getAprovado() {
        return aprovado;
    }

    //Método para exibir o conteúdo do objeto caso seja necessário
    @Override
    public String toString() {
        return "Disciplina{" + "nome=" + nome + ", notaContinuada=" + notaContinuada + ", notaIntegrada=" + notaIntegrada + ", qtdFaltas=" + qtdFaltas + ", media=" + media + ", aprovado=" + aprovado + '}';
    }
}
