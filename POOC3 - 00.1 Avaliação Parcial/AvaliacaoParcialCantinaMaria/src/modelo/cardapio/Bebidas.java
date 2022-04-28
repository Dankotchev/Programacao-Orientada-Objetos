package modelo.cardapio;

import java.util.Scanner;

public class Bebidas extends Alimentos {

    private String marca;
    private String quantidade;

    @Override
    public void cad() {
        Scanner s = new Scanner(System.in);
        System.out.println("Bebidas :: ");
        super.cad();
        System.out.print("Marca: ");
        this.marca = s.nextLine();
        System.out.print("Quantidade ml: ");
        this.quantidade = s.nextLine();
    }

    public void apresentar() {
        System.out.println("Código: " + getCodigo());
        System.out.println("Item: " + getNome() + " - " + this.marca + " - " + this.quantidade + " ml");
        System.out.println("Valor: R$ " + getValor());
    }
}
