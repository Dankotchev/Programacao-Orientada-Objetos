package modelo.funcionarios;

import java.util.Scanner;

public class FuncionarioComissionado extends FuncionarioBase {

    private float valorVendas;
    private float salarioBase;
    private float percentualVendas;

    @Override
    public void cad() {
        Scanner s = new Scanner(System.in);
        System.out.println("Funcionário Comissionado ::");
        super.cad();

        System.out.print("\tSalário Base ........: ");
        this.salarioBase = s.nextFloat();

        System.out.print("\tValor Total de Vendas: ");
        this.valorVendas = s.nextFloat();

        System.out.print("\tPercentual de Vendas : ");
        this.percentualVendas = s.nextFloat();

    }

    @Override
    public float getSalarioBruto() {
        return this.salarioBase + (this.valorVendas * (this.percentualVendas / 100));
    }
}
