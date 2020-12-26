/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo.classe.abstrata;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author celia.taniwaki
 */
public class Empresa {
    
    // Atributos
    private String nome;                // nome da empresa
    private List<Funcionario> lista;    // lista de funcionários da empresa
    
    // Construtor
    public Empresa(String nome) {
        this.nome = nome;
        lista = new ArrayList<Funcionario>();
    }
    
    // Métodos
    
    /* adicionaFunc - Recebe um objeto do tipo Funcionario e adiciona-o à lista */
    public void adicionaFunc(Funcionario f) {
        lista.add(f);
    }
    
    /* exibeTodos - Exibe os dados de todos os funcionários */
    public void exibeTodos() {    
        System.out.println("\nLista dos funcionários:");
        for (Funcionario f : lista) {
            System.out.println(f);
        }
    }
    
    /* exibeVendedor - Exibe os dados de todos os vendedores */
    public void exibeVendedores() {    
        System.out.println("\nLista dos vendedores:");
        for (Funcionario f : lista) {
            if (f instanceof Vendedor) {
                System.out.println(f);
            }
        }
    }
    
    /* exibeTotalSalario - Exibe o total de salário gasto no mês pela empresa */
    public void exibeTotalSalario() {
        Double total = 0.0;
        for (Funcionario f : lista) {
            total += f.calcSalario();
        }
        System.out.println("\nTotal dos salários: " + total);
    }
    
    
}
