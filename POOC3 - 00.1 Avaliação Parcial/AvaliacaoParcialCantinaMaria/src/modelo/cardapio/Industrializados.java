package modelo.cardapio;

import java.util.Scanner;

public class Industrializados extends Alimentos {

    private String marca;
    private String sabor;

    @Override
    public void cad() {
        Scanner s = new Scanner(System.in);
        System.out.println("Produtos Industrializados :: ");
        super.cad();
        System.out.print("Marca: ");
        this.marca = s.nextLine();
        System.out.print("Sabor: ");
        this.sabor = s.nextLine();
    }

    @Override
    public void apresentar() {
        System.out.println("Código: " + getCodigo());
        System.out.println("Item: " + getNome() + " - " + this.marca + " - " + this.sabor);
        System.out.println("Valor: R$ " + getValor());
    }
}
