package utilidade;

import java.util.Scanner;

public class MenuOperacoes {

    public int gerirMenu() {
        int opcao;
        Scanner scanOpcao = new Scanner(System.in);
        System.out.println("----------\n\tGESTOR DE DISCIPLINAS");
        System.out.println("Escolha a operacao desejada, informando o codigo correpondente.");
        System.out.println("1 -\tInserir dados das Disciplinas;");
        System.out.println("2 -\tInserir nota nas Disciplinas;");
        System.out.println("3 -\tInserir frequencia nas Disciplinas;");
        System.out.println("4 -\tApresentar Dados das Disciplinas;");
        System.out.println("5 -\tApresentar Situaçao em cada Disciplina;");
        System.out.println("6 -\tApresentar Médias das Disciplinas;");
        System.out.println("0 -\tEncerrar Sistema.");

        do {
            System.out.print("\tEscolha ==>   ");
            opcao = scanOpcao.nextInt();
        } while (opcao < 0 || opcao > 6);
        return opcao;
    }
}