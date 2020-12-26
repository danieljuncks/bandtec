package tipo.b;

/**
 *
 * @author diego <diego.lima@bandtec.com.br>
 */
public class App {

    public static void main(String[] args) {
        Aluno a1 = new Aluno(5000, "Diego", 7.4, 8.6);
        AlunoPos p1 = new AlunoPos(5100, "Célia", 7.5, 6.4, 10.0);

        System.out.println(String.format("Aluno %s tem média: %.2f", a1.getNome(), a1.calculaMedia()));
        System.out.println(String.format("Aluno de pós %s tem média: %.2f", p1.getNome(), p1.calculaMedia()));
    }
}
