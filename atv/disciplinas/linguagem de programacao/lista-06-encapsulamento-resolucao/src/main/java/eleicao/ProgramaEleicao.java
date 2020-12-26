package eleicao;

/**
 *
 * @author diego
 */
public class ProgramaEleicao {
    public static void main(String[] args) {
        
        UrnaEletronica urna = new UrnaEletronica();
        
        System.out.println("Começou a eleição:\n");
        
        urna.votar(1);
        System.out.println(String.format("Candidato 1 recebeu 1 voto, totalizando: %d", urna.getTotalDeVotosCandidato1()));
        
        urna.votar(2);
        System.out.println(String.format("Candidato 2 recebeu 1 voto, totalizando: %d", urna.getTotalDeVotosCandidato2()));
        
        System.out.println(String.format("Total de votos: %d\n", urna.getTotalDeVotos()));
        
        urna.votar(1);
        System.out.println(String.format("Candidato 1 recebeu 1 voto, totalizando: %d", urna.getTotalDeVotosCandidato1()));
        
        urna.votar(2);
        System.out.println(String.format("Candidato 2 recebeu 1 voto, totalizando: %d", urna.getTotalDeVotosCandidato2()));
        
        System.out.println(String.format("Total de votos: %d\n", urna.getTotalDeVotos()));
        
        urna.votar(1);
        System.out.println(String.format("Candidato 1 recebeu 1 voto, totalizando: %d", urna.getTotalDeVotosCandidato1()));
        
        urna.votar(2);
        System.out.println(String.format("Candidato 2 recebeu 1 voto, totalizando: %d", urna.getTotalDeVotosCandidato2()));
        
        System.out.println(String.format("Total de votos: %d\n", urna.getTotalDeVotos()));
        
        urna.votar(1);
        System.out.println(String.format("Candidato 1 recebeu 1 voto, totalizando: %d", urna.getTotalDeVotosCandidato1()));
        
        urna.votar(1);
        System.out.println(String.format("Candidato 1 recebeu 1 voto, totalizando: %d", urna.getTotalDeVotosCandidato1()));
        
        System.out.println(String.format("Total de votos: %d\n", urna.getTotalDeVotos()));
        
        urna.setAcabou(true);
        System.out.println("Eleição encerrada!");
        System.out.println("------------------------------------------------");
        System.out.println(String.format("Total de votos: %d ", urna.getTotalDeVotos()));
        System.out.println(String.format("Resultado: %s", urna.getResultado()));
        
    }
}
