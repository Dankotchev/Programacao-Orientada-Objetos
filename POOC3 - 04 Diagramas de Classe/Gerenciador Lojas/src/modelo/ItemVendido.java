package modelo;

public class ItemVendido {

    private int quantidadeVendida;
    private double precoVenda;
    private int codProduto;

    public ItemVendido(int quantidadeVendida, double precoVenda, int codProduto) {
        this.quantidadeVendida = quantidadeVendida;
        this.precoVenda = precoVenda;
        this.codProduto = codProduto;
    }

    public ItemVendido() {
    }


    public int getQuantidadeVendida() {
        return quantidadeVendida;
    }

    public void setQuantidadeVendida(int quantidadeVendida) {
        this.quantidadeVendida = quantidadeVendida;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    
}
