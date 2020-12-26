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
public class Horista extends Funcionario {
    
    // Atributos
    private Integer qtdHora;            // quantidade de horas trabalhadas no mês
    private Double valorHora;           // valor ganho por hora trabalhada
    
    // Construtor
    public Horista(String cpf, String nome, Integer qtdHora, Double valorHora) {
        super(cpf, nome);
        this.qtdHora = qtdHora;
        this.valorHora = valorHora;
    }

    // Métodos

    // Implementação do método abstrato calcSalario()
    @Override
    public Double calcSalario() {
        return qtdHora * valorHora;
    }

    @Override
    public String toString() {
        return "Horista{" + super.toString() + ", qtdHora=" + qtdHora + 
               ", valorHora=" + valorHora + ", salário=" + calcSalario() + '}';
    }
    
    // Getters

    public Integer getQtdHora() {
        return qtdHora;
    }

    public Double getValorHora() {
        return valorHora;
    }
    
    
    
    


    
    
}
