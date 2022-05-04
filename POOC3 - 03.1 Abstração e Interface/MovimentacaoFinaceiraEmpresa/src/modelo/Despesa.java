package modelo;

import java.util.Scanner;
import modelo.interfaces.Movimento;

public class Despesa implements Movimento {

    private int codigo;
    private String descricao;
    private double valor;
    private String data;

    @Override
    public String getMovimento() {
        return "Data: " + this.data + " - Despesa:  " + this.descricao + " - R$ "
                + this.valor + "\n";
    }

    @Override
    public double getValorMovimento() {
        return this.valor;
    }

    public void ler() {
        Scanner s = new Scanner(System.in);

        System.out.print("Código ....: ");
        this.codigo = s.nextInt();
        s.nextLine();

        System.out.print("Descrição .: ");
        this.descricao = s.nextLine();

        System.out.print("Valor .....: ");
        this.valor = s.nextDouble();
        s.nextLine();

        System.out.print("Data ......: ");
        this.data = s.nextLine();
        System.out.println("");

        if (this.valor > 0) {
            this.valor *= -1;
        }
    }

}
