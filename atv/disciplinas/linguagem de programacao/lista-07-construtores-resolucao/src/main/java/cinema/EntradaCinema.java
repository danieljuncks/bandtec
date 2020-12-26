package cinema;

/**
 *
 * @author diego
 */
public class EntradaCinema {

    private Integer hora;
    private Integer sala;
    private String filme;
    private Double valor;

    public EntradaCinema(Integer hora, Integer sala, String filme, Double valor) {
        this.hora = hora;
        this.sala = sala;
        this.filme = filme;
        this.valor = valor;
    }

    public void calculaDesconto(Integer idade, Boolean estudante) {
        if (idade < 12) {
            this.valor = this.valor - (this.valor * 0.50);
        } else if ((idade >= 12 && idade <= 15) && estudante) {
            this.valor = this.valor - (this.valor * 0.40);
        } else if ((idade > 15 && idade <= 20) && estudante) {
            this.valor = this.valor - (this.valor * 0.30);
        } else if (idade > 20 && estudante) {
            this.valor = this.valor - (this.valor * 0.20);
        }
    }

    public void calculaDescontoHorairo() {
        if (hora < 16) {
            this.valor = this.valor - (this.valor * 0.1);
        }
    }

    public void exibeEntrada() {

        System.out.println("---------------INGRESSO----------------");
        System.out.println(String.format("Nome do filme: %s", this.getFilme()));
        System.out.println(String.format("Início: %d horas", this.getHora()));
        System.out.println(String.format("Sala: %s", this.getSala()));
        System.out.println(String.format("Valor do ingresso %.2f\n", this.getValor()));

    }

    public Integer getHora() {
        return hora;
    }

    public Integer getSala() {
        return sala;
    }

    public String getFilme() {
        return filme;
    }

    public Double getValor() {
        return valor;
    }
}
