package modelo;

public class ItemVendido {

    private int quantidadeVendida;
    private double precoVenda;

    public ItemVendido(int quantidadeVendida, double precoVenda) {
        this.quantidadeVendida = quantidadeVendida;
        this.precoVenda = precoVenda;
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

}
