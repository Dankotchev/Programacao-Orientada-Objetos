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
