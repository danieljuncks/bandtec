package tipo.b;

/**
 *
 * @author diego <diego.lima@bandtec.com.br>
 */
public class App {
    
    public static void main(String[] args) {
        
        Professor p1 = new Professor(123, "Célia", 6, 250.0);
        Coordenador c1 = new Coordenador(321, "Gerson", 8, 250.0, 6, 200.0, "Pesquisa e Inovação");
        
        System.out.println("\nContratando professor...");
        System.out.println(p1);
        
        System.out.println(String.format("Salario professor %s: %.2f", p1.getNome(), p1.calcularSalario()));
        
        
        System.out.println("\nContratando coordenador...");
        System.out.println(c1);
        System.out.println(String.format("Salario coordenador %s: %.2f", c1.getNome(), c1.calcularSalario()));
    }
}
