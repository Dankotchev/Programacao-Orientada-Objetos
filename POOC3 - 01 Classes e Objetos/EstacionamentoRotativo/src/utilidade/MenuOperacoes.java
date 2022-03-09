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
        System.out.println("----------\n\t### ROTATIVO ###");
        System.out.println("Escolha a operacao desejada, informando o codigo correpondente.");
        System.out.println("1 -\tCadastrar e Estacionar um Veículo;");
        System.out.println("2 -\tRetirar um veículo de uma vaga;");
        System.out.println("3 -\tRelatório: Situação atual do Rotativo;");
        System.out.println("4 -\tRelatório: Situação de uma Vaga;");
        System.out.println("5 -\tLocalizar: Veículo por Placa;");
        System.out.println("6 -\tLocalizar: Veículos por Marca e apresentar;");
        System.out.println("7 -\tRelatório: Quantidade de Veículos estacionados");
        System.out.println("8 -\tRelatório: Quantidade de Vagas livres");
        System.out.println("0 -\tEncerrar Sistema.");

        do {
            System.out.print("\tEscolha ==>   ");
            opcao = scanOpcao.nextInt();
        } while (opcao < 0 || opcao > 8);
        return opcao;
    }
}