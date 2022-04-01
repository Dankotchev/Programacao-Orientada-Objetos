package sistema.contas;

import java.util.Scanner;

public class ContaCorrente {

    private String nAgencia;
    private String nConta;
    private String nomeProprietario;
    private String contatoTelefone;
    private String contatoEmail;
    private String dataAbertura;
    private double saldo;


    public void ler() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe os dados para o cadastro:");
        System.out.print("Número da Agência ....: ");
        this.nAgencia = scan.nextLine();
        System.out.print("Número da Conta ......: ");
        this.nConta = scan.nextLine();
        System.out.print("Nome do Proprietário .: ");
        this.nomeProprietario = scan.nextLine();
        System.out.print("Contato Telefônico ...: ");
        this.contatoTelefone = scan.nextLine();
        System.out.print("Contato E-mail .......: ");
        this.contatoEmail = scan.nextLine();
        System.out.print("Data de Abertura .....: ");
        this.dataAbertura = scan.nextLine();
        System.out.print("Saldo Inicial ........: ");
        this.saldo = scan.nextDouble();
    }

    public void apresentar() {
        System.out.println("Número da Agência ....: " + this.nAgencia);
        System.out.println("Número da Conta ......: " + this.nConta);
        System.out.println("Nome do Proprietário .: " + this.nomeProprietario);
        System.out.println("Contato Telefônico ...: " + this.contatoTelefone);
        System.out.println("Contato E-mail .......: " + this.contatoEmail);
        System.out.println("Data de Abertura .....: " + this.dataAbertura);
    }

    public double getSaldo() {
        return this.saldo;
    }

    public String getnAgencia() {
        return nAgencia;
    }

    public String getnConta() {
        return nConta;
    }

    public void atualizarSaldo(double valorMonetario) {
        this.saldo += valorMonetario;
    }


    public boolean sacar(double saque) {
        if ((this.saldo - saque) < 0) {
            return false;
        }
        else {
            this.saldo -= saque;
            return true;
        }
    }

    public void transferir(String nAgenciaDestino, String nContaDestino) {

    }

}
