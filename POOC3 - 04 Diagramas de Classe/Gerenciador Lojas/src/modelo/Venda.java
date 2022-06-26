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
        return ("Nota fiscal: " + this.nrNF + ". Forma de Pagamento: " + this.formaPagto);
    }

    @Override
    public Double getValorMovimento() {
        double valor = 0;
        for (ItemVendido iv : listaIV) {
            valor += (iv.getQuantidadeVendida() * iv.getPrecoVenda());
        }
        return valor;
    }
}
