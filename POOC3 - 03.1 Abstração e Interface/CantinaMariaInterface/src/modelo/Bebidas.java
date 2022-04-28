package modelo;

import java.util.Scanner;
import modelo.abstratos.Produto;

public class Bebidas extends Produto {

    private int qntml;

    public void ler() {
        Scanner s = new Scanner(System.in);
        int codigo;

        System.out.println("Cadastrando bebidas - código 2000 a 2999");
        System.out.println("Digite o codigo");
        do {
            codigo = s.nextInt();
        } while (codigo < 2000 || codigo >= 3000);

        super.setCodigo(codigo);

        super.ler();

        System.out.println("Quantidade ml");
        this.qntml = s.nextInt();
    }

    @Override
    public String getDescricao() {
        return "Nome: " + super.nome + " - Marca: " + super.marca
                + " - Quantidade: " + this.qntml + "ml";
    }

}
