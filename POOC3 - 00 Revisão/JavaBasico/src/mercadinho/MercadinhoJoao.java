package mercadinho;

import java.util.Scanner;

public class MercadinhoJoao {

    public static int lerVendas(float[] cesta) {
        Scanner lerValor = new Scanner(System.in);
        int n = 0;
        float valorProduto;

        System.out.println("Informe 0 para encerrar vendas");
        do {
            System.out.print("Informe o valor do produto: ");
            valorProduto = lerValor.nextFloat();
            if (valorProduto != 0) {
                cesta[n] = valorProduto;
                n++;
            }
        } while (valorProduto > 0);
        lerValor.close();
        return n;
    }

    public static float totalVenda(float[] cesta, int n) {
        float somaTotal = 0;

        for (int j = 0; j < n; j++) {
            somaTotal += cesta[j];
        }
        return somaTotal;
    }

    public static float precoMedio(float total, int n) {
        float media;
        media = total / n;
        return media;
    }

    public static void apresentarCompra(float[] cesta, int n) {
        for (int k = 0; k < n; k++) {
            System.out.println("O valor do Produto " + (k + 1) + ": R$ " + cesta[k]);
        }
    }

    public static float maiorValor(float[] cesta, int n) {
        float maior = cesta[0];
        for (int i = 1; i < n; i++) {
            if (maior < cesta[i]) {
                maior = cesta[i];
            }
        }
        return maior;
    }

    public static void main(String[] args) {
        float cesta[] = new float[10];
        int nQnt; // Identificador de quantidade de produtos na cesta

        nQnt = lerVendas(cesta);
        System.out.println("O total desta venda foi de R$: " + totalVenda(cesta, nQnt));
        System.out.println("O total de item na venda é de " + nQnt);
        System.out.println("O preço médio dos itens adquiridos é de R$ " + precoMedio((totalVenda(cesta, nQnt)), nQnt));
        apresentarCompra(cesta, nQnt);
        System.out.println("O produto mais caro custou R$ " + maiorValor(cesta, nQnt));

    }
}
