package academico.controle;

import java.util.Scanner;

public class MenuOperacoes {

    public int gerirMenu() {
        Scanner scan = new Scanner(System.in);
        int opcao;

        System.out.println("");
        System.out.println("1 -\tCadastrar Aluno");
        System.out.println("2 -\tCadastrar Professor");
        System.out.println("3 -\tCadastrar Técnico Administrativo");
        System.out.println("4 -\tListar todas as pessoas da Universidade");
        System.out.println("0 -\tEncerrar Sistema");
        opcao = scan.nextInt();

        do {
            System.out.print("\tEscolha ==>   ");
            opcao = scan.nextInt();
        } while (opcao < 0 || opcao > 4);
        return opcao;
    }
}
