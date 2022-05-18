package modelo;

import java.text.NumberFormat;

public class Produto {

    private int codigoBarras;
    private String nome;
    private double preco;

    public Produto() {
    }

    public Produto(int codigoBarras, String nome, double preco) {
        this.codigoBarras = codigoBarras;
        this.nome = nome;
        this.preco = preco;
    }

    public int getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(int codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        // Permite colocar formatação de valores numéricos
        // getCurrencyInstance >> pega o formato da moeda corrente
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        
        return "CodigoBarras: " + this.codigoBarras +
               " - Produto: " + this.nome +
               " - Preço: R$ " + nf.format(this.preco);
    }
    
    
}
