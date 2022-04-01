package sistema.contas;

public class ContaPoupanca extends ContaCorrente {

    public void remunerar(double percentual) {
        super.atualizarSaldo(super.getSaldo() * (percentual / 100));
    }
}