package rotativo;

import java.util.Scanner;
import utilidade.MenuOperacoes;

public class Principal {

    public static void main(String[] args) {
        Gerenciador grn = new Gerenciador();
        MenuOperacoes menu = new MenuOperacoes();
        int opcao;
        Scanner scan = new Scanner(System.in);

        do {
            opcao = menu.gerirMenu();
            switch (opcao) {
                case 1:
                    System.out.println("\nCadastrar e Estacionar um veículo:");
                    grn.estacionarVeiculo();
                    break;

                case 2:
                    System.out.println("\nLiberar uma vaga:");
                    System.out.print("Informe a vaga a ser desocupada: ");
                    grn.liberarVaga(scan.nextInt() - 1);
                    scan.nextLine();
                    break;

                case 3:
                    System.out.println("\nRelatório - Situação atual do Rotativo:");
                    grn.relatorioSituacaoAtual();
                    break;

                case 4:
                    System.out.println("Relatório - Situação de uma Vaga");
                    System.out.print("Informe o numero da vaga que deseja consultar: ");
                    grn.situacaoVaga(scan.nextInt() - 1);
                    scan.nextLine();
                    break;

                case 5:
                    System.out.println("\nLocalizar um Veículo atraves de sua Placa:");
                    System.out.print("Informe a Placa do Veículo:");
                    grn.localizarPlaca(scan.nextLine());
                    break;

                case 6:
                    System.out.println("\nLocalizar Veículos por Marca e Apresentar:");
                    System.out.println("Informe a Marca a ser procurada");
                    grn.localizarMarca(scan.nextLine());
                    break;

                case 7:
                    System.out.println("\nHá estacionados atualmente " + grn.qntVagasOcupadas()
                            + " veículos no estabelecimento.");
                    break;

                case 8:
                    System.out.println("\nHá atualmente " + grn.qntVagasDisponiveis()
                            + " vagas disponíveis no estacionamento.");
                    break;

                case 0:
                    System.out.println("\nENCERRANDO SISTEMA.");
                    break;
            }
        } while (opcao != 0);
    }
}
