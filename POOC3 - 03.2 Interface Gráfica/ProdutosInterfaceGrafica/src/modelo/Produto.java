package modelo;

public class Produto {
    private int Codigo;
    private String descricao;
    private String marca;
    private double valor;
    private int estoque;

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public Produto(int Codigo, String descricao, String marca, double valor, int estoque) {
        this.Codigo = Codigo;
        this.descricao = descricao;
        this.marca = marca;
        this.valor = valor;
        this.estoque = estoque;
    }

    public Produto() {
    }
    
    public void vender (int qtd) {
        this.estoque -= qtd;
    }
    
    public void comprar(int qtd){
        this.estoque +=qtd;
    }
   
}
