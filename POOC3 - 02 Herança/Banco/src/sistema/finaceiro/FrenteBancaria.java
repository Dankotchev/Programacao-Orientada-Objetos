package sistema.finaceiro;

import sistema.finaceiro.util.MenuOperacoes;

public class FrenteBancaria {

    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        MenuOperacoes menu = new MenuOperacoes();
        int opcao;

        do {
            opcao = menu.gerirMenu();

            switch (opcao) {
                case 1:
                    gerente.abrirContaCorrente();
                    break;

                case 2:
                    gerente.abrirContaEspecial();
                    break;

                case 3:
                    gerente.abrirContaPoupanca();
                    break;

                case 4:
                    System.out.println("\nApresentar Dados Cadastrais:\n\tInforme a Conta a ser consultada");
                    gerente.apresentarDados();
                    break;

                case 5:
                    System.out.println("\nApresentar Saldo:\n\tInforme a Conta a ser consultada");
                    gerente.apresentarSaldo();
                    break;

                case 6:
                    System.out.println("\nSacar Valores:\n\tInforme a Conta desejada");
                    gerente.sacar();
                    break;

                case 7:
                    System.out.println("\nDepositar Valores:\n\tInforme a Conta desejada");
                    gerente.depositar();
                    break;

                case 8:
                    System.out.println("\nDepositar Valores:\n\tInforme a Conta desejada");
                    gerente.trasferirEntreContas();
                    break;

                case 9:
                    gerente.remunerarPoupancas();
                    break;

                case 10:
                    gerente.aplicarJurosContaEspecial();
                    System.out.println("\nJuros aplicados nas Contas Correntes Especiais.");
                    break;

                case 0:
                    System.out.println("\nENCERRAR SISTEMA");
                    break;
            }
        } while (opcao != 0);
    }
}
