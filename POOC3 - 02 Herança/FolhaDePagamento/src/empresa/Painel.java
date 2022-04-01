package empresa;

import empresa.util.MenuOperacoes;

public class Painel {

    public static void main(String[] args) {
        FolhaPagamento folha = new FolhaPagamento();
        MenuOperacoes menu = new MenuOperacoes();
        int opcao;

        do {
            opcao = menu.gerirMenu();
            switch (opcao) {
                case 1:
                    folha.cadFuncComum();
                    break;

                case 2:
                    folha.cadFuncComissionado();
                    break;

                case 3:
                    folha.cadFuncDiarista();
                    break;

                case 4:
                    System.out.println("Apresentando Funcionários");
                    folha.apresentar();
                    break;

                case 5:
                    System.out.println("\nO total recolhido de IR foi de R$ " 
                            + folha.totalIR());
                    break;

                case 6:
                    System.out.println("\nO total das contribuições ao INSS foi de R$ "
                            + folha.totalINSS());
                    break;

                case 7:
                    System.out.println("\nO total dos Salários Líquidos foi de R$ "
                            + folha.totalSalLiq());
                    break;
            }
        } while (opcao != 0);
    }
}
