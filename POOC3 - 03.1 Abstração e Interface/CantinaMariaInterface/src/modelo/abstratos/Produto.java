package modelo.abstratos;

import java.util.Scanner;
import modelo.interfaces.ItemCardapio;

public abstract class Produto implements ItemCardapio {

    protected int codigo;
    protected String nome;
    protected String marca;
    protected double valor;

    public void ler() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o nome");
        this.nome = teclado.nextLine();
        System.out.println("Digite a marca");
        this.marca = teclado.nextLine();
        System.out.println("Digite o valor");
        this.valor = teclado.nextDouble();
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void apresentar() {
        System.out.println("Codigo - " + this.codigo);
        this.getDescricao();
        System.out.println("Valor - " + this.valor); 
        
    }

    @Override
    public int getCodigo(){
        return this.codigo;
    }

    @Override
    public abstract String getDescricao();

    @Override
    public double getValor() {
        return this.valor;
    }
}
