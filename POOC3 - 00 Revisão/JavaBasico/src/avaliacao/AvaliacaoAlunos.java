
package avaliacao;

import java.util.Scanner;

import javax.print.event.PrintEvent;

public class AvaliacaoAlunos {

    public static void preencherNotas(float[] alunos) {
        Scanner lerNota = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Informe a nota do aluno n# " + i + ": ");
            alunos[i] = lerNota.nextFloat();
        }
    }

    public static int separarAprovadosExames(float[] alunos, float[] exames, float[]aprovados ){
        int nExames = 0, nAprovados = 0;

        for (int i = 0; i < 10; i++) {
            if (alunos[i] < 6) {
                exames[nExames] = alunos[i];
                nExames++;
            }
            else {
                aprovados[nAprovados] = alunos[i];
                nAprovados++;
            }
        }
        return nExames;
    }

    public static void apresentarNotas (float[] alunos, int qnt)
    {
        for (int i = 0; i < qnt; i++) {
            System.out.println(alunos[i]);
        }
    }
    
    
    
    
    
    
    public static void main(String[] args) {
        float vetorAlunos[] = new float[10];
        float vetorExames[] = new float[10];
        float vetorAprovados[] = new float[10];
        int nExames, nAprovados;

        preencherNotas(vetorAlunos);
        nExames = separarAprovadosExames(vetorAlunos, vetorExames, vetorAprovados);
        nAprovados = 10 - nExames;
        System.out.println("Os alunos que ficaram em exame foram os que tirara as notas: "); 
        apresentarNotas(vetorExames, nExames);
        System.out.println("Os alunos que foram aprovados tiveram as notas: "); 
        apresentarNotas(vetorAprovados, nAprovados);

    }
}
