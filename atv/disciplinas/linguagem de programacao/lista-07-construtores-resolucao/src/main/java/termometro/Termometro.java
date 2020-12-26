package termometro;

/**
 *
 * @author diego
 */
public class Termometro {

    private Double tempMaxima;
    private Double tempMinima;
    private Double tempAtual;

    public Termometro(Double tempMaxima, Double tempMinima, Double tempAtual) {
        this.tempMaxima = tempMaxima;
        this.tempMinima = tempMinima;
        this.tempAtual = tempAtual;
    }

    public void aumentarTemperatura(Double temperatura) {
        this.tempAtual += temperatura;

        if (this.tempAtual > tempMaxima) {
            this.tempAtual = tempMaxima;
        }
    }

    public void diminuirTemperatura(Double temperatura) {
        this.tempAtual -= temperatura;

        if (this.tempAtual < tempMinima) {
            this.tempAtual = tempMinima;
        }
    }

    public void exibeFahreinheit() {
        System.out.println(String.format("A temperatura atual em Fahreinheit é de : %.2f",
                ((this.tempAtual * 1.8) + 32)));
    }

    public Double getTempAtual() {
        return tempAtual;
    }
}
