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
package universidade;

import utilidade.MenuOperacoes;

/**
 *
 * @author Danilo Domingues Quirino
 */
public class Principal {

    public static void main(String[] args) {
        Disciplina dis[] = new Disciplina[7];
        MenuOperacoes menu = new MenuOperacoes();
        int opcao;

        do {
            opcao = menu.gerirMenu();
            switch (opcao) {
                case 1:
                    System.out.println("Inserir informações das Disciplinas");
                    for (int i = 0; i < 7; i++) {
                        System.out.println();
                        dis[i] = new Disciplina();
                        dis[i].lerDados();
                    }
                    break;

                case 2:
                    System.out.println("Inserir Nota nas Disciplinas");
                    for (int i = 0; i < 7; i++) {
                        System.out.println();
                        dis[i].digitarNotas();
                    }
                    break;

                case 3:
                    System.out.println("Inserir Frequência nas Disciplinas");
                    for (int i = 0; i < 7; i++) {
                        System.out.println();
                        dis[i].entrarFrequencia();
                    }
                    break;

                case 4:
                    System.out.println("Apresentar Informações das Disciplinas");
                    for (int i = 0; i < 7; i++) {
                        System.out.println();
                        dis[i].apresentarDados();
                    }
                    break;

                case 5:
                    System.out.println("Apresentar Situação nas Disciplinas");
                    for (int i = 0; i < 7; i++) {
                        System.out.println();
                        dis[i].apresentarSituacao();
                    }
                    break;

                case 6:
                    System.out.println("Apresentar Médias nas Disciplinas");
                    for (int i = 0; i < 7; i++) {
                        System.out.println();
                        dis[i].retonarMedia();
                    }
                    break;

                case 0:
                    System.out.println("ENCERRANDO O SISTEMA");
                    break;
            }
        } while (opcao != 0);
    }
}