package academico.controle;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Gerenciador grn = new Gerenciador();
        Scanner scan = new Scanner(System.in);
        int opcao;
        
        do {
            System.out.println("");
            System.out.println("1 -\tCadastrar Aluno");
            System.out.println("2 -\tCadastrar Professor");
            System.out.println("3 -\tCadastrar Técnico Administrativo");
            System.out.println("4 -\tListar todas as pessoas da Universidade");
            System.out.println("0 -\tEncerrar Sistema");
            System.out.print("Escolha a opção: ");
            opcao = scan.nextInt();
            
            switch(opcao){
                case 1:
                    grn.alunoInserir();
                    break;
                    
                case 2:
                    grn.professorInserir();
                    break;
                    
                case 3:
                    grn.tecnicoAdmInserir();
                    break;
                    
                case 4:
                    grn.apresentarUniversidade();
                    break;
                    
                case 0:
                    System.out.println("\nEncerrando o Sistema");
                    break;
            }
            
        } while (opcao != 0);
    }
}
