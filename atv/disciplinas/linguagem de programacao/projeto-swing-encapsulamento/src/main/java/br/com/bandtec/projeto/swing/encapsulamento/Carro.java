package br.com.bandtec.projeto.swing.encapsulamento;

public class Carro {

    //Atributos(características)
    private Boolean ligado = false;
    private Double velocidade = 0.0;

    //método público sem retorno
    public void ligar() {
        ligado = true;
    }

    // Ao acelerar, a velocidade aumenta em 10 km/h.
    // Só permite acelerar se o carro estiver ligado.
    public void acelerar() {
        if (ligado) {

            velocidade += 10;

            if (velocidade > 120) {
                velocidade = 120.0;
            }
        }
    }

    // Ao frear, a velocidade reduz em 10 km/h
    public void frear() {

        // Evitando que a velocidade fique negativa.
        // Existem "N" maneiras para fazer isso...
        if ((velocidade - 10) >= 0) {
            velocidade -= 10;
        }
    }

    public void desligar() {
        ligado = false;
        velocidade = 0.0;
    }

    // Exemplo de "Getter".
    // Retorna o valor da velocidade.
    public Double getVelocidade() {
        return velocidade;
    }

    // Exemplo de "Getter" que retorna uma String.
    // Note que fiz uso do "operador ternário".
    public String getStatus() {
        return ligado ? "Ligado" : "Desligado";
    }

    // Exemplo de "Getter" para formatação.
    // Ao invés de retornar somente o valor,
    // esse método fará uma foramatação por mim.
    public String getVelocidadeFormatada() {
        return String.format("%.2f km/h", velocidade);
    }

}
