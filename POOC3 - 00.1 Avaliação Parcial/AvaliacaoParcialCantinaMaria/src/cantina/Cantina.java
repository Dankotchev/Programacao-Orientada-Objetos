package cantina;

public class Cantina {

    public static void main(String[] args) {
        Cozinha coz = new Cozinha();
        MenuOperacoes menu = new MenuOperacoes();

        int opcao, cadprod;

        do {
            opcao = menu.gerirMenu();
            switch (opcao) {
                case 1:
                    cadprod = menu.opcoesCad();

                    switch (cadprod) {
                        case 1:
                            coz.cadPP();
                            break;

                        case 2:
                            coz.cadBebidas();
                            break;

                        case 3:
                            coz.cadIndustrializado();
                            break;

                        case 0:
                            break;
                    }

                    break;

                case 2:
                    coz.apresentarLivroReceitas();
                    break;

                case 3:
                    System.out.println("\nNa Cantina da Maria há " + coz.qntBebidas() + " bebidas diferentes no cardápio");
                    break;

                case 4:
                    System.out.println("Apresentando o CARDÁPIO ");
                    coz.apresentarCardapio();
                    break;

                case 5:
                    System.out.println("\nRealizar uma venda ");
                    coz.realizarVenda();
                    break;

            }
        } while (opcao != 0);
    }
}
