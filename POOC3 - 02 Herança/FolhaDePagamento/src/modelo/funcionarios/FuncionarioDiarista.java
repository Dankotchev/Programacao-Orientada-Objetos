package modelo.funcionarios;

import java.util.Scanner;

public class FuncionarioDiarista extends FuncionarioBase {

    private int diasTrabalhados;
    private float valorDiaria;

    @Override
    public void cad() {
        Scanner s = new Scanner(System.in);
        System.out.println("Funcionário diarista ::");
        super.cad();

        System.out.print("\tQnt Dias Trabalhados : ");
        this.diasTrabalhados = s.nextInt();

        System.out.print("\tValor Diaria ........: ");
        this.valorDiaria = s.nextFloat();
    }

    @Override
    public float getSalarioBruto() {
        return this.valorDiaria * this.diasTrabalhados;
    }

}
