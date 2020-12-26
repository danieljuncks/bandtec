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
public class ExemploClasseAbstrata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Cria um objeto vendedor e um horista
        Vendedor v = new Vendedor("50000", "Claudia", 20000.0, 0.10);
        Horista h = new Horista("60000", "Claudinei", 40, 100.0);

        // Exibe os dados dos objetos criados
        System.out.println(v);
        System.out.println(h);
        
        // Cria objeto Empresa
        Empresa bandtec = new Empresa("Bandtec");

        // Adiciona os objetos v e h á lista de funcionários da empresa bandtec
        bandtec.adicionaFunc(v);
        bandtec.adicionaFunc(h);
        
        // Exibe todos os funcionários
        bandtec.exibeTodos();
        
        // Exibe apenas os vendedores
        bandtec.exibeVendedores();
        
        // Exibe o total gasto em salário
        bandtec.exibeTotalSalario();
   
    }
    
}
