package modelo;

import java.util.Date;
import java.util.List;

public class Orcamento {

    private List<MateriaPrima> listaItens;
    private List<Servico> listaServicos;
    private int codigoOrcamento;
    private int codigoCliente;
    private Date dataAprovacao;

    @Override
    public String toString() {
        return ("Orçamento N# " + this.codigoOrcamento + " - Cliente N#: "
                + this.codigoCliente);
    }

    public Orcamento(List<MateriaPrima> listaItens, List<Servico> listaServicos, int codigoOrcamento, int codigoCliente, Date dataAprovacao) {
        this.listaItens = listaItens;
        this.listaServicos = listaServicos;
        this.codigoOrcamento = codigoOrcamento;
        this.codigoCliente = codigoCliente;
        this.dataAprovacao = dataAprovacao;
    }

    public Orcamento() {
    }

    public List<MateriaPrima> getListaItens() {
        return listaItens;
    }

    public void setListaItens(List<MateriaPrima> listaItens) {
        this.listaItens = listaItens;
    }

    public List<Servico> getListaServicos() {
        return listaServicos;
    }

    public void setListaServicos(List<Servico> listaServicos) {
        this.listaServicos = listaServicos;
    }

    public int getCodigoOrcamento() {
        return codigoOrcamento;
    }

    public void setCodigoOrcamento(int codigoOrcamento) {
        this.codigoOrcamento = codigoOrcamento;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public Date getDataAprovacao() {
        return dataAprovacao;
    }

    public void setDataAprovacao(Date dataAprovacao) {
        this.dataAprovacao = dataAprovacao;
    }

}
