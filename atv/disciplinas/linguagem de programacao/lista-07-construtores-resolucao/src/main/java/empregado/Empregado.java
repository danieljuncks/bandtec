package empregado;

/**
 *
 * @author diego
 */
public class Empregado {

    private String nome;
    private String cargo;
    private Double salario;

    public Empregado(String nome, String cargo, Double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void reajustarSalario(Double reajuste) {
        this.salario = (this.salario * reajuste) + this.salario;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public Double getSalario() {
        return salario;
    }
    
}
