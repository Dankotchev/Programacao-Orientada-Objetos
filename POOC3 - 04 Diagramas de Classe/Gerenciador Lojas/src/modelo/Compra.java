package modelo;

import modelo.interfaces.MovimentoFinanceiro;

public class Compra implements MovimentoFinanceiro{
    private int nrCompra;
    private String fornecedor;
    private int qtdComprada;
    private double valorCompra;

    public Compra() {
    }

    public Compra(int notaCompra, String fornecedor, int qtdComprada, double valorCompra) {
        this.nrCompra = notaCompra;
        this.fornecedor = fornecedor;
        this.qtdComprada = qtdComprada;
        this.valorCompra = valorCompra;
    }

    public int getNrCompra() {
        return nrCompra;
    }

    public void setNrCompra(int nrCompra) {
        this.nrCompra = nrCompra;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public int getQtdComprada() {
        return qtdComprada;
    }

    public void setQtdComprada(int qtdComprada) {
        this.qtdComprada = qtdComprada;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    @Override
    public String getTextoMovimento() {
        return "";
    }

    @Override
    public Double getValorMovimento() {
        return 0.0;
    }
    
    
}
