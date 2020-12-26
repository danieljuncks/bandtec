package aluno;

/**
 *
 * @author Diego Brito <diego.lima@bandtec.com.br>
 */
public class ProgramaAluno {

    public static void main(String[] args) {

        //Criação do objeto Aluno
        Aluno a1 = new Aluno("Diego Brito", 50000);
        
        //Adicionando disciplinas
        a1.adicionarDisciplina("Linguagem de programação", 10.0, 9.5, 2);
        a1.adicionarDisciplina("Banco de dados", 6.5, 2.4, 4);
        
        //Exibindo dados
        a1.exibirBoletim();
        
    }
}
