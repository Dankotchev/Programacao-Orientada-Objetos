package sistema.finaceiro;

import java.util.Scanner;
import sistema.contas.ContaCorrente;
import sistema.contas.ContaCorrenteEspecial;
import sistema.contas.ContaPoupanca;

public class Gerente {

    private int tamanho = 25;
    ContaCorrente[] contas = new ContaCorrente[this.tamanho];

    public void abrirContaCorrente() {
        int i = 0;
        boolean encontrou = false;

        do {
            if (this.contas[i] == null) {
                ContaCorrente cc = new ContaCorrente();
                System.out.println("\n:: Abertura de Conta:\n\tConta Corrente");
                cc.ler();
                this.contas[i] = cc;
                encontrou = true;
            }
            else {
                i++;
            }
        } while (i < this.tamanho && !encontrou);
    }

    public void abrirContaEspecial() {
        int i = 0;
        boolean encontrou = false;

        do {
            if (this.contas[i] == null) {
                ContaCorrenteEspecial cce = new ContaCorrenteEspecial();
                System.out.println("\n:: Abertura de Conta:\n\tConta Corrente Especial");
                cce.ler();
                this.contas[i] = cce;
                encontrou = true;
            }
            else {
                i++;
            }
        } while (i < this.tamanho && !encontrou);
    }

    public void abrirContaPoupanca() {
        int i = 0;
        boolean encontrou = false;

        do {
            if (this.contas[i] == null) {
                ContaPoupanca p = new ContaPoupanca();
                System.out.println("\n:: Abertura de Conta:\n\tConta Poupança");
                p.ler();
                this.contas[i] = p;
                encontrou = true;
            }
            else {
                i++;
            }
        } while (i < this.tamanho && !encontrou);
    }

    public void apresentarDados() {
        int posicao = this.encontrarConta();

        if (posicao != -1) {
            if (this.contas[posicao] instanceof ContaCorrenteEspecial) {
                System.out.println("\n:: Conta Corrente Especial ::");
            }
            else if (this.contas[posicao] instanceof ContaPoupanca) {
                System.out.println("\n::Conta Poupança ::");
            }
            else {
                System.out.println("\n:: Conta Corrente ::");
            }
            this.contas[posicao].apresentar();
        }
        else {
            System.out.println("\nConta informada não existe.");
        }
    }

    private int encontrarConta() {
        Scanner scan = new Scanner(System.in);
        String ag, ct;
        int posicao = -1;

        System.out.print("Informe o Número da Agencia: ");
        ag = scan.nextLine();
        System.out.print("Informe o Número da Conta: ");
        ct = scan.nextLine();

        for (int i = 0; i < tamanho && posicao == -1; i++) {
            if (this.contas[i].getnAgencia().equals(ag) && this.contas[i].getnConta().equals(ct)) {
                posicao = i;
            }
        }
        return posicao;
    }

    public void depositar() {
        Scanner scan = new Scanner(System.in);
        int posicao = this.encontrarConta();

        if (posicao != -1) {
            System.out.print("Informe o valor do Depósito: ");
            this.contas[posicao].atualizarSaldo(scan.nextDouble());
        }
        else {
            System.out.println("\nConta informada não existe.");
        }
    }

    public void sacar() {
        Scanner scan = new Scanner(System.in);
        int posicao = this.encontrarConta();;

        if (posicao != -1) {
            System.out.print("Informe o valor do Saque: ");
            if (this.contas[posicao].sacar(scan.nextDouble())) {
                System.out.println("Saque realizado.");
            }
            else {
                System.out.println("Saldo Indisponivel para Saque.");
            }
        }
        else {
            System.out.println("\nConta informada não existe.");
        }

    }

    public void trasferirEntreContas() {
        Scanner scan = new Scanner(System.in);
        double valor;
        int posicaoOrigem, posicaoDestino;

        System.out.println("Informe os Dados da conta de Origem dos Valores");
        posicaoOrigem = this.encontrarConta();

        if (posicaoOrigem != -1) {

            System.out.println("Informe os Dados da conta de Destino dos Valores");
            posicaoDestino = this.encontrarConta();

            if (posicaoDestino != -1) {
                System.out.print("Informe o valor da Transferência: ");
                valor = scan.nextDouble();
                if (this.contas[posicaoOrigem].sacar(valor)) {
                    this.contas[posicaoDestino].atualizarSaldo(valor);
                }
                else {
                    System.out.println("Saldo Indisponivel para Saque.");
                }
            }
            else {
                System.out.println("Conta informada não existe.");
            }
        }
        else {
            System.out.println("Conta informada não existe.");
        }
    }

    public void apresentarSaldo() {
        int posicao = this.encontrarConta();

        if (posicao != -1) {
            String valSaldo = String.format("%.2f", this.contas[posicao].getSaldo());
            System.out.println("Saldo atual da Conta: R$ " + valSaldo);
        }
        else {
            System.out.println("\nConta informada não existe.");
        }
    }

    public void remunerarPoupancas() {
        Scanner scan = new Scanner(System.in);
        double taxa;
        System.out.print("Informe o valor percentual a remunerar a conta poupança: ");
        taxa = scan.nextDouble();

        for (ContaCorrente conta : contas) {
            if (conta instanceof ContaPoupanca) {
                ((ContaPoupanca) conta).remunerar(taxa);
            }
        }
    }

    public void aplicarJurosContaEspecial() {
        for (ContaCorrente conta : contas) {
            if (conta instanceof ContaCorrenteEspecial) {
                ((ContaCorrenteEspecial) conta).aplicarJuros();
            }
        }
    }
}
