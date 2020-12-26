/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testevendedor;

/**
 *
 * @author celia.taniwaki
 */
public class TesteVendedor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Cria um objeto da classe VendedorComissao
        VendedorComissao vc = new VendedorComissao(123,"Mickey",15000.0,0.20);
        // Exibe o objeto (chamada implícita do toString()
        System.out.println(vc);

        // Cria um objeto da classe herdeira
        VendedorComissaoMaisFixo vcf = new VendedorComissaoMaisFixo
                       (456,"Pateta", 15000.0, 0.20, 2000.0);
        // Exibe o objeto
        System.out.println(vcf);
        
        // Cria um objeto vendas da classe Departamento
        Departamento vendas = new Departamento();
        // Adiciona os objetos vc e vcf ao departamento de Vendas
        vendas.adicionaVendedor(vc);
        vendas.adicionaVendedor(vcf);
        
        // Exibe todos os vendedores do depto de vendas
        vendas.exibeTodos();
        System.out.println("");         

        // Exibe o total dos salários gastos no depto de vendas
        System.out.println("O total dos salários gastos no depto é " +
                            vendas.calculaTotalSalario());
        
    }
    
}
