/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class TrabalhandoVetor {

    public static void main(String[] args) {
        int vet[] = new int[5];
        Scanner teclado = new Scanner(System.in);

        // Leitura do vetor
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + i + " valor:  ");
            vet[i] = teclado.nextInt();
        }

        for (int j = 0; j < 5; j++) {
            System.out.print(" " + vet[j] + ",");
        }
    }
}
