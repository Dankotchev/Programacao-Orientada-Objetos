package interfaces;

public class Compra implements MovimentoCaixa{

    private String fornecedor;
    private String dataCompra;
    private String dataEntrega;
    private String dataPagto;
    private String descricao;
    private double valor;

    public Compra(String fornecedor, String dataCompra, String dataEntrega, String dataPagto, String descricao, double valor) {
        this.fornecedor = fornecedor;
        this.dataCompra = dataCompra;
        this.dataEntrega = dataEntrega;
        this.dataPagto = dataPagto;
        this.descricao = descricao;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Compra{" + "fornecedor: " + fornecedor + " / dataCompra: " + dataCompra
                + " / dataEntrega: " + dataEntrega + " / dataPagto: " + dataPagto
                + " / descricao: " + descricao + " / valor: " + valor + '}';
    }

    @Override
    public String getDescricao() {
        return dataCompra + " - Compra: " + fornecedor + " - R$ " + valor;
    }

    @Override
    public double getValorCaixa() {
        return -valor;
    }

}
