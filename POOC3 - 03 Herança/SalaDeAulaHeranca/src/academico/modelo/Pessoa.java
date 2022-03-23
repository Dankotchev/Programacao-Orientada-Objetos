package academico.modelo;

import java.util.Scanner;

public class Pessoa {

    private String cpf;
    private String nome;
    private String contato;
    private String email;

    public void lerDados() {
        Scanner scan = new Scanner(System.in);

        System.out.print("CPF ........: ");
        this.cpf = scan.nextLine();
        System.out.print("Nome .......: ");
        this.nome = scan.nextLine();
        System.out.print("Contato ....: ");
        this.contato = scan.nextLine();
        System.out.print("E-mail .....: ");
        this.email = scan.nextLine();
    }

    public void imprimirDados() {

        System.out.println("CPF ........: " + this.cpf);
        System.out.println("Nome .......: " + this.nome);
        System.out.println("Contato ....: " + this.contato);
        System.out.println("E-mail .....: " + this.email);
    }

}
