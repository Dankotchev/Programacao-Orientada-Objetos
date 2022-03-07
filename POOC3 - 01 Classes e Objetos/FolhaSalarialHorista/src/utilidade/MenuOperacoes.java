/*
 * The MIT License
 *
 * Copyright 2022 Danilo Domingues Quirino.
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
package utilidade;

import java.util.Scanner;

/**
 *
 * @author Danilo Domingues Quirino
 */
public class MenuOperacoes {

    public int gerirMenu() {
        int opcao;
        Scanner scanOpcao = new Scanner(System.in);
        System.out.println("----------\n\tGESTOR DE DISCIPLINAS");
        System.out.println("Escolha a operacao desejada, informando o codigo correpondente.");
        System.out.println("1 -\tCadrastrar Funcionários;");
        System.out.println("2 -\tBuscar Holerite por Registro;");
        System.out.println("3 -\tApresentar Total da Folha Sde Pagamentos;");
        System.out.println("4 -\tApresentar Funcionários que fizeram Hora Extra;");
        System.out.println("5 -\tApresentar o Total dos pagamentos a Contribuição Previdenciária;");
        System.out.println("6 -\tApresentar o Total a ser recolhido de Imposto de Renda;");
        System.out.println("7 -\tRelatório de Funcionários por Departamentos;");
        System.out.println("0 -\tEncerrar Sistema.");

        do {
            System.out.print("\tEscolha ==>   ");   
            opcao = scanOpcao.nextInt();
        } while (opcao < 0 || opcao > 7);
        return opcao;
    }
}