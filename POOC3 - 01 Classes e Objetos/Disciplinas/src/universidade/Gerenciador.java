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

/**
 *
 * @author Danilo Domingues Quirino
 */
public class Gerenciador {

    private Disciplina[] dis;

    public void inicializar() {
        dis = new Disciplina[7];
    }

    public void inserirInformacoes() {
        System.out.println("\nInserir informações das Disciplinas");
        for (int i = 0; i < 7; i++) {
            dis[i] = new Disciplina();
            System.out.println("Disciplina #" + (i + 1));
            dis[i].lerDados();
        }
    }

    public void inserirNotas() {
        System.out.println("\nInserir Nota nas Disciplinas");
        for (int i = 0; i < 7; i++) {
            System.out.println("Disciplina " + dis[i].getNome());
            dis[i].digitarNotas();
        }
    }

    public void inserirFrequencia() {
        System.out.println("\nInserir Frequência nas Disciplinas");
        for (int i = 0; i < 7; i++) {
            System.out.println("Disciplina " + dis[i].getNome());
            dis[i].entrarFrequencia();
        }
    }

    public void apresentarDados() {
        System.out.println("\nApresentar Informações das Disciplinas");
        for (int i = 0; i < 7; i++) {
            System.out.println();
            dis[i].apresentarDados();
        }
    }

    public void apresentarSituacao() {
        System.out.println("\nApresentar Situação nas Disciplinas");
        System.out.println();
        for (int i = 0; i < 7; i++) {
            System.out.println("Disciplina " + dis[i].getNome()
                    + ": " + dis[i].apresentarSituacao());

        }
    }

    public void apresentarMedias() {
        System.out.println("\nApresentar Médias nas Disciplinas");
        for (int i = 0; i < 7; i++) {
            System.out.println("Disciplina " + dis[i].getNome()
                    + ": " + "Sua média foi de "
                    + dis[i].retonarMedia());
        }
    }
}