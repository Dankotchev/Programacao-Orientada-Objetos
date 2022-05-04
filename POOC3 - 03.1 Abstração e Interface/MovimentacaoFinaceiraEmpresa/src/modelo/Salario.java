package modelo;

import java.util.Scanner;
import modelo.interfaces.Movimento;

public class Salario implements Movimento {

    private int prontuario;
    private String nome;
    private String mesAno;
    private String data;
    private double salario;

    @Override
    public String getMovimento() {
        return "Data: " + this.data + " - Pront: " + this.prontuario + " - Salário: "
                + this.nome + " - Referência: " + this.mesAno
                + " - Salário: R$ " + this.salario + "\n";
    }

    @Override
    public double getValorMovimento() {
        return this.salario;
    }

    public void ler() {
        Scanner s = new Scanner(System.in);

        System.out.print("Prontuário .: ");
        this.prontuario = s.nextInt();
        s.nextLine();

        System.out.print("Nome .......: ");
        this.nome = s.nextLine();

        System.out.print("Referência .: ");
        this.mesAno = s.nextLine();

        System.out.print("Data .......: ");
        this.data = s.nextLine();

        System.out.print("Salário ....: ");
        this.salario = s.nextDouble();
        System.out.println("");
        
        if (this.salario > 0) {
            this.salario *= -1;
        }

    }
}
