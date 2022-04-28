package academico.modelo;

import java.util.Scanner;

public class Professor extends Pessoa{
    private String area;
    private String tipoContrato;
    
    public Professor (){
        this.ler();
    }
    
    @Override
    public void ler(){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("\n:: Professor Selecionado ::");
        super.ler();
        System.out.print("Area .............: ");
        this.area = scan.nextLine();
        System.out.print("Tipo de Contrato .: ");
        this.tipoContrato = scan.nextLine();
    }
    
    @Override
    public void apresentar(){
        System.out.println("\nProfessor ::");
        super.apresentar();        
        System.out.println("Area .............: " + this.area);
        System.out.println("Tipo de Contrato .: " + this.tipoContrato);
    }
}
