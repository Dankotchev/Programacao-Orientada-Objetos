package modelo.cardapio;

import java.util.Scanner;

public class Alimentos {

    private int codigo;
    private String nome;
    private double valor;

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public void cad() {
        Scanner s = new Scanner(System.in);
        System.out.print("Codigo: ");
        this.codigo = s.nextInt();
        System.out.print("Nome: ");
        this.nome = s.nextLine();
        this.nome = s.nextLine();
        System.out.print("Valor: ");
        this.valor = s.nextDouble();

    }

    public void apresentar() {
    }

}
