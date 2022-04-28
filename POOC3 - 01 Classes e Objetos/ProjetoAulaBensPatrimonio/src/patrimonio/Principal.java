package patrimonio;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tamanho;
        SistemaGerenciador sgerencial;

        System.out.print("Quantos bens serão cadastrados? : ");
        tamanho = scan.nextInt();
        sgerencial = new SistemaGerenciador(tamanho);
        //sgerencial.iniciar(tamanho);

        sgerencial.cadastrarBens();
        sgerencial.apresentarRelatorio();       // Apresentar o metodo padrão
        sgerencial.apresentarRelatorio(1);      // Apresentar o metodo quantidade
        sgerencial.apresentarRelatorio(25.0);   // Apresentar o metodo de Valores
        System.out.println("\n\nTotal em compras em Bens Patrimoniados: R$ "
                + sgerencial.calcularValorBens());

        System.out.println("\n\nValor Atual em Bens Patrimoniados: R$ "
                + sgerencial.calcularValorAtual());
    }
}
