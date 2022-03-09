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
package universidade;

import utilidade.MenuOperacoes;

/**
 *
 * @author Danilo Domingues Quirino
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
                    geren.inserirInformacoes();
                    break;

                case 2:
                    geren.inserirNotas();
                    break;

                case 3:
                    geren.inserirFrequencia();
                    break;

                case 4:
                    geren.apresentarDados();
                    break;

                case 5:
                    geren.apresentarSituacao();
                    break;

                case 6:
                    geren.apresentarMedias();
                    break;

                case 0:
                    System.out.println("ENCERRANDO O SISTEMA");
                    break;
            }
        } while (opcao != 0);
    }
}