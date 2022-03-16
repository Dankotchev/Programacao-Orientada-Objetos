package universidade;

import java.util.Scanner;

public class Disciplina {

    // Atributos da Classe
    private String nome;
    private String sigla;
    private String professor;
    private float nota1;
    private float nota2;
    private float frequencia;

    public String getNome() {
        return nome;
    }
    
    // Metodos da Classe
    public void lerDados() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Informe o nome da Disciplina: ");
        nome = scan.nextLine();
        System.out.print("Informe a Sigla da Disciplina: ");
        sigla = scan.nextLine();
        System.out.print("Informe o nome do Professor: ");
        professor = scan.nextLine();
        System.out.println();
    }

    public void digitarNotas() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Informe a nota 01 : ");
        nota1 = scan.nextFloat();
        System.out.println();
        System.out.print("Informe a nota 02 : ");
        nota2 = scan.nextFloat();
    }

    public void entrarFrequencia() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Informe a Frequencia : ");
        frequencia = scan.nextFloat();
        System.out.println();
    }

    public void apresentarDados() {
        System.out.println("Informações da Disciplina - " 
                + nome + "[" + sigla + "]:");
        System.out.println("Professor: " + professor);
        System.out.println("Nota 01: " + nota1 + "\tNota 02: " + nota2);
        System.out.println("Frequência: " + frequencia);
    }

    public String apresentarSituacao() {
        float media;
        String sit = null;
        media = (nota1 + nota2) / 2;
        if (media >= 6 && frequencia >= 75) {
            sit = "Aluno Aprovado.";
            //System.out.println("Aluno Aprovado.");
        } else if (media >= 6 && frequencia < 75) {
            sit = "Retido por Frequência.";
            //System.out.println("Retido por frequencia.");
        } else if (media < 6 && frequencia >= 75) {
            sit = "Retido por Nota.";
            //System.out.println("Retido por Nota.");
        }
        return sit;
    }

    public float retonarMedia() {
        float media = (nota1 + nota2) / 2;
        return media;
    }
}
