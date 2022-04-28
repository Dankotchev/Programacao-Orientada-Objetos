/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entradasaida;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class PrimeiraClasse {

    public static void main(String[] args) {
        int inicio, fim;
        // Ler dados do teclado, inserir em uma variavel
        Scanner teclado = new Scanner(System.in);

        // Apresentar mensagem e ler uma variavel inteira
        System.out.print("Digite o valor inicial :: ");
        inicio = teclado.nextInt();

        System.out.print("Digite o valor final :: ");
        fim = teclado.nextInt();

        // Processamento: repetição usando o for, com uma decisao de ordenação
        if (inicio < fim) {
            for (int i = inicio; i <= fim; i++) {
                System.out.println("Numero: " + i);
            }
        } else {
            for (int i = inicio; i >= fim; i--) {
                System.out.println("Numero: " + i);
            }
        }
    }
}
