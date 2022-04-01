package academico.modelo;

import java.util.Scanner;

public class Aluno extends Pessoa {

    private String prontuario;
    private String curso;
    private int semestre;

    @Override
    public void lerDados() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Cadastrando um Aluno");

        System.out.print("Prontuario .: ");
        this.prontuario = scan.nextLine();

        super.lerDados();

        System.out.print("Curso ......: ");
        this.curso = scan.nextLine();
        System.out.print("Semestre ...: ");
        this.semestre = scan.nextInt();
    }

    @Override
    public void imprimirDados() {

        System.out.println("Apresentando um Aluno :: ");
        System.out.println("Prontuario .: " + this.prontuario);
        super.imprimirDados();
        System.out.println("Curso ......: " + this.curso);
        System.out.println("Semestre ...: " + this.semestre);
    }

}
