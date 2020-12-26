package cinema;

/**
 *
 * @author diego
 */
public class TesteCinema {

    public static void main(String[] args) {

        EntradaCinema entradaDiego = new EntradaCinema(15, 2, "Clube da luta", 20.00);
        EntradaCinema entradaCelia = new EntradaCinema(18, 2, "Clube da luta", 20.00);

        entradaDiego.calculaDesconto(10, true);
        entradaDiego.calculaDescontoHorairo();
        
        entradaCelia.calculaDesconto(22, false);
        entradaCelia.calculaDescontoHorairo();

        entradaDiego.exibeEntrada();
        entradaCelia.exibeEntrada();   
    }
}