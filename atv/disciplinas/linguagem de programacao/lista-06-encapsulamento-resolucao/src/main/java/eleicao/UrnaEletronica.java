package eleicao;

/**
 *
 * @author diego
 */
public class UrnaEletronica {

    private Integer totalDeVotosCandidato1 = 0;
    private Integer totalDeVotosCandidato2 = 0;
    private Integer totalDeVotos = 0;
    private Boolean acabou = false;

    public void votar(Integer candidato) {
        if (!acabou) {
            if (candidato == 1) {
                totalDeVotosCandidato1++;
                totalDeVotos++;
            } else if (candidato == 2) {
                totalDeVotosCandidato2++;
                totalDeVotos++;
            }
        }
    }

    public String getResultado() {
        if (totalDeVotosCandidato1 > totalDeVotosCandidato2) {
            return "candidato 1 venceu";
        } else if (totalDeVotosCandidato1 < totalDeVotosCandidato2) {
            return "candidato 2 venceu";
        } else {
            return "Deu empate! uma nova eleição deverá ser realizada.";
        }
    }

    public Integer getTotalDeVotosCandidato1() {
        return totalDeVotosCandidato1;
    }

    public Integer getTotalDeVotosCandidato2() {
        return totalDeVotosCandidato2;
    }

    public Integer getTotalDeVotos() {
        return totalDeVotos;
    }

    public Boolean getAcabou() {
        return acabou;
    }

    public void setAcabou(Boolean acabou) {
        this.acabou = acabou;
    }
}
