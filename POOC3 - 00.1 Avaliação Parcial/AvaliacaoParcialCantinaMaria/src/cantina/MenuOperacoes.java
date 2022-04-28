package cantina;

import java.util.Scanner;

public class MenuOperacoes {

    public int gerirMenu() {
        Scanner scan = new Scanner(System.in);
        int opcao;

        System.out.println("CANTINA DA MARIA");
        System.out.println("1 -\tCadastrar um novo Produto");
        System.out.println("2 -\tLivro de Receita de Maria");
        System.out.println("3 -\tQuantidade de diferentes tipos de Bebidas");
        System.out.println("4 -\tAPRESENTAR CARDÁPIO");
        System.out.println("5 -\tFazer Pedido");
        System.out.println("0 -\tEncerrar Sistema");

        do {
            System.out.print("\tEscolha ==>   ");
            opcao = scan.nextInt();
        } while (opcao < 0 || opcao > 5);
        return opcao;
    }
    
    public int opcoesCad(){
        Scanner scan = new Scanner(System.in);
        int opcao;

        System.out.println("SELECIONE O PRODUTO A SER CADASTRADO");
        System.out.println("1 -\tPratos e Porções da Maria");
        System.out.println("2 -\tBebidas");
        System.out.println("3 -\tProdutos Industrializados");
        System.out.println("0 -\tsair");

        do {
            System.out.print("\tEscolha ==>   ");
            opcao = scan.nextInt();
        } while (opcao < 0 || opcao > 3);
        return opcao;
    }
}
