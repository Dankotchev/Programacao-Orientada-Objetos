package utilidade;

import java.util.Scanner;

public class MenuOperacoes {

    public int gerirMenu() {
        int opcao;
        Scanner scanOpcao = new Scanner(System.in);
        System.out.println("----------\n\tGESTOR DE DISCIPLINAS");
        System.out.println("Escolha a operacao desejada, informando o codigo correpondente.");
        System.out.println("1 -\tCadrastrar Funcionários;");
        System.out.println("2 -\tBuscar Holerite por Registro;");
        System.out.println("3 -\tApresentar Total da Folha Sde Pagamentos;");
        System.out.println("4 -\tApresentar Funcionários que fizeram Hora Extra;");
        System.out.println("5 -\tApresentar o Total dos pagamentos a Contribuição Previdenciária;");
        System.out.println("6 -\tApresentar o Total a ser recolhido de Imposto de Renda;");
        System.out.println("7 -\tRelatório de Funcionários por Departamentos;");
        System.out.println("0 -\tEncerrar Sistema.");

        do {
            System.out.print("\tEscolha ==>   ");   
            opcao = scanOpcao.nextInt();
        } while (opcao < 0 || opcao > 7);
        return opcao;
    }
}