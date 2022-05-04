package cantina;

import cantina.util.GerirMenus;

public class Principal {

    public static void main(String[] args) {
        Cardapio cardapio = new Cardapio();
        GerirMenus gMenu = new GerirMenus();
        int op;

        do {
            op = gMenu.opMenu();
            switch (op) {
                case 1:
                    System.out.println("Selecionado: Cadastro de Produtos");
                    cardapio.cadastrarProduto();
                    break;

                case 2:
                    System.out.println("Selecionado: Livro de Receitas de Maria");
                    cardapio.apresentarReceitas();
                    break;

                case 3:
                    System.out.println("Selecionado: Apresentar quantidade de Bebidas");
                    System.out.println("\tAtualmente a cantina possui " + cardapio.qtdBebidas()
                            + " bebidas diferentes no cardápio.");
                    break;

                case 4:
                    System.out.println("Selecionado: Apresentar Estoque");
                    cardapio.apresentarEstoque();
                    break;

                case 5:
                    System.out.println("Selecionado: Apresentar o Cardápio");
                    cardapio.apresentarCardapio();
                    break;

                case 6:
                    System.out.println("Selecionado: Realizar Venda");
                    cardapio.venda();

                case 0:
                    System.out.println("ENCERRANDO O PROGRAMA");
            }
        } while (op != 0);

    }
}
