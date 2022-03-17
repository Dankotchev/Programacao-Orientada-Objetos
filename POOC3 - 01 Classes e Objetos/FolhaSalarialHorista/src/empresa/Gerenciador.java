package empresa;

import java.util.Scanner;

public class Gerenciador {

    private Funcionario[] func;
    private int tamanho = 10;

    public Gerenciador() {
        func = new Funcionario[tamanho];
        for (int i = 0; i < tamanho; i++) {
            func[i] = new Funcionario();
        }
    }

    private boolean verificarInclusao() {
        if (func[0].getNome() == null) {
            System.out.println("\nErro, funcionários não cadastrados.");
            return true;
        }
        else {
            return false;
        }
    }

    public void cadastroFuncionarios() {
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Funcionário #" + (i + 1));
            func[i].obterInformacoes();
        }
    }

    public void buscaRegistro() {
        Scanner scan = new Scanner(System.in);
        int registroBuscar;

        if (verificarInclusao()) {
        }
        else {
            System.out.print("Informe o Número de Registro desejado: ");
            registroBuscar = scan.nextInt();
            for (int i = 0; i < tamanho; i++) {
                if (func[i].getRegistro() == registroBuscar) {
                    func[i].apresentarDados();
                }
            }
        }
    }

    public void totalFolhaPagamento() {
        if (verificarInclusao()) {
        }
        else {
            System.out.println("\tApresentar o Total da Folha de Pagamentos");
            double totalFolha = 0;
            for (int i = 0; i < tamanho; i++) {
                totalFolha += func[i].getSalarioBruto();
            }
            String valTF = String.format("%.2f", totalFolha);
            System.out.println("O total da Folha de Pagamentos é de R$ " + valTF);
        }
    }

    public void apresentarFuncionariosHoraExtra() {
        if (verificarInclusao()) {
        }
        else {
            for (int i = 0; i < tamanho; i++) {
                if (func[i].getHoraExtraTrabalhada() != 0) {
                }
            }
        }
    }

    public void contribuicaoTotalINSS() {
        double valorTotal = 0;
        if (verificarInclusao()) {
        }
        else {
            for (int i = 0; i < tamanho; i++) {
                valorTotal += func[i].getContribuicaoINSS();
            }
            String valTotal = String.format("%.2f", valorTotal);
            System.out.println("\nO valor total de pagamentos à contribuição previdenciária é de R$ "
                    + valTotal);
        }
    }

    public void totalRecolherIR() {
        if (verificarInclusao()) {
        }
        else {
            double valorTotal = 0;
            for (int i = 0; i < tamanho; i++) {
                valorTotal += func[i].getRecolherIR();
            }
            String valTotal = String.format("%.2f", valorTotal);
            System.out.println("\nO valor total à recolher de Imposto de Renda é de R$ " + valTotal);
        }
    }

    public void relatorioDepartamento() {
        String departamentoEscolha = null;
        Scanner scan = new Scanner(System.in);

        if (verificarInclusao()) {
        }
        else {
            System.out.print("Informe o Departamento desejado: ");
            departamentoEscolha = scan.nextLine();
            for (int i = 0; i < tamanho; i++) {
                if (func[i].getDepartamento().equals(departamentoEscolha)) {
                    func[i].apresentarDepartamento();
                }
            }
        }
    }
}
