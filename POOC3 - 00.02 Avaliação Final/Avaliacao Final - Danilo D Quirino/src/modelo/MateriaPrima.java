package modelo;
public class MateriaPrima {
    private String descricao;
    private int codigoMP;
    private int estoque;
    private double custo;

    @Override
    public String toString() {
        return ("Descrição: " + this.descricao + " Qtd:  " + this.getEstoque()
                + "Valor Unitário: " + this.getCusto());
    }
    public MateriaPrima(String descricao, int codigoMP, int estoque, double custo) {
        this.descricao = descricao;
        this.codigoMP = codigoMP;
        this.estoque = estoque;
        this.custo = custo;
    }

    public MateriaPrima() {
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCodigoMP() {
        return codigoMP;
    }

    public void setCodigoMP(int codigoMP) {
        this.codigoMP = codigoMP;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }
    
    
}
