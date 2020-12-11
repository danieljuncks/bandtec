public class Dvd extends Produto {
    private String nome;
    private String gravadora;


    public Dvd(Integer codigo, Double precoCusto, String nome, String gravadora) {
        super(codigo, precoCusto);
        this.nome = nome;
        this.gravadora = gravadora;
    }

    public Double getValorVenda() {
        return getPrecoCusto() * 1.20;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGravadora() {
        return gravadora;
    }

    public void setGravadora(String gravadora) {
        this.gravadora = gravadora;
    }

    @Override
    public String toString() {
        return "Dvd{" + super.toString() +
                "nome='" + nome + '\'' +
                ", gravadora='" + gravadora + '\'' +
                '}';
    }
}
