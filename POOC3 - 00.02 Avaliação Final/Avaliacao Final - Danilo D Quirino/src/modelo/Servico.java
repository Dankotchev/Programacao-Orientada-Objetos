package modelo;

public class Servico {
    private int codigoServico;
    private String descricao;
    private double horasServico;
    private double valorHora;

    public Servico(int codigoServico, String descricao, double horasServico, double valorHora) {
        this.codigoServico = codigoServico;
        this.descricao = descricao;
        this.horasServico = horasServico;
        this.valorHora = valorHora;
    }

    public Servico() {
    }

    public int getCodigoServico() {
        return codigoServico;
    }

    public void setCodigoServico(int codigoServico) {
        this.codigoServico = codigoServico;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getHorasServico() {
        return horasServico;
    }

    public void setHorasServico(double horasServico) {
        this.horasServico = horasServico;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    
    
}
