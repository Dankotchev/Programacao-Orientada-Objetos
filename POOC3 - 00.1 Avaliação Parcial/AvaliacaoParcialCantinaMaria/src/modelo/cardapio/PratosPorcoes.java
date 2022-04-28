package modelo.cardapio;

import java.util.ArrayList;
import java.util.Scanner;

public class PratosPorcoes extends Alimentos {

    private String descricao;
    private String serve;
    private ArrayList<String> ingredientes;

    @Override
    public void cad() {
        Scanner s = new Scanner(System.in);
        System.out.println("Pratos e Porções :: ");
        super.cad();
        System.out.print("Descrição: ");
        this.descricao = s.nextLine();
        System.out.print("Serve: ");
        this.serve = s.nextLine();
        this.inserirIngredientes();

    }

    private void inserirIngredientes() {
        Scanner s = new Scanner(System.in);
        this.ingredientes = new ArrayList<>();

        int adicionar;
        int ordem = 1;
        String item = null;

        System.out.println("\nInformes os ingredientes para o preparo do Prato "
                + getNome() + ":");

        do {

            System.out.print("Ingrediente " + ordem + ": ");
            item = s.nextLine();
            this.ingredientes.add(item);
            ordem ++;

            System.out.println("Para adicionar um novo ingrediente, digite 1");
            System.out.println("Para encerra, digite 0");
            System.out.print(":: ");
            adicionar = s.nextInt();
            item = s.nextLine();

        } while (adicionar == 1);

    }

    @Override
    public void apresentar() {
        System.out.println("Código: " + getCodigo());
        System.out.println("Item: " + getNome() + " - " + this.descricao + " - Serve " + this.serve + " pessoas");
        System.out.println("Valor: R$ " + getValor());
    }

    public void apresentarReceita() {
        int ordem = 1;
        for (String ingrediente : this.ingredientes) {
            System.out.println("#" + ordem + " - " + ingrediente);
            ordem++;
        }
    }

}
