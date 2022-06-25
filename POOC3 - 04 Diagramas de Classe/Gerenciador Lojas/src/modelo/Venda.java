package modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import modelo.interfaces.MovimentoFinanceiro;

public class Venda implements MovimentoFinanceiro {

    private int nrNF;
    private Date data;
    private String formaPagto;
    private List<ItemVendido> listaIV = new ArrayList<>();

    public Venda() {
    }

    public Venda(int nrNF, Date data, String formaPagto) {
        this.nrNF = nrNF;
        this.data = data;
        this.formaPagto = formaPagto;
    }

    public int getNrNF() {
        return nrNF;
    }

    public void setNrNF(int nrNF) {
        this.nrNF = nrNF;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getFormaPagto() {
        return formaPagto;
    }

    public void setFormaPagto(String formaPagto) {
        this.formaPagto = formaPagto;
    }

    public List<ItemVendido> getListaIV() {
        return listaIV;
    }

    public void setListaIV(List<ItemVendido> listaIV) {
        this.listaIV = listaIV;
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
