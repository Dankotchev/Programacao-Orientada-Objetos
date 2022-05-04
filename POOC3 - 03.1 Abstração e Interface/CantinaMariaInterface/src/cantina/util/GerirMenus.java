package cantina.util;

import java.util.Scanner;

public class GerirMenus {

    public int opCad() {
        int op;
        Scanner s = new Scanner(System.in);

        System.out.println("SELECIONE O PRODUTO A SER CADASTRADO");
        System.out.println("1 -\tPratos e Porções da Maria");
        System.out.println("2 -\tBebidas");
        System.out.println("3 -\tProdutos Industrializados");
        System.out.println("0 -\tsair");

        do {
            System.out.print("\tEscolha ==> ");
            op = s.nextInt();
        } while (op < 0 || op > 3);
        return op;
    }

    public int opMenu() {
        int op;
        Scanner s = new Scanner(System.in);

        System.out.println("CANTINA DA MARIA");
        System.out.println("1 -\tCadastrar um novo Produto");
        System.out.println("2 -\tLivro de Receita de Maria");
        System.out.println("3 -\tQuantidade de diferentes tipos de Bebidas");
        System.out.println("4 -\tEstoque de Produtos");
        System.out.println("5 -\tAPRESENTAR CARDÁPIO");
        System.out.println("6 -\tFazer Pedido");
        System.out.println("0 -\tEncerrar Sistema");

        do {
            System.out.print("\tEscolha ==> ");
            op = s.nextInt();
        } while (op < 0 || op > 6);
        return op;
    }

}
