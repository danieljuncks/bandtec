/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo.classe.abstrata;

/**
 *
 * @author celia.taniwaki
 */
public class Vendedor extends Funcionario{

    // Atributos
    private Double vendas;      // Quantia de vendas realizadas no mês
    private Double taxa;        // Taxa de comissão ganho sobre as vendas
    
    // Construtor
    public Vendedor(String cpf, String nome, Double vendas, Double taxa) {
        super(cpf, nome);
        this.vendas = vendas;
        this.taxa = taxa;
    }
    
    // Métodos

    // Implementação do método abstrato calcSalario()
    @Override
    public Double calcSalario() {
        return vendas * taxa;
    }

    @Override
    public String toString() {
        return "Vendedor{" + super.toString() + ", vendas=" + vendas + ", taxa=" + taxa + 
                ", salário=" + calcSalario() + '}';
    }
    
    // Getters

    public Double getVendas() {
        return vendas;
    }

    public Double getTaxa() {
        return taxa;
    }
    
    
    
            
    
}
