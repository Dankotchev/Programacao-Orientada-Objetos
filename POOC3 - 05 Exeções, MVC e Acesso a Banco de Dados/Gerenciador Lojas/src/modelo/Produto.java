package modelo;

public class Produto implements Cloneable {

    private int codigo;
    private String descricao;
    private int quantidade;
    private double valorVenda;
    private double valorCusto;

    public void efetuarCompra(int quantidade, double novoValorCusto) {
        this.quantidade += quantidade;
        this.valorCusto = novoValorCusto;
        this.valorVenda = (2.20 * this.valorCusto);
    }

    public void efetuarVenda(int quantidade) {
        this.quantidade -= quantidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public double getValorCusto() {
        return valorCusto;
    }

    public void setValorCusto(double valorCusto) {
        this.valorCusto = valorCusto;
    }

    @Override
    public Produto clone() throws CloneNotSupportedException {
        return (Produto) super.clone();
    }
}
