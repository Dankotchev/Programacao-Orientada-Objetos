package sistema.finaceiro.util;

import java.util.Scanner;

public class MenuOperacoes {

    public int gerirMenu() {
        Scanner scan = new Scanner(System.in);
        int opcao;

        System.out.println("");
        System.out.println("1 -\tAbrir Conta Corrente");
        System.out.println("2 -\tAbrir Conta Corrente ESpecial");
        System.out.println("3 -\tAbrir Conta Poupança");
        System.out.println("4 -\tApresentar Dados Cadastrais");
        System.out.println("5 -\tApresentar Saldo");
        System.out.println("6 -\tSacar Valores de uma Conta");
        System.out.println("7 -\tDepositar Valores em uma Conta");
        System.out.println("8 -\tTransferir Valores entre Contas");
        System.out.println("9 -\tRemunerar Contas Poupanças");
        System.out.println("10 -\tAplicar Juros do Cheque Especial");
        System.out.println("0 -\tEncerrar Sistema");

        do {
            System.out.print("\tEscolha ==>   ");
            opcao = scan.nextInt();
        } while (opcao < 0 || opcao > 10);
        return opcao;
    }
}
