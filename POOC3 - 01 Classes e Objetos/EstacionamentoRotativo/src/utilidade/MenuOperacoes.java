package utilidade;

import java.util.Scanner;

public class MenuOperacoes {

    public int gerirMenu() {
        int opcao;
        Scanner scanOpcao = new Scanner(System.in);
        System.out.println("----------\n\t### ROTATIVO ###");
        System.out.println("Escolha a operacao desejada, informando o codigo correpondente.");
        System.out.println("1 -\tCadastrar e Estacionar um Veículo;");
        System.out.println("2 -\tRetirar um veículo de uma vaga;");
        System.out.println("3 -\tRelatório: Situação atual do Rotativo;");
        System.out.println("4 -\tRelatório: Situação de uma Vaga;");
        System.out.println("5 -\tLocalizar: Veículo por Placa;");
        System.out.println("6 -\tLocalizar: Veículos por Marca e apresentar;");
        System.out.println("7 -\tRelatório: Quantidade de Veículos estacionados");
        System.out.println("8 -\tRelatório: Quantidade de Vagas livres");
        System.out.println("0 -\tEncerrar Sistema.");

        do {
            System.out.print("\tEscolha ==>   ");
            opcao = scanOpcao.nextInt();
        } while (opcao < 0 || opcao > 8);
        return opcao;
    }
}