/*package patrimonio;

import java.util.Scanner;

public class SistemaPatrimonioVetor {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tamanho;
        double totalBens = 0;
        Bem bensPatrimoniados[];
        
        //Criando um vetor de Bens, com tamanho definido pelo usuario
        System.out.print("Quantos bens serão cadastrados? : ");
        tamanho = scan.nextInt();   
        bensPatrimoniados = new Bem[tamanho];
        //Cria um vetor de identificadores para objetos, e não objetos em si
        
        // Cadastrar Bens
        for (int i = 0; i < tamanho; i++) {
            //Crianção de um objeto e associando a posição i deste vetor
            bensPatrimoniados[i] = new Bem();
            bensPatrimoniados[i].preencherDados();
        }
        
        System.out.println("\n\nRelátorio de Bens Patrimoniados");
        for (int i = 0; i < tamanho; i++) {
            bensPatrimoniados[1].apresentarDados();
        }
        
        System.out.println("\n\nTotal em compras em Bens Patrimoniados");
        for (int i = 0; i < tamanho; i++) {
            totalBens = totalBens + bensPatrimoniados[i].getValorCompra();
        }
        System.out.println("Valor total: R$ " + totalBens);
        
        System.out.println("\n\nValor Atual em Bens Patrimoniados");
        totalBens = 0;
        for (int i = 0; i < tamanho; i++) {
            totalBens = totalBens + bensPatrimoniados[i].determinarValorAtual(0.15);
        }
        System.out.println("Valor Atual total: R$ " + totalBens);
    }
}
*/