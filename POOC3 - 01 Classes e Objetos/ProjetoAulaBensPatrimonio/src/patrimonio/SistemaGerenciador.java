package patrimonio;

import java.util.Scanner;

public class SistemaGerenciador {

    private Bem[] bensPatrimoniados;
    int tamanho;

    // Construtor da classe SistemaGerenciador
    // trecho de código s ser executado quando o objeto dessa classe é criado
    // e tem como objetivo inicializar alguns atributos dessa clase
    public SistemaGerenciador(int tamanho) {
        System.out.println("Um objeto foi criado");
        iniciar(tamanho);
        System.out.println("Foi criado um vetor de tamanho " + tamanho);
    }

    public SistemaGerenciador() {
        System.out.println("Um objeto foi criado com o construtor padrão");
        iniciar(10);
        System.out.println("Foi criado um vetor de tamanho " + tamanho);
    }

    private void iniciar(int tamanho) {
        this.tamanho = tamanho;
        bensPatrimoniados = new Bem[tamanho];
    }

    public void cadastrarBens() {
        for (int i = 0; i < tamanho; i++) {
            //Crianção de um objeto e associando a posição i deste vetor
            bensPatrimoniados[i] = new Bem();
            bensPatrimoniados[i].preencherDados();
        }
    }

    public void apresentarRelatorio() {
        System.out.println("\n\nRelátorio de Bens Patrimoniados");
        for (int i = 0; i < tamanho; i++) {
            bensPatrimoniados[i].apresentarDados();
        }
    }

    public void apresentarRelatorio(int quantidade) {
        if (quantidade > tamanho) {
            quantidade = tamanho;
        }
        System.out.println("\n\nRelátorio de Bens Patrimoniados");
        System.out.println("Apresentando os primeiros " + quantidade + "inseridos");
        for (int i = 0; i < quantidade; i++) {
            bensPatrimoniados[i].apresentarDados();
        }
    }

    public void apresentarRelatorio(double valorMaximo) {
        String valMAX = String.format("%.2f", valorMaximo);

        System.out.println("\n\nRelátorio de Bens Patrimoniados");
        System.out.println("Apresentando bens com Valor de Compra inferior a R$ "
                + valMAX);
        for (int i = 0; i < tamanho; i++) {
            if (bensPatrimoniados[i].getValorCompra() == valorMaximo) {
                bensPatrimoniados[i].apresentarDados();
            }
        }
    }

    public double calcularValorBens() {
        double totalBens = 0;
        for (int i = 0; i < tamanho; i++) {
            totalBens = totalBens + bensPatrimoniados[i].getValorCompra();
        }
        return totalBens;
    }

    public double calcularValorAtual() {
        double totalAtualBens = 0;
        for (int i = 0; i < tamanho; i++) {
            totalAtualBens = totalAtualBens
                    + bensPatrimoniados[i].determinarValorAtual(0.15);
        }
        return totalAtualBens;
    }

}
