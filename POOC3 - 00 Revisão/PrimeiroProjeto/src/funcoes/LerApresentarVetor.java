package funcoes;

import java.util.Scanner;

public class LerApresentarVetor {

    public static void lerVetor(int[] vetor) {
        Scanner teclado = new Scanner(System.in);
        // Leitura do vetor
        for (int i = 0; i < 5; i++) {
            System.out.print("F() Digite o " + i + " valor:  ");
            vetor[i] = teclado.nextInt();
        }
    }

    public static void apresentarVetor(int[] apresentar) {
        for (int j = 0; j < 5; j++) {
            System.out.print(" " + apresentar[j] + ",");
        }
    }

    public static int somarVetor(int[] somar) {
        int somatorio = 0;
        for (int k = 0; k < 5; k++) {
            somatorio += somar[k];
        }
        return somatorio;
    }

    public static void main(String[] args) {
        int vet[] = new int[5];
        //int total;
        lerVetor(vet);
        apresentarVetor(vet);
        //total = somarVetor(vet);
        System.out.println("");
        System.out.println("Asoma dos elemntos do vetor é " + somarVetor(vet));

    }
}
