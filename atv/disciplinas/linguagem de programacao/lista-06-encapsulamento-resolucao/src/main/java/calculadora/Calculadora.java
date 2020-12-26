package calculadora;

/**
 *
 * @author diego
 */
public class Calculadora {

    private Integer resultado;

    public void somar(Integer num1, Integer num2) {
        this.resultado = num1 + num2;
    }

    public void subtrair(Integer num1, Integer num2) {
        this.resultado = num1 - num2;
    }

    public void multiplicar(Integer num1, Integer num2) {
        this.resultado = num1 * num2;
    }

    public void dividir(Integer num1, Integer num2) {
        this.resultado = num1 / num2;
    }

    public Integer getResultado() {
        return resultado;
    }
}
