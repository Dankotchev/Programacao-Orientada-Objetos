package empresa.util;

import java.util.Scanner;

public class MenuOperacoes {

    public int gerirMenu() {
        Scanner scan = new Scanner(System.in);
        int opcao;

        System.out.println("");
        System.out.println("1 -\tCadastrar Funcionário Comum");
        System.out.println("2 -\tCadastrar Funcionário Comissionado");
        System.out.println("3 -\tCadastrar Funcionário Diarista");
        System.out.println("4 -\tListar todos os Funcionários da Empresa");
        System.out.println("5 -\tApresentar total recolhido de Imposto de Renda");
        System.out.println("6 -\tApresentar total das contribuições ao INSS");
        System.out.println("7 -\tApresentar total dos Salários Líquidos");
        System.out.println("0 -\tEncerrar Sistema");

        do {
            System.out.print("\tEscolha ==>   ");
            opcao = scan.nextInt();
        } while (opcao < 0 || opcao > 7);
        return opcao;
    }
}
