/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipo.a;

/**
 *
 * @author diego <diego.lima@bandtec.com.br>
 */
public class AlunoPos extends Aluno {

    private Double notaMonografia;

    public AlunoPos(Integer ra, String nome, Double notaContinuada, Double notaSemestral, Double notaMonografia) {
        super(ra, nome, notaContinuada, notaSemestral);
        this.notaMonografia = notaMonografia;
    }

    @Override
    public Double calculaMedia() {
        return (this.notaContinuada + this.notaSemestral + this.notaMonografia) / 3;
    }

    public Double getNotaMonografia() {
        return notaMonografia;
    }

    @Override
    public String toString() {
        return "\nAlunoPos:" + 
                super.toString() + 
                "\nNota Monografia: " + notaMonografia;
    }

}
