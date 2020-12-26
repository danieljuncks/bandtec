package com.mycompany.desafio.conta.corrente;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diego Brito <diego.lima@bandtec.com.br>
 */
public class ContaCorrente {
    
    //Atributos
    private String nomeTitular;
    private Double saldo;
    private List<Historico> historico;
    
    //Utilização de constantes, opcional, é bom saber que existe.
    //Na prática, é como o próprio nome diz "constante", algo que é imutável.
    private final String SAQ;
    private final String DEP;

    //Construtor que recebe apenas o nome do titular da conta
    //dado a regra de negócio.
    public ContaCorrente(String nomeTitular) {
        this.nomeTitular = nomeTitular;
        
        //Toda conta "nasce" com zero de saldo
        this.saldo = 0.0;
        
        //Criação da lsita
        this.historico = new ArrayList<Historico>();
        
        //Definição os valores padrão para essas constantes
        this.SAQ = "saque";
        this.DEP = "depósito";
    }
    
    //Método público para realizar depósitos: 
    public void depositar(Double valor, Integer dia, Integer mes, Integer ano){
        this.saldo += valor;
        
        //Chamando método privado para executar o registro de ocorrência
        //Repare que estou passando um objeto do tipo Histórico
        this.registraOcorrencia(new Historico(dia, mes, ano, valor, this.DEP));
    }
    
    //Método público para realizar saques: 
    public void sacar(Double valor, Integer dia, Integer mes, Integer ano){
        this.saldo -= valor;
        
        //Chamando método privado para executar o registro de ocorrência
        //Repare que estou passando um objeto do tipo Histórico
        this.registraOcorrencia(new Historico(dia, mes, ano, valor, this.SAQ));
    }
    
    //Método privado, pois é de uso exclusivo da classe
    private void registraOcorrencia(Historico ocorrencia){
        this.historico.add(ocorrencia);
    }
    
    //Método para exibir extrato:
    public void exibirExtrato(){
        
        System.out.println("--------------EXTRATO--------------\n");
        
        System.out.println(String.format("Titular: %s", this.getNomeTitular()));
        
        System.out.println(String.format("Saldo: %s\n", this.getSaldo()));
        
        for (Historico ocorrencia : historico) {
            
            System.out.println(String.format("Operação: %s", ocorrencia.getTipo()));
            
            System.out.println(String.format("Data: %d/%d/%d",
                    ocorrencia.getDia(),ocorrencia.getMes(), ocorrencia.getAno() ));
            
            System.out.println(String.format("Valor: %.2f\n ", ocorrencia.getValor()));
        }
        System.out.println("--------------EXTRATO--------------");
    }

    //Getters
    
    public String getNomeTitular() {
        return nomeTitular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public List<Historico> getHistorico() {
        return historico;
    }

    //Método toString(), caso o usuário queira ver os dados do objeto.
    @Override
    public String toString() {
        return "ContaCorrente{" + "nomeTitular=" + nomeTitular + ", saldo=" + saldo + ", historico=" + historico + '}';
    }   
}
