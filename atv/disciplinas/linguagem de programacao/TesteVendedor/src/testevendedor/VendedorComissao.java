/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testevendedor;

/**Esta classe representa um vendedor que ganha na base de comissão sobre as vendas realizadas
 * no mês. Se as vendas realizadas for R$ 10000,00, por exemplo, e se a taxa de comissão que
 * ele ganha for de 0.10 (10%), o salário dele nesse mês será de R$ 1000,00.
 * 
 * @author celia.taniwaki
 */
public class VendedorComissao {
    
    // Atributos
    private Integer codigo;     // código do vendedor
    private String nome;        // nome do vendedor
    private Double vendas;      // quantia total resultante das vendas realizadas no mês
    private Double taxa;        // taxa de comissão

    // Construtor
    public VendedorComissao(Integer codigo, String nome, Double vendas, Double taxa) {
        this.codigo = codigo;
        this.nome = nome;
        this.vendas = vendas;
        this.taxa = taxa;
    }
    
    // Métodos
    
    /* Método calculaSalario() - retorna o salário do vendedor no mês atual */
    public Double calculaSalario() {
        return vendas * taxa;
    }

    @Override
    public String toString() {
        return "VendedorComissao{" + "codigo=" + codigo + ", nome=" + nome + 
                ", vendas=" + vendas + ", taxa=" + taxa + 
                ", salário=" + calculaSalario() + '}';
    }


    // Getters e Setters
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getVendas() {
        return vendas;
    }

    public void setVendas(Double vendas) {
        this.vendas = vendas;
    }

    public Double getTaxa() {
        return taxa;
    }

    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }
    
    
    
}
