package empresa;

import java.util.Scanner;

public class GestorMenu {

    public int opPrincipal() {
        int op;
        Scanner s = new Scanner(System.in);

        System.out.println("CONTROLE FINANCEIRO");
        System.out.println("1 -\tIncluir DESPESA");
        System.out.println("2 -\tListar  DESPESAS");
        System.out.println("3 -\tIncluir VENDA");
        System.out.println("4 -\tListar  VENDAS");
        System.out.println("5 -\tIncluir PAGAMENTO DE SALÁRIOS");
        System.out.println("6 -\tListar  PAGAMENTO DE SALÁRIOS");
        System.out.println("7 -\tApresentar EXTRATO FINANCEIRO");
        System.out.println("0 -\tEncerrar Sistema");

        do {
            System.out.print("\tEscolha ==>   ");
            op = s.nextInt();
        } while (op < 0 || op > 7);
        return op;
    }
}
