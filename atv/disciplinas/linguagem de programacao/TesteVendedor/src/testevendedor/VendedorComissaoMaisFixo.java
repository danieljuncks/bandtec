/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testevendedor;

/**Esta classe representa um vendedor que ganha na base de comissão sobre as vendas realizadas
 * no mês, e além disso, ele ganha também um salário fixo. 
 * Ou seja, se ele não vender nada no mês, ele ganha pelo menos um salário fixo.
 * Se as vendas realizadas for R$ 10000,00, por exemplo, e se a taxa de comissão que
 * ele ganha for de 0.10 (10%), e se o salário fixo dele for R$ 2000,00, o salário dele
 * nesse mês será de R$ 3000,00 (R$ 1000,00 de comissão mais R$ 2000,00 de salário fixo).
 * 
 * Como esse vendedor também é um vendedor que ganha na base de comissão, essa classe é
 * herdeira de VendedorComissao
 *
 * @author celia.taniwaki
 */
public class VendedorComissaoMaisFixo extends VendedorComissao{
    
    // Atributos
    private Double salarioFixo;
    
    // Construtor

    /* Este construtor é gerado pela IDE, e percebam que ele já inclui todos os atributos de VendedorComissaoMaisFixo
       O salarioFixo e os atributos herdados de VendedorComissao
       Costumo alterar a ordem dos argumentos para que o atributo da classe filha fique no final
    */
    public VendedorComissaoMaisFixo(Integer codigo, String nome, Double vendas, Double taxa, Double salarioFixo) {
        super(codigo, nome, vendas, taxa);      // chamada do construtor da classe mãe
        this.salarioFixo = salarioFixo;
    }

    
    
    // Métodos

    // Sobrescreve ou Reescreve o método calculaSalario() da classe mãe - Override
    // No caso desta classe, é necessário sobrescrevermos este método para que o cálculo
    // do salário do VendedorComisssaoMaisFixo inclua o salarioFixo e fique correto
    @Override
    public Double calculaSalario() {
//        return super.calculaSalario() + salarioFixo; //To change body of generated methods, choose Tools | Templates.
        return getVendas() * getTaxa() + salarioFixo; 
    }

    @Override
    public String toString() {
        return "VendedorComissaoMaisFixo{" + super.toString() + ", salarioFixo=" + salarioFixo + '}';
    }

    public Double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(Double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }
    
    
}
