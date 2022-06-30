package modelo;

import java.util.Date;
import modelo.interfaces.MovimentoFinanceiro;

public class Compra implements MovimentoFinanceiro {

    private int nrCompra;
    private String fornecedor;
    private int qtdComprada;
    private double valorCompra;
    private Date data;

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

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public String getTextoMovimento() {
        return ("Nr Compra: " + this.nrCompra + ". Fornecedor: " + this.fornecedor);
    }

    @Override
    public Double getValorMovimento() {
        return (-1) * (this.qtdComprada * this.valorCompra);
    }
}
