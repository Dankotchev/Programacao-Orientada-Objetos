package modelo;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Venda {

    private Date data;
    private double total;
    private String formaPgto;
    
    // Associação com a classe Cliente
    private Cliente cliente;
    
    // Composição de ItemVendas, pois uma venda é feita de 1 ou mais  itens vendidos
    private List<ItemVenda> listaItensVendas = new ArrayList<>();

    public Venda() {
        this.data = new Date();
    }

    public Venda(Date data, double total, String formaPgto) {
        this.data = data;
        this.total = total;
        this.formaPgto = formaPgto;
    }

    public Venda(double total, String formaPgto) {
        this.data = new Date();
        this.total = total;
        this.formaPgto = formaPgto;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getFormaPgto() {
        return formaPgto;
    }

    public void setFormaPgto(String formaPgto) {
        this.formaPgto = formaPgto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItemVenda> getListaItensVendas() {
        return listaItensVendas;
    }

    public void setListaItensVendas(List<ItemVenda> listaItensVendas) {
        this.listaItensVendas = listaItensVendas;
    }
        
    public void addItemVenda(Produto p, int quant, double valorUnitario){
        ItemVenda item = new ItemVenda(p, quant, valorUnitario);
        this.listaItensVendas.add(item);
    }
    
    public void addItemVenda(Produto p, int quant){
        ItemVenda item = new ItemVenda(p, quant);
        this.listaItensVendas.add(item);
    }
    
    public void removeItemVenda(int index){
        this.listaItensVendas.remove(index);
    }

    @Override
    public String toString() {
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

        return "Data: " + df.format(this.data)
                + this.cliente + " - "
                + " - Forma de Pagamento: " + nf.format(this.total)
                + " - Total da Venda: R$ " + formaPgto;
    }

}
