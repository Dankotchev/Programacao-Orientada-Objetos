/*
 * The MIT License
 *
 * Copyright 2022 Danilo.
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
        System.out.println("Escolha a operacao desejada, informando o codigo correpondente.\n");
        System.out.println("1 -\tInserir dados das Disciplinas;");
        System.out.println("2 -\tInserir nota nas Disciplinas;");
        System.out.println("3 -\tInserir frequencia nas Disciplinas;");
        System.out.println("4 -\tApresentar Dados das Disciplinas;");
        System.out.println("5 -\tApresentar Situaçao em cada Disciplina;");
        System.out.println("6 -\tApresentar Médias das Disciplinas;");
        System.out.println("0 -\tEncerrar Sistema.\n");

        do {
            System.out.println("\tEscolha ==>   ");
            opcao = scanOpcao.nextInt();
        } while (opcao < 0 || opcao > 6);
        return opcao;
    }
}