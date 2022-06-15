package modelo;

import java.util.Date;
import modelo.interfaces.MovimentoFinanceiro;

public class Vendas implements MovimentoFinanceiro {
    private int nrNF;
    private Date data;
    private String formaPagto;

    public Vendas() {
    }

    public Vendas(int nrNF, Date data, String formaPagto) {
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
    
    @Override
    public String getTextoMovimento() {
        return "";
    }

    @Override
    public Double getValorMovimento() {
        return 0.0;
    }
    
}
