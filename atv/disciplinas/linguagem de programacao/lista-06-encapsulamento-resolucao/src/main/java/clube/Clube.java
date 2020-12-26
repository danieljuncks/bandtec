package clube;

/**
 *
 * @author diego
 */
public class Clube {

    private Integer vitorias = 0;
    private Integer empates = 0;
    private Integer derrotas = 0;
    private Integer pontos = 0;

    public void registrarVitoria() {
        this.vitorias += 1;
        this.pontos += 3;
    }
    
    public void registrarEmpate() {
        this.empates += 1;
        this.pontos += 1;
    }
    
    public void registrarDerrota() {
        this.derrotas += 1;
    }
    
    public Integer getVitorias() {
        return vitorias;
    }

    public Integer getEmpates() {
        return empates;
    }

    public Integer getDerrotas() {
        return derrotas;
    }

    public Integer getPontos() {
        return pontos;
    }
}
