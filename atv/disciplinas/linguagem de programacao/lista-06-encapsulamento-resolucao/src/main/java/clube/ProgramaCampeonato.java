package clube;

/**
 *
 * @author diego
 */
public class ProgramaCampeonato {
    
    public static void main(String[] args) {
        
        Clube barcelona = new Clube();
        Clube realMadrid = new Clube();
        
        System.out.println("Começa a temporada!\n");
        
        System.out.println("Barcelona perdeu nessa rodada");
        barcelona.registrarDerrota();
        
        System.out.println("Real Madrid Ganhou nessa rodada\n");
        realMadrid.registrarVitoria();
        
        System.out.println(String.format("Barcelona pontos: %d", barcelona.getPontos()));
        System.out.println(String.format("Real Madrid pontos: %d", realMadrid.getPontos()));
        
        System.out.println("\n--------------------------------");
        
        System.out.println("Barcelona ganhou nessa rodada");
        barcelona.registrarVitoria();
        
        System.out.println("Real Madrid empatou nessa rodada\n");
        realMadrid.registrarEmpate();
        
        System.out.println(String.format("Barcelona pontos: %d", barcelona.getPontos()));
        System.out.println(String.format("Real Madrid pontos: %d", realMadrid.getPontos()));
        
        System.out.println("\n--------------------------------");
        
        System.out.println("Barcelona ganhou nessa rodada");
        barcelona.registrarVitoria();
        
        System.out.println("Real Madrid empatou nessa rodada \n");
        realMadrid.registrarEmpate();
        
        System.out.println(String.format("Barcelona pontos: %d", barcelona.getPontos()));
        System.out.println(String.format("Real Madrid pontos: %d", realMadrid.getPontos()));
        
        System.out.println("\n--------------------------------");
        
        System.out.println("Final de temporada: \n");
        System.out.println(String.format("Barcelona: %d vitórias, %d empates %d derrotas", 
                barcelona.getVitorias(), barcelona.getEmpates(), barcelona.getDerrotas()));
        System.out.println(String.format("Total de pontos %d \n", barcelona.getPontos()));
        
        System.out.println(String.format("Real Madrid: %d vitórias, %d empates %d derrotas", 
                realMadrid.getVitorias(), realMadrid.getEmpates(), realMadrid.getDerrotas()));
        System.out.println(String.format("Total de pontos %d", realMadrid.getPontos()));
    }
}
