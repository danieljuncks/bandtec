package termometro;

/**
 *
 * @author diego
 */
public class TesteTermometro {
    
    public static void main(String[] args) {
        Termometro term =  new Termometro(32.00, -10.00, 15.00);
    
        term.aumentarTemperatura(15.00);
    
        System.out.println(String.format("Temperatura atual: %.2f", term.getTempAtual()));
        
        term.aumentarTemperatura(5.00);
        
        System.out.println(String.format("Temperatura atual: %.2f", term.getTempAtual()));
        
        term.exibeFahreinheit();
        
        term.diminuirTemperatura(60.00);
        
        System.out.println(String.format("Temperatura atual: %.2f", term.getTempAtual()));
        
        term.exibeFahreinheit();
    }
}
