package interfaces;
public class Venda implements MovimentoCaixa{
    private int nNotaFiscal;
    private String clientes;
    private String formaPagto;
    private String dataVenda;
    private double valor;

    public Venda(int nNotaFiscal, String clientes, String formaPagto, String dataVenda, double valor) {
        this.nNotaFiscal = nNotaFiscal;
        this.clientes = clientes;
        this.formaPagto = formaPagto;
        this.dataVenda = dataVenda;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Venda{N# " + this.nNotaFiscal + " - Cliente: " + clientes +
                " - formaPagto: " + formaPagto + " - data Venda: " + dataVenda +
                " - Valor: R$ " + valor + '}';
    }   

    @Override
    public String getDescricao() {
        return dataVenda + " - Venda N# "+ nNotaFiscal + " - " + clientes + " - R$ " +
                valor;
           }

    @Override
    public double getValorCaixa() {
        return valor;
        }
}
