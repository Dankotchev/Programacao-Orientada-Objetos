package modelo.funcionarios;

import java.util.Scanner;

public class FuncionarioComum extends FuncionarioBase{
    private float salarioBase;
    
    @Override
    public void cad(){
        Scanner s = new Scanner(System.in);
        System.out.println("Funcionário Comum ::");
        super.cad();
        
        System.out.print("\tSalário Base ........: ");
        this.salarioBase = s.nextFloat();
    }
    
    @Override
    public float getSalarioBruto(){
        return this.salarioBase;
    }
    
    
}
