package sistema.contas;

import java.util.Scanner;

public class ContaCorrenteEspecial extends ContaCorrente {

    private double limiteUsado;
    private double taxaJuros;

    @Override
    public void ler() {
        Scanner scan = new Scanner(System.in);
        super.ler();
        System.out.print("Taxa de Juros do Cheque Especial: ");
        this.taxaJuros = scan.nextDouble();
    }

    @Override
    public void apresentar() {
        super.apresentar();
        System.out.println("Taxa de juros do Cheque Especial: " + this.taxaJuros);
    }

    @Override
    public boolean sacar(double saque) {
        super.atualizarSaldo((saque * (-1)));
        return true;
    }

    public void aplicarJuros() {

        if (super.getSaldo() < 0) {
            super.atualizarSaldo((super.getSaldo() * (this.taxaJuros / 100)));
        }
    }
}
