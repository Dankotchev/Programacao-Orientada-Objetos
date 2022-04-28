package interfaces;

public class Funcionario implements MovimentoCaixa{

    private String mesAno;
    private String nome;
    private String data;
    private double valor;

    public Funcionario(String mesAno, String nome, String data, double valor) {
        this.mesAno = mesAno;
        this.nome = nome;
        this.data = data;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "mesAno=" + mesAno + " / nome: " + nome
                + " / data: " + data + " / valor: " + valor + '}';
    }

    @Override
    public String getDescricao() {
        return "sdasdad";
        }

    @Override
    public double getValorCaixa() {
        return 0;
        }

}
