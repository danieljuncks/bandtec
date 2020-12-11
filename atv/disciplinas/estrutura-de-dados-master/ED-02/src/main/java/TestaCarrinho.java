import java.util.Scanner;

public class TestaCarrinho {
    public static void main(String[] args) {

        Carrinho carrinho = new Carrinho();

        Integer menu;
        Scanner leitor = new Scanner(System.in);
        System.out.println(" 1. Adiciona livro, \n 2. Adicionar DVD, \n 3. Adicionar Serviço, \n " +
                "4. Exibir itens do carrinho, \n 5. Exibir total de venda, \n 6. Fim \n Escolha uma das opções.");
        menu = leitor.nextInt();
        switch(menu){
            case 1:
                Livro livro1;
                Scanner leitor2 = new Scanner(System.in);
                System.out.println("Digite os dados do livro");
                Livro livro = new Livro(4, 30.5, "Frio", "Antonio", "Brasil");
                carrinho.adicionaVendavel(livro);
                break;
            case 2:
                System.out.println("Digite os dados do DVD");
                Dvd dvd = new Dvd(5, 50.5,"Jose", "Argentina");
                carrinho.adicionaVendavel(dvd);
                break;
            case 3:
                System.out.println("Digite os dados do Serviço");
                Servico servico = new Servico("Mao de obra",3, 10, 50.50);
                carrinho.adicionaVendavel(servico);
                break;
            case 4:
                System.out.println("Exibir itens do carrinho");
                carrinho.exibeItensCarrinho();
                break;
            case 5:
                System.out.println("Exibir total de vendas");
                carrinho.calculaTotalVenda();
                break;
            case 6:
                System.out.println("Fim.");
                break;
        }

    }


}
