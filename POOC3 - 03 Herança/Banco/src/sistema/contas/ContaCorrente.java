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
    
    public void ler(){
        Scanner scan = new Scanner(System.in);
        System.out.println("\n:: Conta Corrente ::\nInforme os dados para o cadastro:"); // colocar no controle
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
    
    public void apresentar(){
        System.out.println("Número da Agência ....: " + this.nAgencia);
        System.out.println("Número da Conta ......: " + this.nConta);
        System.out.println("Nome do Proprietário .: " + this.nomeProprietario);
        System.out.println("Contato Telefônico ...: " + this.contatoTelefone);
        System.out.println("Contato E-mail .......: " + this.contatoEmail);
        System.out.println("Data de Abertura .....: " + this.dataAbertura);
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    
    public void depositar(double deposito){
        this.saldo += deposito;
    }
    
    public void sacar (double saque){
        if ((this.saldo - saque) < 0) {
            System.out.println("Saldo indisponível para saque.");
        }
        else{
            this.saldo -= saque;
        }
    }
    
    public void transferir(String nAgenciaDestino, String nContaDestino){
        
    }
    
    
    
    
    
    
    
}
