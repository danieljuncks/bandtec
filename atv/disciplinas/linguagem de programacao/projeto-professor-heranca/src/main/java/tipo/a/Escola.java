package tipo.a;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author diego <diego.lima@bandtec.com.br>
 */
public class Escola {

    private String nome;
    private Integer vagas;
    private List<Professor> professores;

    public Escola(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas;
        this.professores = new ArrayList();
    }

    public void contratarProfessor(Professor p) {
        if (this.professores.size() < this.vagas) {
            professores.add(p);
        } else {
            System.out.println("Não temos vagas disponíveis.");
        }
    }

    public void exibirProfessores() {
        if (!professores.isEmpty()) {
            professores.forEach(professor -> System.out.println(professor));
        } else {
            System.out.println(String.format("A %s não possuí professores cadastrados.", this.nome));
        }
    }

    public String getNome() {
        return nome;
    }

    public Integer getVagas() {
        return vagas;
    }

    public List<Professor> getProfessores() {
        return professores;
    }
    
    @Override
    public String toString() {
        return "Escola\n" 
                + "\nnome: " + nome 
                + "\nvagas: " + vagas 
                + "\nvagas disponíveis: " + (vagas-professores.size()) 
                + "\nprofessores:\n" + professores;
    }
}
