package universidade;

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
                    geren.inserirInformacoes();
                    break;

                case 2:
                    geren.inserirNotas();
                    break;

                case 3:
                    geren.inserirFrequencia();
                    break;

                case 4:
                    geren.apresentarDados();
                    break;

                case 5:
                    geren.apresentarSituacao();
                    break;

                case 6:
                    geren.apresentarMedias();
                    break;

                case 0:
                    System.out.println("ENCERRANDO O SISTEMA");
                    break;
            }
        } while (opcao != 0);
    }
}