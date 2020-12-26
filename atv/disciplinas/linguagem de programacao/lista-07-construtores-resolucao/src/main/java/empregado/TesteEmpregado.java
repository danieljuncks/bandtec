
package empregado;

public class TesteEmpregado {
    public static void main(String[] args) {
        
        Empregado funcionario01 = new Empregado("Diego", "Dev - PADAWAN", 2000.0);
        Empregado funcionario02 = new Empregado("Célia", "Dev - JEDI", 50000.0);
        
        funcionario01.reajustarSalario(0.1);
        funcionario02.reajustarSalario(0.1);
        
        System.out.println("---------------------------------------------");
        System.out.println("Iniciando programa de reajuste salarial...\n");
        
        System.out.println(String.format("Nome: %s\nCargo: %s\nSalário Reajustado: R$%.2f\n",
                funcionario01.getNome(), funcionario01.getCargo(), funcionario01.getSalario()));
        
        System.out.println("---------------------------------------------\n");
        
        System.out.println(String.format("Nome: %s\nCargo: %s\nSalário Reajustado: R$%.2f\n",
                funcionario02.getNome(), funcionario02.getCargo(), funcionario02.getSalario()));
        
        System.out.println("FIM DO PROGRAMA!");
        System.out.println("---------------------------------------------");
        
    }
}
