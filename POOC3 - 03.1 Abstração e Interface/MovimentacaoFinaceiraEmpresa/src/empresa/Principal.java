package empresa;

public class Principal {

    public static void main(String[] args) {
        ControleFinanceiro cfin = new ControleFinanceiro();
        GestorMenu gmenu = new GestorMenu();
        int opm;

        do {
            opm = gmenu.opPrincipal();
            switch (opm) {
                case 1:
                    cfin.incluirDespesa();
                    break;

                case 2:
                    System.out.println("\tListagem das Despesas :: ");
                    cfin.listarDespesas();
                    break;

                case 3:
                    cfin.incluirVendas();
                    break;

                case 4:
                    System.out.println("\tListagem das Vendas :: ");
                    cfin.listarVendas();
                    break;

                case 5:
                    cfin.incluirSalarios();
                    break;

                case 6:
                    System.out.println("\tListagem dos Pagamentos de Salários :: ");
                    cfin.listarSalarios();
                    break;

                case 7:
                    System.out.println("\tExtrato Financeiro :: ");
                    cfin.extrato();
                    break;

                case 0:
                    System.out.println("ENCERRANDO SISTEMA.");
                    break;
            }
        } while (opm != 0);
    }
}
