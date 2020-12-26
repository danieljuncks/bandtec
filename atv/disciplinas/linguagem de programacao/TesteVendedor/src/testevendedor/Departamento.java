/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testevendedor;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author celia.taniwaki
 */
public class Departamento {
    
    // Atributo
    private List<VendedorComissao> lista;
    
    // Construtor
    public Departamento() {
        lista = new ArrayList<VendedorComissao>();
    }
    
    // Métodos
    
    public void adicionaVendedor(VendedorComissao v) {
        lista.add(v);
    }
    
    public Double calculaTotalSalario() {
        Double total = 0.0;
        
        for (VendedorComissao v : lista) {
            total += v.calculaSalario();
        }
         
        return total;
    }
    
    public void exibeTodos() {
        System.out.println("\nRelação dos vendedores do departamento:");
        for (VendedorComissao v : lista) {
            System.out.println(v);
        }
        
    }
    
}
