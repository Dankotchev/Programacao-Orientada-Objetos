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

import utilidade.MenuOperacoes;

/**
 *
 * @author Danilo Quirino
 */
public class Principal {

    public static double totalFolhaPagamento(Funcionario[] folha) {
        double totalFolha = 0;
        for (int i = 0; i < 10; i++) {
            totalFolha += folha[i].getSalarioBruto();
        }
        return totalFolha;
    }

    public static void apresentarFuncionariosHoraExtra(Funcionario[] func) {
        for (int i = 0; i < 10; i++) {
            if (func[i].getHoraExtraTrabalhada() != 0) {
                System.out.println("Nome: " + func[i].getNome());
                System.out.println("Registro: " + func[i].getRegistro());
                System.out.println("Horas Extras Trabalhadas: "
                        + func[i].getHoraExtraTrabalhada());
                System.out.println("Valor recebido em Horas Extras: "
                        + func[i].getValorTotalHoraExtra());
            }
        }
    }

    public static double contribuicaoTotalINSS(Funcionario[] inss) {
        double valorTotal = 0;
        for (int i = 0; i < 10; i++) {
            valorTotal += inss[i].getContribuicaoINSS();
        }
        return valorTotal;
    }

    public static double totalRecolherIR(Funcionario[] inss) {
        double valorTotal = 0;
        for (int i = 0; i < 10; i++) {
            valorTotal += inss[i].getRecolherIR();
        }
        return valorTotal;
    }

    public static void main(String[] args) {
        Funcionario func[] = new Funcionario[10];
        MenuOperacoes menu = new MenuOperacoes();
        int opcao;

        do {
            opcao = menu.gerirMenu();
            switch (opcao) {
                case 1:
                    System.out.println("\nCadastro de Funcionários");
                    for (int i = 0; i < 10; i++) {
                        System.out.println("Funcionário #" + (i + 1));
                        func[i] = new Funcionario();
                        func[i].obterInformacoes();
                    }
                    break;

                case 2:
                    System.out.println("\nBusca de Holerite, por número ");
                    break;

                case 3:
                    System.out.println("\tApresentar o Total da Folha de Pagamentos");
                    System.out.println("O total da Folha de Pagamentos é de R$ "
                            + totalFolhaPagamento(func));
                    break;

                case 4:
                    System.out.println("\nFuncionários que realizaram Horas Extras");
                    apresentarFuncionariosHoraExtra(func);
                    break;

                case 5:
                    System.out.println("\nO valor total de pagamentos à contribuição previdenciária é de R$ "
                            + contribuicaoTotalINSS(func));
                    break;

                case 6:
                    System.out.println("\nO valor total à recolher de Imposto de Renda é de R$ "
                            + totalRecolherIR(func));
                    break;

                case 7:
                    System.out.println("\nRelatório por Departamento");
                    break;
            }
        } while (opcao != 0);
    }
}
