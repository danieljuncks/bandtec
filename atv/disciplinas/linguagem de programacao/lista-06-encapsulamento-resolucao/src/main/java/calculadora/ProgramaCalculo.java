package calculadora;

/**
 *
 * @author diego
 */
public class ProgramaCalculo {

    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        Integer num1 = 10, num2 = 2;

        System.out.println("Iniando programa calculadora...\n");
        
        calc.somar(num1, num2);
        System.out.println(String.format("%d + %d = %d\n", num1, num2, calc.getResultado()));
        
        calc.subtrair(num1, num2);
        System.out.println(String.format("%d - %d = %d\n", num1, num2, calc.getResultado()));
        
        calc.multiplicar(num1, num2);
        System.out.println(String.format("%d * %d = %d\n", num1, num2, calc.getResultado()));
        
        calc.dividir(num1, num2);
        System.out.println(String.format("%d / %d = %d\n", num1, num2, calc.getResultado()));
        
        System.out.println("Programa encerrado.");
    }
}
