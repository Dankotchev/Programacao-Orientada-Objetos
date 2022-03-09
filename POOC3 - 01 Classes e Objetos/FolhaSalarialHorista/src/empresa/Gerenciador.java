/*
 * The MIT License
 *
 * Copyright 2022 Danilo Quirino.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package empresa;

import java.util.Scanner;

/**
 *
 * @author Danilo Domingues Quirino
 */
public class Gerenciador {

    private Funcionario[] func;
    private int tamanho = 1;

    public void inicializar() {
        func = new Funcionario[tamanho];

    }

    public void cadastroFuncionarios() {
        inicializar();
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Funcionário #" + (i + 1));
            func[i] = new Funcionario();
            func[i].obterInformacoes();
        }
    }

    public void buscaRegistro() {
        Scanner scan = new Scanner(System.in);
        int registroBuscar;

        System.out.print("Informe o Número de Registro desejado: ");
        registroBuscar = scan.nextInt();
        for (int i = 0; i < tamanho; i++) {
            if (func[i].getRegistro() == registroBuscar) {
                func[i].apresentarDados();
            }
        }
    }

    public void totalFolhaPagamento() {
        System.out.println("\tApresentar o Total da Folha de Pagamentos");
        double totalFolha = 0;
        for (int i = 0; i < tamanho; i++) {
            totalFolha += func[i].getSalarioBruto();
        }
        String valTF = String.format("%.2f", totalFolha);
        System.out.println("O total da Folha de Pagamentos é de R$ " + valTF);
    }

    public void apresentarFuncionariosHoraExtra() {
        for (int i = 0; i < tamanho; i++) {
            if (func[i].getHoraExtraTrabalhada() != 0) {

            }
        }
    }

    public void contribuicaoTotalINSS() {
        double valorTotal = 0;
        for (int i = 0; i < tamanho; i++) {
            valorTotal += func[i].getContribuicaoINSS();
        }
        String valTotal = String.format("%.2f", valorTotal);
        System.out.println("\nO valor total de pagamentos à contribuição previdenciária é de R$ "
                + valTotal);
    }

    public void totalRecolherIR() {
        double valorTotal = 0;
        for (int i = 0; i < tamanho; i++) {
            valorTotal += func[i].getRecolherIR();
        }
        String valTotal = String.format("%.2f", valorTotal);
        System.out.println("\nO valor total à recolher de Imposto de Renda é de R$ "
                + valTotal);
      
    }

    public void relatorioDepartamento() {
        String departamentoEscolha = null;
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o Departamento desejado: ");
        departamentoEscolha = scan.nextLine();
        for (int i = 0; i < tamanho; i++) {
            if (func[i].getDepartamento().equals(departamentoEscolha)) {
                func[i].apresentarDepartamento();
            }
        }
    }

}
