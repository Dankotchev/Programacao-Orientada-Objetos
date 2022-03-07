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

import java.util.Scanner;

/**
 *
 * @author Danilo Domingues Quirino
 */
public class Disciplina {

    // Atributos da Classe
    private String nome;
    private String sigla;
    private String professor;
    private float nota1;
    private float nota2;
    private float frequencia;

    // Gets
    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return nome;
    }

    public String getProfessor() {
        return professor;
    }

    public float getNota1() {
        return nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public float getFrequencia() {
        return frequencia;
    }

    // Metodos da Classe
    public void lerDados() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Informe o nome da Disciplina: ");
        nome = scan.nextLine();
        System.out.print("Informe a Sigla da Disciplina: ");
        sigla = scan.nextLine();
        System.out.print("Informe o nome do Professor: ");
        professor = scan.nextLine();
        System.out.println();
    }

    public void digitarNotas() {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nInforme a nota 01 :");
        nota1 = scan.nextFloat();
        System.out.print("\nInforme a nota 02 :");
        nota2 = scan.nextFloat();
    }

    public void entrarFrequencia() {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nInforme a Frequencia :");
        frequencia = scan.nextFloat();
    }

    public void apresentarDados() {
        System.out.println("\nApresentado os dados na Disciplina " + nome + "(" + sigla + "):");
        System.out.println("Professor: " + professor);
        System.out.println("Nota 01: " + nota1 + "\tNota 02: " + nota2);
        System.out.println("Frequência: " + frequencia);
    }

    public void apresentarSituacao() {
        float media;
        media = (nota1 + nota2) / 2;
        if (media >= 6 && frequencia >= 75) {
            System.out.println("Aluno Aprovado.");
        } else if (media >= 6 && frequencia < 75) {
            System.out.println("Retido por frequencia.");
        } else if (media < 6 && frequencia >= 75) {
            System.out.println("Retido por Nota.");
        }
    }

    public float retonarMedia() {
        float media = (nota1 + nota2) / 2;
        return media;
    }
}
