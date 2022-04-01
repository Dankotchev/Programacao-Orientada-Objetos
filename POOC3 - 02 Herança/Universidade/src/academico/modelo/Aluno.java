package academico.modelo;

import java.util.Scanner;

public class Aluno extends Pessoa {
    private String curso;
    private String semestreAno;
    
    public Aluno(){
        this.ler();
    }
    
    @Override
    public void ler(){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("\n:: Aluno Selecionado ::");
        super.ler();
        System.out.print("Curso ............: ");
        this.curso = scan.nextLine();
        System.out.print("Semestre e Ano ...: ");
        this.semestreAno = scan.nextLine();
    }
    
    @Override
    public void apresentar(){
        System.out.println("\nAluno :: ");
        super.apresentar();        
        System.out.println("Curso ............: " + this.curso);
        System.out.println("Semestre e Ano ...: " + this.semestreAno);
    }
}
