package empresa;

import utilidade.MenuOperacoes;

public class Principal {

    public static void main(String[] args) {
        Gerenciador geren = new Gerenciador();
        MenuOperacoes menu = new MenuOperacoes();
        int opcao;

        do {
            opcao = menu.gerirMenu();
            switch (opcao) {
                case 1:
                    System.out.println("\nCadastro de Funcionários");
                    geren.cadastroFuncionarios();
                    break;

                case 2:
                    System.out.println("\nBusca de Holerite, por número de Registro ");
                    geren.buscaRegistro();
                    break;

                case 3:
                    geren.totalFolhaPagamento();
                    break;

                case 4:
                    System.out.println("\nFuncionários que realizaram Horas Extras");
                    geren.apresentarFuncionariosHoraExtra();
                    break;

                case 5:
                    geren.contribuicaoTotalINSS();
                    break;

                case 6:
                    geren.totalRecolherIR();
                    break;

                case 7:
                    System.out.println("\nRelatório por Departamento");
                    geren.relatorioDepartamento();
                    break;

                case 0:
                    System.out.println("\nENCERRANDO O SISTEMA.");
            }
        } while (opcao != 0);
    }
}
