package modelo;

import java.text.NumberFormat;

public class ItemVenda {

    private int quant;
    private double valorUnitario;
    private Produto produto;

    public ItemVenda() {
    }

    public ItemVenda(int quant, double valorUnitario) {
        this.quant = quant;
        this.valorUnitario = valorUnitario;
    }

    public ItemVenda(Produto produto, int quant, double valorUnitario) {
        this.quant = quant;
        this.valorUnitario = valorUnitario;
        this.produto = produto;
    }

    // 
    public ItemVenda(Produto produto, int quant) {
        this.quant = quant;
        this.valorUnitario = produto.getPreco();
        this.produto = produto;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        return "Produto: " + this.produto.getNome()
                + " - Código de Barras: " + this.produto.getCodigoBarras()
                + " - Quantidade: " + this.quant
                + " - Valor Unitário: R$ " + nf.format(this.valorUnitario);
    }

}
