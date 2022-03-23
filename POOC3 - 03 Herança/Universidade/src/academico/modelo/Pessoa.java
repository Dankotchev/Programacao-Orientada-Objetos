package academico.modelo;

import java.util.Scanner;

public class Pessoa {

    private String prontuario;
    private String nome;

    public void ler() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe os dados .: ");
        System.out.print("Prontuario .......: ");
        this.prontuario = scan.nextLine();
        System.out.print("Nome .............: ");
        this.nome = scan.nextLine();
    }

    public void apresentar() {
        System.out.println("Dados informados .: ");
        System.out.println("Prontuario .......: " + this.prontuario);
        System.out.println("Nome .............: " + this.nome);
    }
}
