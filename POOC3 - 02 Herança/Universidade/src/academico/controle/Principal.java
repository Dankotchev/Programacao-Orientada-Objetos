package academico.controle;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Gerenciador grn = new Gerenciador();
        MenuOperacoes menu = new MenuOperacoes();
        Scanner scan = new Scanner(System.in);
        int opcao;

        do {
            opcao = menu.gerirMenu();

            switch (opcao) {
                case 1:
                    grn.alunoInserir();
                    break;

                case 2:
                    grn.professorInserir();
                    break;

                case 3:
                    grn.tecnicoAdmInserir();
                    break;

                case 4:
                    grn.apresentarUniversidade();
                    break;

                case 0:
                    System.out.println("\nEncerrando o Sistema");
                    break;
            }

        } while (opcao != 0);
    }
}
