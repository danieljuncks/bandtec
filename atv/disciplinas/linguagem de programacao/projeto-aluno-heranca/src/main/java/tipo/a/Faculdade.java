package tipo.a;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author diego <diego.lima@bandtec.com.br>
 */
public class Faculdade {

    private String nome;
    private Integer vagas;
    private List<Aluno> listaAlunos;

    public Faculdade(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas;
        this.listaAlunos = new ArrayList();
    }

    public void matricularAluno(Aluno aluno) {
        if (listaAlunos.size() < this.vagas) {
            listaAlunos.add(aluno);
        } else {
            System.out.println("Não há vagas nessa instituição.");
        }
    }

    public void exibirAlunosMatriculados() {
        if (!this.listaAlunos.isEmpty()) {
            listaAlunos.forEach(aluno -> System.out.println(aluno));
        }else{
            System.out.println("A instituição não possuí alunos matriculados.");
        }
    }

    public String getNome() {
        return nome;
    }

    public Integer getVagas() {
        return vagas;
    }

    public List<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    @Override
    public String toString() {
        return "Faculdade: " +
                "\nNome: " + nome +
                "\nVagas: " + vagas + 
                "\nVagas disponíveis: " + (vagas - listaAlunos.size()) + 
                "\nAlunos Matriculados:\n" + listaAlunos;
    }
    
    
}
